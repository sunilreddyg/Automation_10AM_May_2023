package ui_VerificationCommands.Dropdown_Verifications;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsCount {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
	
		//Get All dropdown options and get option count.
		WebElement DOB_month=driver.findElement(By.xpath("//select[@id='month']"));
		List<WebElement> Months=new Select(DOB_month).getOptions();
		if(Months.size() ==12)
			System.out.println("Count match");
		else
			System.out.println("Count mismatch");
	}

}
