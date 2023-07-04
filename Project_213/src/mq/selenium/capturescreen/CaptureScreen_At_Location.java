package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_At_Location {

	public static void main(String[] args) throws IOException, Exception 
	{
		
		//It works on only selenium 4 and above versions
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://bridgeqsys.com/demo.php");
		Thread.sleep(5000);
		
		//Capture Screen of Single Element
		WebElement Elements=driver.findElement(By.id("v-pills-home-tab"));
		File src=Elements.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("Screens\\Elemtns.png"));
		
		//Capture Screen at Group elements
		WebElement AllTabs=driver.findElement(By.xpath("//div[@id='v-pills-tab']"));
		File srcfile=AllTabs.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcfile, new File("Screens\\AllTabs.png"));
		
	}

}
