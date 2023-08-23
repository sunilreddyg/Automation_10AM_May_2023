package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckParameters 
{
	
	@Given("load hrm webpage {string}")
	public void load_hrm_webpage(String string) 
	{
	    System.out.println("Url is --> "+string);
	}
	@When("user enter valid username {string}")
	public void user_enter_valid_username(String string) 
	{
	    System.out.println("Username is :-->"+string);
	}
	@When("user enter valid password {string}")
	public void user_enter_valid_password(String string) 
	{
	    System.out.println("Password is --> "+string);
	}
	@Then("Verify Header displayed {string}")
	public void verify_header_displayed(String string) 
	{
	    System.out.println("Header Displayed --> "+string);
	}
	
	@Then("Verify Total Price")
	public void verify_total_price() 
	{
		System.out.println("Total Price");
	}

}
