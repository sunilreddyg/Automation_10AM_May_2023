package mq.selenium.interactions.mouse.Scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class ScrollFrom_Origin {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Location=driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));

		 WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(Location);
	     new Actions(driver)
	                .scrollFromOrigin(scrollOrigin, 0, 200)
	                .perform();
	     
	     //It is a combination of scrolltoelement and scrollbyammount

	}

}
