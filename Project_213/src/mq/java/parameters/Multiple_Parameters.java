package mq.java.parameters;

public class Multiple_Parameters 
{
	//Method with sequence parameters
	public void method1(String name,String email) 
	{
		System.out.println(name+"\t"+email);
	}
	
	//Method with different parameters
	public void method2(String name,double price) 
	{
		System.out.println(name+"\t"+price);
	}
	
	//Method with different parameters
	public void method3(String name,double price,boolean status, int num) 
	{
		System.out.println(name+"\t"+price+"\t"+status+"\t"+num);
	}

	public static void main(String[] args) 
	{
		//Create object for class
		Multiple_Parameters obj=new Multiple_Parameters();
		
		//Calling methods with multiple arguments
		obj.method1("sunil", "sunil@gmail.com");  
		obj.method2("iphone", 55000.00);
		obj.method3("Samsung", 25000.00, true, 4);
	}

}
