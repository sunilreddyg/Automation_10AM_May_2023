package otherpackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import mq.java.methods.staticmethods.NativeInputs;

public class CallingOtherPackage_Classes {

	public static void main(String[] args) 
	{
		
		/*
		 * Rule1:--> only public modifier classes we can
		 * 			call outside the package..
		 * 
		 * Rule2:--> 
		 * 			Inorder to call or reuse other package
		 * 			classes and methods,variables we should
		 * 			import package to current constructed class.
		 */
		
		NativeInputs.keyboard();
		
		
		 WebDriver driver = new ChromeDriver();
         driver.get("https://www.example.com");
         driver.quit();
		
	}

}
