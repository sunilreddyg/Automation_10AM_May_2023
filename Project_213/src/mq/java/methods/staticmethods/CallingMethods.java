package mq.java.methods.staticmethods;

public class CallingMethods 
{
	//Instance method
	public void test1()
	{
		test3(); //With in class any instant method can call without object creation	
		test2(); //Static methods can call any where At instance methods or Static methods
	}
	
	//Static or Class method
	public static void test2()
	{
		//Any instant method to call with in static method
		//Can call with help of object creation
		new CallingMethods().test1();
		new CallingMethods().test3();
	}
	
	//Instant method
	public void test3()
	{
		test1(); //With in class any instant method can call without object creation	
		test2(); //Static methods can call any where At instance methods or Static methods
	}



}
