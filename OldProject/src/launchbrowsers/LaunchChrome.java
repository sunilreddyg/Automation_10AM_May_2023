package launchbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome 
{

	public static void main(String[] args) 
	{
		
		/*
		 * 
		 * 
		 * Download chromedriver.exe file
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down page until find Browsers
		 * 		=> Click Browsers Tab to see list of browser drivers
		 * 		=> Under chrome click on documentation link
		 * 		=> Find chrome browser version and download chromeDriver
		 * 				w.r.t chrome browser version
		 * 				Chrome Browser =>  106.0
		 * 				Chrome Driver  =>  106.0
		 * 		=> Click on ChromeDriver version [It navigate to Index page]
		 * 		=> Downlaod Zip format file w.r.t Operating Systems
		 * 		=> Unzip file to backup folder 
		 * 		=> with this action [You receive chromedriver.exe file]
		 * 		=> either set up environment variabe for chromedriver.exe
		 * 			file at system variables or set up runtime environment
		 * 			variable..
		 */
		
		//Setting Runtime environment variable to chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Using Interface reference loading page to browser window
		driver.get("http://google.com");
		
		//Using Interface reference returning title from browser window
		System.out.println(driver.getTitle());
		
		//Using Webdriver interface closing browser window
		driver.close();
				

	}

}
