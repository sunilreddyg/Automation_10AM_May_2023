package mq.selenium.Dropdown.multiple;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Is_MultipleType {

	public static void main(String[] args) 
	{
		/*
		 * Testcase:--> Verify Dropdown is a multiple type
		 * 				and it allow group of options to select..
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://bridgeqsys.com/demo.php");
		driver.manage().window().maximize();
		
		
		WebElement SelectMenu=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		SelectMenu.click();
		
		
		WebElement dropdown1=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		boolean flag=new Select(dropdown1).isMultiple();
		System.out.println("Dropdown1 is multiple type?--> "+flag);
		
		WebElement dropdown2=driver.findElement(By.id("exampleFormControlSelect2"));
		boolean flag1=new Select(dropdown2).isMultiple();
		System.out.println("dropdown2 is multiple type?-->"+flag1);
		
		
		/*
		 * ismultiple:---->
		 * method usefull to find Dropdown selection state allow multiple
	   	 * 		or single option selection
		 * ismultiple is a boolean return type it return <<<true>>> on multiple 
	 	 * 		selection, and <<<false>>> on single option selection
		 */
	}

}
