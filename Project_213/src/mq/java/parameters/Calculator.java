package mq.java.parameters;

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
		//Object Creation using Referrence type
		Calculator obj=new Calculator(10, 20);
		obj.add();
		obj.mul();
		
		//Object Creation using Instant type
		new Calculator(100, 36).add();
		new Calculator(12, 7).mul();

	}

}
