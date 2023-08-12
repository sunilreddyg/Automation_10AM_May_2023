package framework.datadriven.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateData_In_Excel {

	public static void main(String[] args) throws IOException {
		
		//target file location and converting into file format
		String filepath= ("TestData\\write.xlsx");
	    File file= new File(filepath);
	    
	    //Create Excel Binary file to location
	    FileOutputStream fos=new FileOutputStream(file);
	    
	    
	     //create the blank workbook
	     Workbook wb= new XSSFWorkbook();
	      
	      
	      //create the blank excel sheet
	      Sheet sh= wb.createSheet("Output");
	     
	      //define the position in the excel sheet where write operation needs to perform
	      Row rw= sh.createRow(4);
	      Cell cl=rw.createCell(1);
	    
	    

	       //define the data value
	       cl.setCellValue("sunil Reddy");
	        
	       
	       //write the workbook
	       wb.write(fos);

	}

}
