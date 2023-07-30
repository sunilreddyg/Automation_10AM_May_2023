package pageobjects.withPageFactory.testcases;

import org.openqa.selenium.WebDriver;

import pageobjects.withPageFactory.Keywords.Common_Reusable_actions;
import pageobjects.withPageFactory.Pages.HRM_Login;
import pageobjects.withPageFactory.Pages.MenuTabs;
import pageobjects.withPageFactory.Pages.PIM_AddEmployee;

public class Testfor_PIM 
{
	
	WebDriver driver;
	HRM_Login login;
	MenuTabs tabs;
	PIM_AddEmployee pim;
	Common_Reusable_actions actions;
	
	public Testfor_PIM(WebDriver driver) 
	{
		login=new HRM_Login(driver);
		tabs=new MenuTabs(driver);
		pim=new PIM_AddEmployee(driver);
		actions=new Common_Reusable_actions(driver);
	}
	
	public void AddEmployeeDetails()
	{
		login.Userlogin("Admin", "admin123");
		actions.ClickOnElement(tabs.pIM);
		actions.ClickOnElement(pim.addEmployee);
		actions.TypeText(pim.Firstname, "Raj");
		actions.TypeText(pim.MiddleName, "Kumar");
	}
	
	
	
	

}
