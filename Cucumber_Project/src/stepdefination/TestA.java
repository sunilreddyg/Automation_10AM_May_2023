package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestA 
{
	
	@Given("enter facebook url")
	public void enter_facebook_url() 
	{
	   System.out.println("Url loaded");
	}
	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() 
	{
	    System.out.println("Valid username and password entry completed");
	}
	@When("click on login button")
	public void click_on_login_button() 
	{
	    System.out.println("login button clicked");
	}
	@Then("verify Logout feature displayed")
	public void verify_logout_feature_displayed() 
	{
	   System.out.println("Logout feature verified");
	}
	
	@When("user ener invalid username and passowrd")
	public void user_ener_invalid_username_and_passowrd() 
	{
	   System.out.println("invalid Email and passwod entered");
	}
	@Then("verify email field exist")
	public void verify_email_field_exist() {
	    System.out.println("Email Field is exist");
	}

}
