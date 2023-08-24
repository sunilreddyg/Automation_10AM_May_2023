package stepdefination;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class GlobalHooks 
{
	@BeforeAll
	public static void beforeAll() 
	{
	    System.out.println("Setup Environment");
	}
	
	@AfterAll
	public static void afterAll() {
	    System.out.println("Tear Down environment");
	}
}
