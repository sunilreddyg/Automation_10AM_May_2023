package mq.selenium.Dropdown.multiple;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckSelection_Count {

	public static void main(String[] args) throws Exception {
		
		
		/*
		 * Testcase:--> Verify dropdown allow more than one option selected
		 */
		
		
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
			Select Selection=new Select(dropdown);
			Selection.deselectAll();
			Selection.selectByIndex(1);
			Selection.selectByIndex(3);
			
			//Nested if condition to check selection count
			int Count=Selection.getAllSelectedOptions().size();
			if(Count > 1)   //Greaterthan is a boolean type it return ture/false
				System.out.println("More than one option selected");
			else
				System.out.println("Only Single option selected or no option selected");
			
			
		} 
		else 
		{
			System.out.println("Dropdown is not a multiple type selection box");
		}
		
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
