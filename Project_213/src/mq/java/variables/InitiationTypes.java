package mq.java.variables;

public class InitiationTypes 
{

	public static void main(String[] args) 
	{
		//Initiating variable and assigning value
		int a=100;
		a=200;   //Override new value
		System.out.println(a);
		
		//Initiating and assigning value later
		int b;
		b=10;
		System.out.println(b);
		
		//Initiating group of variables and assigning values
		int c,d,e;
		c=30;d=40;e=50;
		System.out.println(c+d+e);
		
		
		//Global initiation with in conditions
		int x;
		if (true)      //Decision execute inside block on true condition
		{
			 x=1000;
			
		}
		System.out.println(x+100);
		
		
		
		
	}

}
