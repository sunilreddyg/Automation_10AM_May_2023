package pageobjects.withPageFactory.Example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FbSignup 
{
	
	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement firstname;
	
	
	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement Surname;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	public WebElement email;
	
	@FindBy(xpath = "//select[@id='day']")
	public WebElement ddDate;
	
	public void enterfirstname(String name)
	{
		firstname.sendKeys(name);
	}

	public void enterSurname(String name)
	{
		Surname.sendKeys(name);
	}
	
	public void enteremail(String emailinput)
	{
		email.sendKeys(emailinput);
	}
	
	public void selectdate(String date)
	{
		new Select(ddDate).selectByVisibleText(date);
	}
	
	
}
