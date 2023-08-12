package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_StringData_From_MultipleRows {

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Get existing book using Xssfworkbook class
		XSSFWorkbook book=new XSSFWorkbook(fi);
				
		//Get sheet using book reference
		XSSFSheet sht=book.getSheet("multipledata");
		
		
		
		//Get Count for number of rows having data
		int Lastrow=sht.getLastRowNum();
		
		//Using for loop iterate for number of rows
		for (int i = 1; i <= Lastrow; i++) 
		{
				String UID=sht.getRow(i).getCell(0).getStringCellValue();
				String PWD=sht.getRow(i).getCell(1).getStringCellValue();
				System.out.println(UID+"  "+PWD);
		}
		
		

		
	}

}
