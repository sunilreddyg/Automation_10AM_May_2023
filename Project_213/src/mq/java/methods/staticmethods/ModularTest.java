package mq.java.methods.staticmethods;

public class ModularTest 
{
	
	/*
	 * What is ModularFramework:-->
	 * 		Programmer create  every individual function
	 * 		in separate method and then call group of
	 * 		methods in one integrated method.
	 * 
	 * 	Modular is a reusable framework instead of 
	 *  repeating functions we will reuse it..
	 */
	
	
	public void openBrowser()
	{
		System.out.println("browser is up");
	}
	
	public void loadpage()
	{
		System.out.println("page load completed");
	}
	
	public void setup()
	{
		openBrowser();
		loadpage();
	}
	
	public void enterusenrame()
	{
		System.out.println("username entry done");
	}
	
	public void enterpassowrd()
	{
		System.out.println("password entry done");
	}
	

	public void clickloginbutton()
	{
		System.out.println("loginbuttonclicked");
	}
	
	public void userlogin()
	{
		enterusenrame();
		enterpassowrd();
		clickloginbutton();
	}
	
	public  void preconditions()
	{
		setup();
		userlogin();
	}
	
	
	public static void main(String[] args) 
	{
		new ModularTest().preconditions();

	}

}
