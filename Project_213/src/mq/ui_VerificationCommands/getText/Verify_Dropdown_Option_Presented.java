package ui_VerificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Option_Presented {

	public static void main(String[] args) throws Exception {
		

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Selecting Dropdown option
		new Select(driver.findElement(By.xpath("//select[@id='customState']")))
		.selectByVisibleText("Telangana");
		Thread.sleep(4000);
		
		boolean flag=false;
		try {
			//Identify City Dropdown location
			WebElement CityDropdown=driver.findElement(By.xpath("//select[@id='customCity']"));
			new Select(CityDropdown).selectByVisibleText("Hyderabad");
			//Incase option not presented it throws NoSuchElementException
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Dropdown Selection Status is -->"+flag);
		
		if(flag==true)
		{
			System.out.println("Dropdown contains required city name");
		}
		else
		{
			System.out.println("Drodown not contain requried city name");
		}
	}

}
