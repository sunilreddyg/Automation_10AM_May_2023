package framework.datadriven.excel.Testng;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_With_Excel 
{
	
	String Filepath="TestData\\InputData.xlsx";
	String sheetname="DP2";
	XSSFWorkbook book;
	XSSFSheet sht;
	
	@DataProvider
	public String[][] GetData() throws Exception
	{
		//Target Workbook and sheet
		FileInputStream fi=new FileInputStream(Filepath);
		book=new XSSFWorkbook(fi);
		sht=book.getSheet(sheetname);
		
		//Find data availability in numbers or rows and cells
		int Rcount=sht.getLastRowNum();
		int CellCount=sht.getRow(0).getLastCellNum();
		//Creating double dimesion String array
		String data[][]=new String[Rcount+1][CellCount];
		
		//Iterate for number or rows in excel
		for (int i = 0; i <= Rcount; i++) 
		{
			//Inner loop iterate for number of cells
			for (int j = 0; j < CellCount; j++) 
			{
				data[i][j]=sht.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		
		//returning double dimension array data to dataprovider method
		return data;
	}
	
	
	@Test(dataProvider="GetData",enabled=false)
	public void test(String name,String Degree,String mobile,String SID)
	{
		
	}
	
	@Test(dataProvider="GetData")
	public void test1(String fname,String sname,String email,String retypememail,String pass,String day,String month,String year)
	{
		
	}
}
