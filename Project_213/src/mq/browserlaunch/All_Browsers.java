package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_Browsers {

	public static void main(String[] args) 
	{
		//launching chrome browser and storing into Webdriver Interface
		WebDriver driver=new FirefoxDriver();
		
		//Using Interface reference loading page to browser window
		driver.get("http://google.com");
		
		//Using Interface reference returning title from browser window
		System.out.println(driver.getTitle());
		
		//Using Webdriver interface closing browser window
		driver.close();
		
		
		/*
		 * Why WebDriver?..
		 * 		WebDriver is a Interface class designed to 
		 * 		automate all browser instances..
		 */
	}

}
