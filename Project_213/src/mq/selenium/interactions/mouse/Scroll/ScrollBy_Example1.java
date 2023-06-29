package mq.selenium.interactions.mouse.Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollBy_Example1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		
		WebElement All=driver.findElement(By.xpath("//span[contains(.,'All')]"));
		int ObjY=All.getRect().y;
		new Actions(driver).scrollByAmount(0, ObjY).perform();
		
		

	}

}
