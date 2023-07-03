package robot_java_AutomationTool;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_browser_Popup {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hdfc.com/home-loan-emi-calculator");
		driver.manage().window().maximize();
		
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		
		//Move mouse pointer to required locatio using  x and y cooridinates
		robot.mouseMove(304, 164);
		
		//Press Down mouse key and Release it..
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		
		/*
		 * Sample Website
		 * https://the-internet.herokuapp.com/
		 */

	}

}
