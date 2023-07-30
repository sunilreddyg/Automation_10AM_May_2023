package pageobjects.withPageFactory.testcases;

import org.openqa.selenium.WebDriver;

import pageobjects.withPageFactory.Pages.ContactDetails;
import pageobjects.withPageFactory.Pages.HRM_Login;
import pageobjects.withPageFactory.Pages.MenuTabs;
import pageobjects.withPageFactory.Pages.PersonalDetails;

public class Testfor_ContactDetails 
{
	WebDriver driver;
	HRM_Login login;
	MenuTabs menu;
	PersonalDetails pdetails;
	ContactDetails cdetails;
	
	public Testfor_ContactDetails(WebDriver driver) 
	{
		this.driver=driver;
		login=new HRM_Login(driver);
		menu=new MenuTabs(driver);
		pdetails=new PersonalDetails(driver);
		cdetails=new ContactDetails(driver);
	}
	
	
	public void AddContactdetails()
	{
		login.Userlogin("Admin", "admin123");
		menu.clickmyinfo();
		pdetails.clickcontactDetails();
		cdetails.enterstreet1details();
	}
	
	
	

}
