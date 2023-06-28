package mq.selenium.interactions.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Zoom_button 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/zoom/image-magnifier-on-hover.html");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//Mouse and Keyboard interactions..
		WebElement Element=driver.findElement(By.xpath("//a[@title='Dynamic Image Zoom Plugin with Run Time Toggle - Hover-Zoom Extended']"));
	    
		new Actions(driver)
		.moveToElement(Element).pause(3000).click().perform();
		

	}

}
