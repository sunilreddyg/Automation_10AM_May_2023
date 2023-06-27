package mq.selenium.Dropdown.multiple;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionCommands {

	public static void main(String[] args) throws Exception
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
			System.out.println("Dropdown is multiple type selection");
			
			//Selecting more options under single dropdown
			Select Selection=new Select(dropdown);
			Selection.deselectAll();
			
			//Decision to check selection count is zero
			if(Selection.getAllSelectedOptions().size()==0)
			{
				System.out.println("Deselected all options");
				Selection.selectByIndex(1);
				Selection.selectByIndex(3);
					
					//Decision to check selection count is  more than one
					if(Selection.getAllSelectedOptions().size()>1)
					{
						System.out.println("More options are selected");
						//Deselect any single option
						Selection.deselectByIndex(3);
						
							//Decision to check selection count equals to one
							if(Selection.getAllSelectedOptions().size()==1)
								System.out.println("deselection working on dropdown");
							else
								System.out.println("Deselection Failed");
							
					}
					else
					{
						System.out.println("Only Single Option selected");
					}
			}
			else
			{
				System.out.println("Failed to deselect all options");
			}
			
		} 
		else 
		{
			System.out.println("Dropdown is not a multiple type selection box");
		}
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
