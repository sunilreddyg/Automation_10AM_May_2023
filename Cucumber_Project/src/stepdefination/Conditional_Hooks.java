package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Conditional_Hooks 
{
	
	//@After
	public void doSomethingAfter(Scenario scenario)
	{
		System.out.println("Capture Screen");
	}
	
	

	@After("@valid and not @invalid")
	public void SomethingAfter(Scenario scenario)
	{
		System.out.println("Capture screen");
	}

}
