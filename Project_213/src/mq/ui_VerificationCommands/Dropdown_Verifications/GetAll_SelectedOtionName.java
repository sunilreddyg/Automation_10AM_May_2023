package ui_VerificationCommands.Dropdown_Verifications;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAll_SelectedOtionName {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://bridgeqsys.com/demo.php");
		driver.manage().window().maximize();
		
		
		WebElement SelectMenu=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		SelectMenu.click();
		
		WebElement dropdown=driver.findElement(By.id("exampleFormControlSelect2"));
		boolean flag=new Select(dropdown).isMultiple();
		System.out.println("dropdown2 is multiple type?-->"+flag);
		
		
		//Decision statement to excute programs on multiple type selection
		if (flag)     //if only accept boolan value
		{
			//Selecting more options under single dropdown
			new Select(dropdown).deselectAll();    //This method only execute on multiple selection type objects.
			new Select(dropdown).selectByIndex(2);
			new Select(dropdown).selectByIndex(3);
			
			//Method get Only selected Options from multiple selection dropdown
			List<WebElement> AllElements=new Select(dropdown).getAllSelectedOptions();
			for (WebElement EachElement : AllElements) 
			{
					if(EachElement.getText().equals("India"))
						System.out.println("India option available");
					else if(EachElement.getText().contains("Aus"))
						System.out.println("Australia option available");
					else
						System.out.println("Option Not Selected");
			}
			
			
		} 
		else 
		{
			System.out.println("Dropdown is not a multiple type selection box");
		}

	}

}
