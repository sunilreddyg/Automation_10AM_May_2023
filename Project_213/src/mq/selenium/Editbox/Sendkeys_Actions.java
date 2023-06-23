package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Actions {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		//Perform TAB keys at Editboxes
		driver.findElement(By.name("firstname"))
		.sendKeys("Rajesh"+Keys.TAB
				+"Krishnan"+Keys.TAB
				+"9030248855"+Keys.TAB
				+"Hello@123");
		
		//Selecting dropdown option using sendkeys
		driver.findElement(By.id("day")).sendKeys("18");
		
		//selecting dropdown option using sendkeys
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);

		//selecting dropdown option using sendkeys
		driver.findElement(By.id("year")).sendKeys("1985");
		
		
		//Selecting radio button using Space shortcut
		driver.findElement(By.xpath("//input[@value='2']")).sendKeys(Keys.SPACE);
		
		//Press enter key to hit button
		driver.findElement(By.xpath("//button[@name='websubmit']")).sendKeys(Keys.ENTER);
		
		
		
		/*
		 * Note:-->
		 * 		To manage keyboard interaction webdriver had
		 * 		separate class called actions.
		 * 
		 * 		In Current Program Sendkeys is a void method so
		 * 		we can't password group of keys with time gap
		 * 
		 * 		And sendkeys allow keyboard short cut so that
		 * 		webdriver doesn't report on any failures..
		 */
		
	}

}
