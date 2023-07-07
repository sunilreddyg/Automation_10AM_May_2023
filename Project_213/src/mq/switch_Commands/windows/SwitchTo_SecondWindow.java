package switch_Commands.windows;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_SecondWindow {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		//Capture Active browser window ID
		String CurrentWindowId=driver.getWindowHandle();
		System.out.println(CurrentWindowId);
		
		System.out.println("Befor switch--->  "+driver.getTitle());
		
		
		WebElement Instagram=driver.findElement(By.linkText("Instagram"));
		Instagram.click();
		Thread.sleep(10000);
		
		//Get All window ID's
		Set<String> AllWindowIds=driver.getWindowHandles();
		
		//Converting set String into iterators
		Iterator<String> itr=AllWindowIds.iterator();
		//Using iterator we can convert group of strings into independant tokes
		// so that we can pick each token using next keyword..
		
		//Read Each iterator using next keyword
		String window1=itr.next();
		String window2=itr.next();

		driver.switchTo().window(window2);
		
		System.out.println("After switch--->  "+driver.getTitle());
		
		WebElement UID=driver.findElement(By.name("username"));
		UID.sendKeys("9030248855");

		
		//Getback to Previous window
		driver.switchTo().window(window1);
		System.out.println("Homepage Title is ---> "+driver.getTitle());
		
	}

}
