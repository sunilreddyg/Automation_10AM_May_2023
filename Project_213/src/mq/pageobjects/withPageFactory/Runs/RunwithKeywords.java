
package pageobjects.withPageFactory.Runs;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.withPageFactory.Keywords.TestBase;
import pageobjects.withPageFactory.testcases.Testfor_PIM;

public class RunwithKeywords 
{
	TestBase base;
	Testfor_PIM pimtest;
	WebDriver driver;
	@Test
	public void test1()
	{
	    pimtest=new Testfor_PIM(driver);
		pimtest.AddEmployeeDetails();
	}
	@Before  //Method Run before test annotaion
	public void precondition()
	{
		base=new TestBase();
		base.SetupChrome();
		driver=base.driver;
	}

	
}
