package mq.java.constructor;

public class Calculator 
{
	//Global variables
	int a;
	int b;
	
	//class constructor
	public Calculator(int x, int y) 
	{
		a=x;
		b=y;
	}
	
	//Reusable method
	public void add()
	{
		System.out.println(a+b);
	}
	
	//Reusable method
	public void mul()
	{
		System.out.println(a*b);
	}

	//Runnable method [Main method]
	public static void main(String[] args) 
	{
		new Calculator(100, 50).add();
		new Calculator(20, 30).mul();

	}

}
