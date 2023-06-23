package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Default_Clear_Method {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("AAAAA");
		
		Thread.sleep(4000);
		driver.findElement(By.id("email")).clear();
		//Clear method only work on native editboxes..
		
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("Sunil");
		
		
		/*
		 * Note:--> Don't use clear method except editboxes
		 * 			otherwise receive webdriver exception
		 * 			"The Element is not clear type"
		 */
	}

}
