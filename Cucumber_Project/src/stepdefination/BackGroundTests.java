package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGroundTests 
{
	
	@Given("Navigating to Page")
	public void navigating_to_page() 
	{
	    System.out.println("user at homepage");
	}
	@When("book1 is selected")
	public void book1_is_selected() {
	   System.out.println("Book1 is selected");
	}
	@Then("Check Author of book is {string}")
	public void check_author_of_book_is(String string) {
	    if(string.equals("Sam"))
	    	System.out.println("Author is matched");
	    else
	    	System.out.println("Author name is mismatched");
	}
	
	@When("book2 is selected")
	public void book2_is_selected() 
	{
		System.out.println("Book3 is selected");
	}
	
	
	@Then("Check Author of book2 is {string}")
	public void check_author_of_book2_is(String string) 
	{
		 System.out.println(string);
	}
	
	
	@When("book3 is selected")
	public void book3_is_selected() 
	{
	 System.out.println("Book3 is selected");
	}
	
	@Then("Check Author of book3 is {string}")
	public void check_author_of_book3_is(String string) {
	   System.out.println(string);
	}

}
