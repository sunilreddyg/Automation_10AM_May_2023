package framework.datadriven.propertyfiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Read_Data_From_propertyFile 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location[We can target property file location using fileinputStream / FileReader]
		String filepath="src\\framework\\datadriven\\propertyfiles\\input.properties";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("File is Located");
		
		
		//Load all object to repository using load function
		Properties repository=new Properties();
		repository.load(fi);
		
		//Read value from repository using keyname
		String URL=repository.getProperty("application_url");
		System.out.println(URL);
		
		String UID=repository.getProperty("username");
		System.out.println(UID);
		
		String PWD=repository.getProperty("password");
		System.out.println(PWD);
		
		String Browser=repository.getProperty("browser");
		System.out.println(Browser);
		
		WebDriver driver=null;
		if(Browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(Browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.get(URL);
		
	}

}
