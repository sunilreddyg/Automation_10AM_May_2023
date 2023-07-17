package ui_VerificationCommands.getCssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class GetStyles 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Selenium 4 have this feature
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Object=driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]"));
		
		//Read Text Color Displayed
		String ActBGColor=Object.getCssValue("background-color");
		System.out.println("BGColor Displayed is RGBA --> "+ActBGColor);
		
		
		String Exp_ColoInHEX="#ff7b1d";
		
		//By default selenium read color in RGBA format
		//Converting RGBA color int HEX format
		Color Base=Color.fromString(ActBGColor);
		String Act_Color_inHEX=Base.asHex();
		
		if(Exp_ColoInHEX.equals(Act_Color_inHEX))
			System.out.println("Color matched");
		else
			System.out.println("Color mismatched");
		
		
		/*
		 * https://www.selenium.dev/documentation/webdriver/support_features/colors/
		 */
	}

}
