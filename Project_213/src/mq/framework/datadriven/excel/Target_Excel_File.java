package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;

public class Target_Excel_File 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Located Excel file from local system
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		

	}

}
