package framework.datadriven.csvfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Read_CsvData_From_Scanner {

	public static void main(String[] args) throws IOException {
		
		//parsing a CSV file into Scanner class constructor  
		Scanner sc = new Scanner(new File("src\\framework\\datadriven\\csvfiles\\IP.csv"));  
		sc.useDelimiter(",");   //sets the delimiter pattern  
		
		while(sc.hasNext())
		{
			//find and returns the next complete token from this scanner 
			System.out.print(sc.next());
		}
	}

}
