package mq.java.constructor;

public class ChangeGear 
{
	public ChangeGear() 
	{
		System.out.println("Hold Clutch");
	}
	
	public void First()
	{
		System.out.println("First Gear");
	}
	
	public void Second()
	{
		System.out.println("Second Gear");
	}
	
	public void third()
	{
		System.out.println("third Gear");
	}
	
	
	
	public static void main(String[] args) 
	{
		new ChangeGear().First();
		new ChangeGear().Second();
		new ChangeGear().third();
		
		
	}

}
