package mq.java.parameters;

public class CallByvalues 
{
	//Method parameters using datatypes..
	
	//Method with string parameter
	public void method1(String name)
	{
		System.out.println(name);
	}
	
	//method with int parameter
	public void method2(int xyz)
	{
		System.out.println(xyz);
	}
	
	//mehod with boolean parameter
	public void method3(boolean flag)
	{
		System.out.println(flag);
	}
	
	//mehod with boolean parameter
	public void method4(double price)
	{
		System.out.println(price);
	}
	
	//Method with char parameter
	public void method5(char ch)
	{
		System.out.println(ch);
	}

	public static void main(String[] args) 
	{
		//Create object for class
		CallByvalues obj=new CallByvalues();
		obj.method1("Sunil");  //Calling method with string argument
		obj.method2(100);     //Calling method with int argurment
		obj.method3(true);    //Calling method with boolean argument
		obj.method4(1200.00); //Calling method with double argument
		obj.method5('A');     //Calling method with char argument
	}

}
