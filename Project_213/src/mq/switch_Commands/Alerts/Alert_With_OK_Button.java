package switch_Commands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_OK_Button 
{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	   // Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    
	   //Switch to alert and reading text at alert window
	    String Alertmsg=driver.switchTo().alert().getText();
	    System.out.println(Alertmsg);
	    
	    //Press OK button at alert
	    driver.switchTo().alert().accept();
	    
	    System.out.println("Run Continued");
	   
	    
	}

}
