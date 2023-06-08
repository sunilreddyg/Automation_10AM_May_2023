package mq.java.methods.staticmethods;

public class NativeInputs 
{

	//reusable static method
	public static void mouse() 
	{
		System.out.println("mouse is working");
	}
	
	//reusable static method
	public static void keyboard() 
	{
		System.out.println("Keyboard is working");
	}
	
	//reusable static method
	public static void touch()
	{
		System.out.println("touch is working");
	}
	
	//reusable instance method
	public void voice() 
	{
		System.out.println("Voice active");
	}
	
	
	public static void main(String[] args) 
	{
		//Calling static methods with in class from main method
		mouse();
		keyboard();
		touch();
		
		//Calling instant method
		//Because main method contains static specifier
		//We can't call instant method directly
		//We can call only with help of class instance [Constructor]
		new NativeInputs().voice();
	}

}
