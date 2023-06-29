package mq.selenium.interactions.mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Drag_Elementsto_Target {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfc.com/home-loan-emi-calculator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		/*
		 * To release all currently depressed keys and pointer buttons
		 */
		 ((RemoteWebDriver) driver).resetInputState();
		 
		WebElement Slider2=driver.findElement(By.xpath("(//div[contains(@class,'handle')])[2]"));
		new Actions(driver).dragAndDropBy(Slider2, -200, 0).perform();
		
		

		
	}

}
