package mq.selenium.interactions.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		 WebElement textField = driver.findElement(By.name("firstname"));
	        new Actions(driver)
	                .sendKeys(textField, "Selenium!")
	                .pause(2000)
	                .keyDown(Keys.CONTROL)
	                .sendKeys("A")
	                .keyDown(Keys.CONTROL)
	                .sendKeys("C")
	                .sendKeys("X")
	                .pause(3000)
	               	.keyDown(Keys.CONTROL)
	                .sendKeys("V")
	                .perform();

	}

}
