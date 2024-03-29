package pageobjects.withPageFactory.Testcases;

import org.openqa.selenium.WebDriver;

import pageobjects.withPageFactory.Pages.HRM_Login;
import pageobjects.withPageFactory.Pages.MenuTabs;
import pageobjects.withPageFactory.Pages.RecruitementPage;

public class ReCruite_Testcases 
{
	WebDriver driver;
	HRM_Login login;
	MenuTabs tabs;
	RecruitementPage recruite;
	
	public ReCruite_Testcases(WebDriver driver)
	{
		this.driver=driver;
		login=new HRM_Login(driver);
		tabs=new MenuTabs(driver);
		recruite=new RecruitementPage(driver);
		
	}
	
	public void statictime(long ms)
	{
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void AddCandidate()
	{
		login.Userlogin("Admin", "admin123");
		tabs.ClickrecruitmentTab();
		statictime(4000);
		recruite.AddCandidate("Arjun", "Reddy", "Devara", "Dev@gmail.com", "90302");
	}
	

}
