package mq.java.methodtypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodTypes 
{
	//Void is a default method it doesn't return value
	public void method1()
	{
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println(c);
	}
	
	/*
	 * =>Other than void all method types return value
	 * => For other than void we should write return keyword at the end of method
	 * => Return value should match with method type
	 * => finally value return to method name
	 * 
	 */
	
	//Integer return method
	public int method2()
	{
		int x=100;
		int y=200;
		int z=x*y;
		return z;
	}
	
	
	//String return method
	public String method3()
	{
		return "Sunil";
	}
	
	//double return method
	public double method4()
	{
		return 24000.00;
	}
	
	//boolean return method
	public boolean method5()
	{
		return true;
	}
	

	public static void main(String[] args) 
	{
		//Create object for class
		MethodTypes obj=new MethodTypes();
		obj.method1();
		
		//calling integer return method
		int num=obj.method2();
		System.out.println(num);
		
		//calling string return method
		String name=obj.method3();
		System.out.println(name);
		
		//calling double return method
		double price=obj.method4();
		System.out.println(price);
		
		//Calling boolean return method
		boolean flag=obj.method5();
		System.out.println(flag);
		
		
		
	}

}
