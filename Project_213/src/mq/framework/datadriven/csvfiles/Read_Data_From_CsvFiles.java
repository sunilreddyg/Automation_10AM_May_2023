package framework.datadriven.csvfiles;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Read_Data_From_CsvFiles {

	public static void main(String[] args) throws IOException {
		
		//Target file location
		FileReader fr=new FileReader("src\\framework\\datadriven\\csvfiles\\IP.csv");
		System.out.println("File is Located");
		
		//Create object for csvreader
		CSVReader reader=new CSVReader(fr);
		
		//Readnext method read first record and store into array format
		String Rec1[]=reader.readNext();
		System.out.println(Rec1[0]+"      "+Rec1[1]);

		String Rec2[]=reader.readNext();
		System.out.println(Rec2[0]+"      "+Rec2[1]);
		
		
		//Reading all data using conditional loop
		String records[];
		while((records=reader.readNext())!=null)
		{
			System.out.println(records[0]+"   "+records[1]);
		}
		
		
	}

}
