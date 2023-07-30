package pageobjects.withPageFactory.Example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBLogin 
{
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='pass']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@data-testid='royal_login_button']")
	public WebElement LoginButton;
	
	

	
	public void enterusername(String uid)
	{
		username.sendKeys(uid);
	}
	
	public void enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLoginbutton()
	{
		LoginButton.click();
	}
	
	
	public void userlogin(String uid,String pwd)
	{
		enterusername(uid);
		enterpassword(pwd);
		clickLoginbutton();
	}
	
}
