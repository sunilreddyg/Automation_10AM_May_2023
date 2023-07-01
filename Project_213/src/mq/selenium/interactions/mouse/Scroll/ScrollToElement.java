package mq.selenium.interactions.mouse.Scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Location=driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));
		new Actions(driver).scrollToElement(Location).perform();
		
		/*
		 * Note:--> It will bring your requried object
		 * 			to viewport.By defult your object presented
		 * 			at down side of the page
		 */
	}

}
