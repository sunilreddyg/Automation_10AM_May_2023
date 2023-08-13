package framework.datadriven.propertyfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_ProperyFiles_Data_Using_Keywords {

	public static void main(String[] args) 
	{
			
		
		WebDriver driver=new ChromeDriver();
		driver.get(Read_propertyFile.getProperty("application_url"));
	
	}

}
