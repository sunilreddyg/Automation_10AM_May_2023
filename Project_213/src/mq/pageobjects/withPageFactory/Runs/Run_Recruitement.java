package pageobjects.withPageFactory.Runs;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.withPageFactory.Pages.HRM_Login;
import pageobjects.withPageFactory.Pages.MenuTabs;
import pageobjects.withPageFactory.Pages.RecruitementPage;
import pageobjects.withPageFactory.Testcases.ReCruite_Testcases;

public class Run_Recruitement 
{
	
	WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	
	@Before  //Run Before Each Test
	public void BeforeTest()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void Tc001_AddCandidate()
	{
		ReCruite_Testcases tests=new ReCruite_Testcases(driver);
		tests.AddCandidate();
	}
	
	

}
