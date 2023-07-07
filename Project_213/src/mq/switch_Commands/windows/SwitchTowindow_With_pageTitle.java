package switch_Commands.windows;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTowindow_With_pageTitle 
{

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    //Get Current Focused window id
	    String MainWindowID=driver.getWindowHandle();
	    System.out.println(MainWindowID);
	    
	    //External Link --. Open Page at new window /TAB
	    WebElement Instagram=driver.findElement(By.linkText("Instagram"));
	    Instagram.click();
	    
	    //External Link --. Open Page at new window /TAB
	    WebElement MetaPay=driver.findElement(By.linkText("Meta Pay"));
	    MetaPay.click();
	    
	    //Get All Window IDs
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    
	    //Iterate for number of windows opened and read each window it from collection to string
		for (String EachWindowID : AllWindowIDS) 
		{
			//Switch to each window and read each window title at inside loop
			String WindowTitle=driver.switchTo().window(EachWindowID).getTitle();
			
			//Get inside when requried title is matching
			if(WindowTitle.equalsIgnoreCase("Instagram"))
			{
				break; //It break looping when condition match
			}
		}
		
		System.out.println(driver.getTitle());
		
		
		//switch control back to main window id
		driver.switchTo().window(MainWindowID);
		System.out.println("Current Focused window id is --> "+driver.getTitle());
	}

}
