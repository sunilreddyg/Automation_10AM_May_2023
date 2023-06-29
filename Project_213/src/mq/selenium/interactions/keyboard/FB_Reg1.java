package mq.selenium.interactions.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB_Reg1 {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		//Perform TAB keys at Editboxes
		driver.findElement(By.name("firstname"))
		.sendKeys("Rajesh"+Keys.TAB
				+"Krishnan"+Keys.TAB
				+"Rajesh@gmail.com"+Keys.TAB
				+"Rajesh@gmail.com"+Keys.TAB
				+"Hello@123");
		
		//Refresh page
		driver.navigate().refresh();
		
		WebElement firstname=driver.findElement(By.name("firstname"));
		new Actions(driver).sendKeys(firstname, "Rajesh")
		.sendKeys(Keys.TAB).sendKeys("Krishna").pause(1000)
		.sendKeys(Keys.TAB).sendKeys("Rajesh@gmail.com").pause(3000)
		.sendKeys(Keys.TAB).sendKeys("Rajesh@gmail.com").perform();

	}

}
