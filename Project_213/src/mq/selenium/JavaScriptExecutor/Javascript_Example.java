package mq.selenium.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Example 
{
	static WebDriver driver;
	
	public static void cleartextFromEditField(String Xpath)
	{
		WebElement Date=driver.findElement(By.xpath(Xpath));
		((JavascriptExecutor)driver).executeScript("argumetns[0].value=''", Date);
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		//Get Javascript executor at automatio browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		WebElement Date=driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
		js.executeScript("arguments[0].value=''", Date);
		Thread.sleep(5000);
		js.executeScript("arguments[0].value='27/07/2023'", Date);
	}

}
