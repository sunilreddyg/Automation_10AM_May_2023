package mq.java.methods;


public class TestApp 
{
	//Reusable methods
	public void openbrowser() 
	{
		System.out.println("browser is up and ready to use");
	}
	
	//Reusable methods
	public void navigatetopage() 
	{
		System.out.println("page is loaded ready to use");
	}
	
	//Reusable methods
	public void EnterloginDetails()
	{
		System.out.println("Entry Login Successful");
	}
	
	//Reusable methods
	public void Singnoutpage()
	{
		System.out.println("User signout succesful");
	}
	
	//Reusable methods
	public void closebrowser()
	{
		System.out.println("Browser is closed");
	}

	//Runnable method
	public static void main(String[] args) 
	{
		new TestApp().openbrowser();
		new TestApp().navigatetopage();
		new TestApp().EnterloginDetails();
		new TestApp().Singnoutpage();
		new TestApp().closebrowser();
	}

}
