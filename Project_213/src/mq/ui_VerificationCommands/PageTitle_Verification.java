package ui_VerificationCommands;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageTitle_Verification {

	public static void main(String[] args) 
	{
		
		WebDriver driver=null;
		try {
			driver=new ChromeDriver();
		} catch (IllegalStateException e) {
			System.out.println("Chrome driver is failed and asking to define path");
			e.printStackTrace();
		}
		
		if(driver!=null)
		{
			try {
				driver.get("http://facebook.com");
				
			} catch (NoSuchSessionException e) {
				System.out.println("version is mimatched");
				e.printStackTrace();
				
			}catch (InvalidArgumentException e) {
				System.out.println("URL Format is mimatched");
				e.printStackTrace();
			}
				
		}
		
		
		//Decision to verify expected title presented at webpage
		String Exp_title="Facebook – log in or sign up";
		if(driver.getTitle().equalsIgnoreCase(Exp_title))
		{
			System.out.println("User available at facebook page");
		}
		else
		{
			System.out.println("Title mismatched");
		}
		
		
		
		
		
		
		
		

	}

}
