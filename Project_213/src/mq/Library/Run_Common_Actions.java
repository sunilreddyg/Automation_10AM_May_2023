package common.Library;

import org.openqa.selenium.WebDriver;

public class Run_Common_Actions {

	public static void main(String[] args) 
	{
		CommonActions action=new CommonActions();
		action.LaunchBrowser("chrome");
		action.loadpage("http://facebook.com");
		
		WebDriver driver;
		driver=action.getDriver();
		System.out.println(driver.getTitle());
		
		action.sleep(3000);
		
		//Type text into editbox
		action.typetext("//input[@id='email']","Darshan");
		action.Sendtext_using_keybaord("//input[@id='pass']", "Admin");
		
		action.ClickElemnet("//a[@href='/reg/']");
		
		action.selectoptions("//select[@id='day']", "text", "23");
		action.selectoptions("//select[@id='month']", "value", "5");
		action.selectoptions("//select[@id='year']", "index", "20");
		action.CaptureScreen("Dropdown Options");
	}

}
