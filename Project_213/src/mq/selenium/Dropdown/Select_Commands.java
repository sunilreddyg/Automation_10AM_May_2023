package mq.selenium.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Commands 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Selecting dropdown option using Option Name
		new Select(driver.findElement(By.id("day")))
		.selectByVisibleText("16");
		
		//Selecting dropdown option using value property
		new Select(driver.findElement(By.id("month")))
		.selectByValue("8");
		
		//selecting dropdown option using option tag index number under select tag
		new Select(driver.findElement(By.id("year")))
		.selectByIndex(10);
	}

}
