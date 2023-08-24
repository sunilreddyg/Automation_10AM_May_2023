package stepdefination;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Read_DatableData 
{
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() 
	{
	   System.out.println("Home page is up");
	}
	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
	   System.out.println("login page displayed");
	}
	@When("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in(io.cucumber.datatable.DataTable dataTable) 
	{
		//Get method target cell using indexnumber
		String UID=dataTable.row(6).get(0);
		String PWD=dataTable.row(6).get(1);
		System.out.println(UID+"  "+PWD);
		
		//Converting datatable into list<List<string>>
		 for (List<String> row : dataTable.asLists()) 
		 {
			   String Username=row.get(0);
			   String Password=row.get(1);
			   System.out.println(Username+"  "+Password);
		 }
		
	}
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() 
	{
	   System.out.println("Test Completed");
	}

}
