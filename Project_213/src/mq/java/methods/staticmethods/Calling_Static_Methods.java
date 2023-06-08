package mq.java.methods.staticmethods;

public class Calling_Static_Methods 
{

	public static void main(String[] args) 
	{
		
		//Calling static methods from different class
		NativeInputs.mouse();
		NativeInputs.keyboard();
		NativeInputs.touch();
		
		//Calling instant method from different class
		new NativeInputs().voice();

	}

}
