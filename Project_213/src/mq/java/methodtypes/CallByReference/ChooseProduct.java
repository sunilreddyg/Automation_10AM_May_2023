package mq.java.methodtypes.CallByReference;


public class ChooseProduct 
{
	
	public Book1 selectFirstbook()
	{
		return new Book1();
	}
	
	public Book2 selectSecondbook()
	{
		return new Book2();
	}
	
	public static void main(String args[])
	{
		ChooseProduct obj=new ChooseProduct();
		
		//Calling class return method
		String productname=obj.selectFirstbook().GetName();
		System.out.println(productname);
		
		Book1 newbook=obj.selectFirstbook();
		double price=newbook.GetPrice();
		System.out.println(price);
		
		
		
		obj.selectFirstbook().getoffers().printbill();
		
		
	}

}
