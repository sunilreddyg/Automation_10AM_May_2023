package webdrivermanager4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefox 
{

	public static void main(String[] args) {
		
		//Support WebdriverManger 4 Version
		//Manage browser drivers [Download,Mainatain,Setup]
		//WebDriverManager.chromedriver().setup();
		
		//LaunchChrome
		WebDriver driver=new ChromeDriver();
		//Using browser reference load webpage
		driver.get("http://google.com");
	}

}
