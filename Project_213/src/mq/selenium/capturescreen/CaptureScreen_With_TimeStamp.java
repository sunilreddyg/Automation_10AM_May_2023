package capturescreen;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_With_TimeStamp 
{

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		
		//Java time stamp
		
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-dd-MMM-EEE hh-mm-ss");
		Date d=new Date();   //Get System Date
		String time=sdf.format(d);  //using formatter convert current time
		
		
		//Capturing screen and converting into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("Screens\\image"+time+".png"));
		
		
		/*
		 * Simple date format
		 * yyyy -- 2023
		 * yy   -- 23
		 * MM   --07    [Month is digits]
		 * MMM  -- july [Method in characters]
		 * EEE  --Tuesday [Week in characters]
		 * hh   --01-24 hrs
		 * mm   --00-60 minutes
		 * ss   --00-60 seconds
		 * dd   --01-31 days
		 */

	}

}
