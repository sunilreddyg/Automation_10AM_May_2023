package mq.java.parameters.CallByReference;

public class GetOldProduct 
{
	
	//CallByvalue
	public void Printinfo(String name)
	{
		System.out.println(name);
	}
	
	//CallByreference
	public void selectold(Product obj)
	{
		System.out.println(obj.name);
		System.out.println(obj.price);
	}
	
	public static void main(String[] args) 
	{
		GetOldProduct get =new GetOldProduct();
		get.Printinfo("iphone");
		
		//Calling method with class as argument
		Product pro=new Product();
		get.selectold(pro);

	}

}
