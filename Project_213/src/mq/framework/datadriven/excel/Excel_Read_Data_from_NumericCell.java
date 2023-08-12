package framework.datadriven.excel;

import java.io.FileInputStream;

import java.io.IOException;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Data_from_NumericCell {

	public static void main(String[] args) throws IOException {
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Create object for excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above book
		XSSFSheet sht=book.getSheet("TypesofData");
		
		//get row using sheet reference
		XSSFRow row=sht.getRow(1);
		
		//Get Numeric Cell value
		double PrdocutID=row.getCell(0).getNumericCellValue();
		System.out.println(PrdocutID);
		
		//Convert numeric value into string
		String str_productid=NumberToTextConverter.toText(PrdocutID);
		System.out.println("Product in String format is --. "+str_productid);
		
		//How to Convert Double to Interger
		Double dble=new Double(PrdocutID);
		System.out.println(dble.intValue());
		
		
		//Reading Decimal value from cell
		double price=row.getCell(2).getNumericCellValue();
		System.out.println(price);
		//By default cell return double format
		
		/*
		 * Simple hack to convert Numercell into String cell
		 * 	= In Excel cell add single quote befre number and save it
		 * 			'100
		 * => Single quote convert numeric cell to text format
		 */
		String Config=row.getCell(5).getStringCellValue();
		System.out.println(Config);
		
	}

}
