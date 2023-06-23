package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearMethod 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@maxlength='10']"))
		.sendKeys("9030248855");
		
		Thread.sleep(8000);
		
		WebElement Operator=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Operator.click();
		new Actions(driver)
		.click(Operator)
		.keyDown(Keys.CONTROL)
		.sendKeys("A")
		.sendKeys(Keys.BACK_SPACE)
		.pause(2000)
		.sendKeys("JIO").perform();
		
		

		

	}

}
