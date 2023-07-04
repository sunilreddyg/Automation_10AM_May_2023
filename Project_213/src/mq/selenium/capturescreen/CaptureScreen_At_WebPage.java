package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_At_WebPage
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//Capturing screen and converting into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //Create folder at any driver
		FileHandler.createDir(new File("Screens"));
		//Copy file to Folder
		FileHandler.copy(src, new File("Screens\\image.png"));
		
		
		/*
		 * PNG:--> Image Extension [Portable Network Graphic]
		 */
	}

}
