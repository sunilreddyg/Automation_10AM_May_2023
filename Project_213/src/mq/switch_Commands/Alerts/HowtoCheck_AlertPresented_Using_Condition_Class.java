package switch_Commands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HowtoCheck_AlertPresented_Using_Condition_Class {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    
	    if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
	    {
	    	System.out.println("Alert prsented at webpage");
	    	driver.switchTo().alert().accept();
	    }
	    else
	    {
	    	System.out.println("Alert is not presented at webpage");
	    }
	    

	}

}
