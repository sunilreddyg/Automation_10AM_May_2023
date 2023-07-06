package switch_Commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame_Using_IndexNumber {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/bushire/mytrips");
		driver.manage().window().maximize();
		
		//Swicht to frame using index number
		driver.switchTo().frame(0);
		
		WebElement Mobile=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		Mobile.sendKeys("90302488855");
		

	}

}
