package mq.java.parameters;

public class OpenBrowser 
{
	String TargetedBrowser=null;
	
	public OpenBrowser(String browser) 
	{
		System.out.println(browser);
		TargetedBrowser=browser;
	}
	
	
	public static  void main(String args[])
	{
		OpenBrowser obj=new OpenBrowser("chrome");
		System.out.println(obj.TargetedBrowser);
		
	}

}
