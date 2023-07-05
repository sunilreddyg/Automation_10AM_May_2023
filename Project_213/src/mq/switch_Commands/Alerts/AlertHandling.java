package switch_Commands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Question:--> How to handle survival popups
		 * 		[Any alert without notice it prompt at webpage]
		 */
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    try {
			driver.switchTo().alert().accept();
			System.out.println("Alert is Presented and pressed ok button");
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    
	    System.out.println("Run Continued");
	    
	    
		
		

	}

}
