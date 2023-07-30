package pageobjects.withPageFactory.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class RunFor_SignupPage {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		FooterLinks footer=PageFactory.initElements(driver, FooterLinks.class);
		footer.clickSingupLink();
		
		FbSignup signup=PageFactory.initElements(driver, FbSignup.class);
		signup.enterfirstname("Raju");
		signup.enterSurname("Kumar");
		signup.enteremail("Raj@gmail.com");
		signup.selectdate("23");
		
		/*
		 * Note:--> To identify object using @findby annotation
		 * 			we must use pageFactory Class
		 */

	}

}
