package pageobjects.withPageFactory.Runs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.withPageFactory.testcases.Testfor_ContactDetails;

public class RunFor_Contact 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		Testfor_ContactDetails test1=new Testfor_ContactDetails(driver);
		test1.AddContactdetails();
	}

}
