package objectidentification.link;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Link 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		

		driver.findElement(By.linkText("Locations")).click();
		
		driver.findElement(By.linkText("India")).click();
		
		driver.findElement(By.partialLinkText("Kolkata")).click();
		
		driver.findElement(By.partialLinkText("West Bengal")).click();
		
	}

}
