package mq.java.methods;

public class TVRemote 
{
	
	//Reusable method
	public void ON()
	{
		System.out.println("Turn on");
	}
	
	//Reusable method
	public void OFF()
	{
		System.out.println("Turn off");
	}
	
	public static void main(String[] args) 
	{
		new TVRemote().ON();
		new TVRemote().OFF();
	}

}
