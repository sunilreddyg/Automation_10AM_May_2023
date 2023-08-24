package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Read_DataSet_Values 
{
	@Given("User is on Home Page1")
	public void user_is_on_home_page1() 
	{
	    System.out.println("user At Homepage");
	}
	@When("User Navigate to LogIn Page1")
	public void user_navigate_to_log_in_page1() 
	{
	   System.out.println("User at login page");
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) 
	{
	   System.out.println(string+"    "+string2);
	}
	@Then("Close Test Here")
	public void close_test_here() 
	{
	    System.out.println("Test is Closed");
	}


}
