package mq.java.variables;

public class Variable_Override 
{
	//Global variable
	int a;
	int b;
	
	 final int c=300;   //Final is the keyword it doesn't allow to override value
	
	 //initiating data to variable using method.
	public void method1()
	{
		int a=100;     //Local variable [Don't instantiate locally once your are instantiate globally]
		b=200;         //Assigning value to global variable
	}
	

	public static void main(String[] args) 
	{
		Variable_Override obj=new Variable_Override();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		//Calling method
		obj.method1();
		
		System.out.println(obj.a);    //print 0  
		System.out.println(obj.b);    //Print 200
		
		
		int val=obj.b=500;  //It override value
		System.out.println(val);
		
		

	}

}
