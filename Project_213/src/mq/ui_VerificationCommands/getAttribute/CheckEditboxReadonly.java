package ui_VerificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckEditboxReadonly {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		WebElement email=null;
		try {
			email=driver.findElement(By.id("email"));
			email.sendKeys("Darshan");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Read input from editbox
		if(email!=null)
		{
			String Runtime_value=email.getAttribute("value");
			if(Runtime_value!=null)
				System.out.println("Editbox is not readonly");
			else
				System.out.println("editbox is read only");
		}
		else
			System.out.println("Element failed to identify");
		
	

	}

}
