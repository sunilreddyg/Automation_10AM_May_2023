package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_With_keyboard_Shortcuts {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
	
		
		//Clicking Singn button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		
		driver.findElement(By.name("loginfmt"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("passwd"))
		.sendKeys("Admin@123"+Keys.ENTER);

	}

}
