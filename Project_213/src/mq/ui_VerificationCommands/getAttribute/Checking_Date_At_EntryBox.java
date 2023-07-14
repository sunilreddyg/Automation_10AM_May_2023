package ui_VerificationCommands.getAttribute;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking_Date_At_EntryBox {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement DateElement=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		String Act_Date=DateElement.getAttribute("value");
		
		//Get Current System date
		Date d=new Date();
		//Create simpel date format
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		//Converted date using simple date formatter
		String Exp_Date=sdf.format(d);
		
		if(Exp_Date.equals(Act_Date))
			System.out.println("Date is matching");
		else
			System.out.println("Date is mismatched");
		
	}

}
