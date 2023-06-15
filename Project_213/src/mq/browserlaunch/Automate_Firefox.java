package browserlaunch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Automate_Firefox 
{

	public static void main(String[] args) 
	{
		//launching firefox browser and storing into FirefoxDriver reference
		FirefoxDriver firefox=new FirefoxDriver();
		
		//using browser reference loading page
		firefox.get("http://outlook.com");
		
		//Getting title from automation browser window
		System.out.println(firefox.getTitle());
		
		//Executing java script to prompt alert message
		firefox.executeScript("alert('Welcome to Automaton Demo')");
		
		
		//Closing browser window
		//firefox.close();
		
		
	}

}
