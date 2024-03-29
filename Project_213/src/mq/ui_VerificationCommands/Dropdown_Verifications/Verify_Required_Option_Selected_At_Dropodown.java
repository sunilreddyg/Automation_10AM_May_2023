package ui_VerificationCommands.Dropdown_Verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Required_Option_Selected_At_Dropodown {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:-->
		 * 		Given site address "http://facebook.com/reg"
		 * 		Then verify Current Mon populated at DOM month dropdown
		 */
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		WebElement DOB_month=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement SelectedOption=new Select(DOB_month).getFirstSelectedOption();
		
		String Optionname=SelectedOption.getText();
		if(Optionname.equals("Jul"))
			System.out.println("Testpass");
		else
			System.out.println("Testfail");
		

	}

}
