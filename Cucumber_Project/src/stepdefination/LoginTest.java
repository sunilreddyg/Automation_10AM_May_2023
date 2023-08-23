package stepdefination;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest
{
	WebDriver driver;
	
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@Given("open hrm page")
	public void open_hrm_page() 
	{
		driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@When("user enter valid username")
	public void user_enter_valid_username() 
	{
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	}
	@When("user enter valid password")
	public void user_enter_valid_password() 
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}
	@When("click the login button")
	public void click_the_login_button()
	{
	    driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
	}
	@Then("Verify hrm login is successful")
	public void verify_hrm_login_is_successful()
	{
	   WebElement Dashbaord=driver.findElement(By.xpath("//h6[contains(.,'Dashboard')]"));
	   if(Dashbaord.isDisplayed())
		   System.out.println("Testpass");
	   else
		   System.out.println("Testfail");
	}


}
