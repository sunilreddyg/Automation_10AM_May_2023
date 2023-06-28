package mq.selenium.interactions.mouse;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement JobsMenu=driver.findElement(By.xpath("//a[@title='Search Jobs']"));
		new Actions(driver).moveToElement(JobsMenu).perform();
		
		WebElement CreateNewJob=driver.findElement(By.xpath("(//div[contains(.,'Create free job alert')])[5]"));
		new Actions(driver).click(CreateNewJob).perform();
		
		
		
		
	}

}
