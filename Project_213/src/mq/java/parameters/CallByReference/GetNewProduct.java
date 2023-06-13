package mq.java.parameters.CallByReference;

public class GetNewProduct 
{
	

		//CallByreference
		public void selectnew(Product obj)
		{
			System.out.println(obj.name+"V1.1");
			System.out.println(obj.price+15000);
		}
		
	

	public static void main(String[] args) {
		
		Product product=new Product();
		new GetOldProduct().selectold(product);
		new GetNewProduct().selectnew(product);
	}

}
