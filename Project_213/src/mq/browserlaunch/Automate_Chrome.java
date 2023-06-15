package browserlaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Chrome 
{

	public static void main(String[] args) 
	{
		//launching chrome browser and storing into ChromDriver reference
		ChromeDriver chrome=new ChromeDriver();
		
		//Using Chromedriver reference loading a new page to browser window
		chrome.get("https://www.facebook.com/");
		
		//Returning browser window title
		System.out.println(chrome.getTitle());
		
		//Closing browser window
		chrome.close();
	}

}
