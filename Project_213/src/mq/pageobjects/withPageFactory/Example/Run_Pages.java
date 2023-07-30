package pageobjects.withPageFactory.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_Pages 
{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		FBLogin login=PageFactory.initElements(driver, FBLogin.class);
		if(login.username.isDisplayed())
		{
			login.enterusername("Admin");
		}
		
		//Clear Text
		login.username.clear();
		Thread.sleep(5000);
		
		
		login.userlogin("Darshan", "Darsh@123");
		
		
		
		
		
	}

}
