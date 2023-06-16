package webdrivermanager5;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	public static void main(String[] args) 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://rediffmail.com");
		System.out.println(driver.getTitle());
		
		/*
		 * avoidShutdownHook:-->
		 * 			Method keep browser open instead of closing it.
		 * 			Because webdrivermanager 5 close it shutdown browser after
		 * 			completion of automation code
		 * Create:-->
		 * 			It opens browser 
		 * 			Not need to write  new ChromeDriver();
		 * get:-->
		 * 		   It load webpage to browser window
		 */
	}

}
