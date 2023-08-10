package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel_File {

	public static void main(String[] args) throws IOException 
	{
		//Located Excel file from local system
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get existing book using Xssfworkbook class
		XSSFWorkbook book=new XSSFWorkbook(fi);
				
		//Get sheet using book reference
		XSSFSheet sht=book.getSheet("config");
		
		//using sheet reference target row
		XSSFRow row=sht.getRow(1);
		
		//Using row reference target cell
		XSSFCell cell=row.getCell(0);
		
		//Reading String data from cell
		String Browsername=cell.getStringCellValue();
		System.out.println(Browsername);
		
		
		//using sheet,row,cell reading data from excel
		String URL=sht.getRow(1).getCell(1).getStringCellValue();
		System.out.println(URL);
		
		//using row reference reading data from cell
		String os=row.getCell(2).getStringCellValue();
		System.out.println(os);

	}

}
