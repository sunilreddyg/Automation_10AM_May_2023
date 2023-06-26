package mq.selenium.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Using_Click_method {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		//First Identify select tag element
		WebElement DOB_Day=driver.findElement(By.id("day"));
		//identify option tag element and perform click method on it
		DOB_Day.findElement(By.xpath("//option[@value='16']")).click();
		
		//Selecting Month option using click method
		driver.findElement(By.id("month"))								
		.findElement(By.xpath("//option[contains(.,'Aug')]")).click();
		
		
		//Get Option Tag Xpath instead of identifying under select tag
		driver.findElement(By.xpath("//option[@value='2016']")).click();
		
		
	}

}
