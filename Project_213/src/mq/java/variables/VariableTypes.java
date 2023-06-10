package mq.java.variables;

public class VariableTypes 
{

		//Global variables
		String email="sunilreddy@mindqsystems.com";   //Instant variable
		static int value=500;						  //static variable
		
		public void method1()
		{
			String name="MINDQ";			//Local variable
			System.out.println(name);
			
			//printing global variables
			System.out.println(email+" --->  "+value);
		}
		
		public void method2()
		{
			//printing global variables
			System.out.println(email+"   "+value);
		}
		
		

		public static void main(String[] args) 
		{
			//Creating object to class in order to call instant variable
			VariableTypes obj=new VariableTypes();
			String myemail=obj.email;    //Variable always return value
			System.out.println(myemail);
			
			//Calling Static variable using class name
			int NewValue=VariableTypes.value;
			System.out.println(NewValue);
			
			/*
			 * Note:--> When variable called it always return value
			 * 			try to store runtime value into new variable
			 */
			

		}
	
}
