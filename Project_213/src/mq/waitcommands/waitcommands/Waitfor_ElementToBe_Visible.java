package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_ElementToBe_Visible 
{

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		
		//Create object for Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated
					(By.name("username"))).sendKeys("admin");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
