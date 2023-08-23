package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CheckProduct 
{
	@Given("enter name of product {string}")
	public void enter_name_of_product(String string) {
	    System.out.println(string);
	}
	@Given("enter product quantity {int}")
	public void enter_product_quantity(Integer int1) {
	   System.out.println(int1);
	}
	@Given("Verify total product price is {double}")
	public void verify_total_product_price_is(Double double1) {
	    System.out.println(double1);
	}
	@Then("Verify product status is true")
	public void verify_product_status_is_true() {
	    System.out.println("Verified");
	}
	
	@Given("Verify before price is {double} and after price is {double}")
	public void verify_before_price_is_and_after_price_is(Double double1, Double double2) 
	{
	  if(double1 < double2)
		  System.out.println("New price is greaterthan oldprice");
	  else
		  System.out.println("New price is lesserthan oldprice");
	}
	

}
