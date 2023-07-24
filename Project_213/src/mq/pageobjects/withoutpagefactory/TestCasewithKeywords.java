package pageobjects.withoutpagefactory;

import org.openqa.selenium.WebDriver;

public class TestCasewithKeywords 
{
	
	WebDriver driver;
	TestBase base;
	PageObject_keywords key;
	public TestCasewithKeywords() 
	{
		base=new TestBase();
		base.SetupChrome();
		base.Account_login();
		driver=base.driver;
		key=new PageObject_keywords(driver);
	}
	
	
	public void Add_recruitment()
	{
		key.ClickElemnet(Recruitment.Tab_recruitment);
		key.ClickElemnet(Recruitment.Add_button);
		key.typetext(Recruitment.Firstname, "User1");
	}
	
	public static void main(String args[])
	{
		TestCasewithKeywords tests=new TestCasewithKeywords();
		tests.Add_recruitment();
	}

}
