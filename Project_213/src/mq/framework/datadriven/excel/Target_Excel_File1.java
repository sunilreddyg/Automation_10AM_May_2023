package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Target_Excel_File1 {

	public static void main(String[] args) {
		
		
		FileInputStream fi;
		try {
			//Located Excel file from local system
			fi=new FileInputStream("TestData\\InputData.xlsx");
			System.out.println("File located");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
