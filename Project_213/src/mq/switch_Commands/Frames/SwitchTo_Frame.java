package switch_Commands.Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement FrameLocation=driver.findElement(By.xpath("//iframe[contains(@class,'demo-frame')]"));
		driver.switchTo().frame(FrameLocation);
		
		//Identifying element under frame
		WebElement Editbox=driver.findElement(By.cssSelector("input[id='tags']"));
		Editbox.sendKeys("Java");
		
		//Switch controls back to main page
		driver.switchTo().defaultContent();
		
		WebElement Demos=driver.findElement(By.xpath("//a[@href='https://jqueryui.com/demos/']"));
		Demos.click();

	}

}
