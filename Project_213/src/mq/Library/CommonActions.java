package common.Library;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class CommonActions 
{
	WebDriver driver;
	String screenpath="D:\\03_June_2023_10Am\\Project_213\\Screens\\";
	String MainwidnowId;
	//Method Usefull to launch chrome and firefox browsers
	public void LaunchBrowser(String browsername)
	{
		switch (browsername) 
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
		default: 
			System.out.println("Browser name is mismatched");
			break;
		}
	}
	
	//load webpage
	public void loadpage(String url)
	{
		MainwidnowId=driver.getWindowHandle();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	//Open brower and load url to browser window
	public void SetUp(String browsername,String url)
	{
		LaunchBrowser(browsername);
		loadpage(url);
	}
	
	//Get Webdriver driver to any where with in project
	public WebDriver getDriver()
	{
		return driver;
	}
	
	//Static time to hold execution for while
	public void sleep(long ms) 
	{
			try {
				Thread.sleep(ms);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	
	//Type text into entrybox
	public void typetext(String xpath,String input)
	{
		try {
			WebElement Editbox=driver.findElement(By.xpath(xpath));
			Editbox.sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Type text into entrybox
	public void Sendtext_using_keybaord(String xpath,String input)
	{
			try {
				WebElement Editbox=driver.findElement(By.xpath(xpath));
				new Actions(driver).sendKeys(Editbox, input).perform();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
		
	//Type text into entrybox
	public void Sendtext_using_js(String xpath,String input)
	{
			try {
				WebElement Editbox=driver.findElement(By.xpath(xpath));
				((JavascriptExecutor)driver)
				.executeScript("document.querySelector("+xpath+").value="+input, Editbox);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	/*
	 * Left Mouseclick actions[Suites for Buttons,Links,RadioButton,
	 * Checkbox,Tabs,ListofItems]
	 */
	public void ClickElemnet(String xpath)
	{
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Select Dropdown option using OptinName [Suites for Select Tag Elements]
	public void selectdropdownoption(String xpath,String optionname)
	{
		try {
			new Select(driver.findElement(By.xpath(xpath)))
			.selectByVisibleText(optionname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void selectoptions(String xpath,String selecttype,String option)
	{
		WebElement drodpown=driver.findElement(By.xpath(xpath));
		switch (selecttype) {
		case "text":
			new Select(drodpown).selectByVisibleText(option);
			break;
			
		case "value":
			new Select(drodpown).selectByValue(option);
			break;

		case "index":
			int index=Integer.parseInt(option);
			new Select(drodpown).selectByIndex(index);
			break;
		default:
			break;
		}
	}
	
	
	//CaptureScreen
	public void CaptureScreen(String Imagename)
	{
		String time=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss").format(new Date());
		try {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(screenpath+Imagename+time+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//CaptureScreen at location
	public void CaptureScreen(String ElementXpath,String Imagename)
	{
			String time=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss").format(new Date());
		try {
			File src=driver.findElement(By.xpath(ElementXpath)).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(screenpath+Imagename+time+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Switch to second window
	public void SwitchToNextWindow()
	{
		 //Get All Window IDs
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    
		for (String EachWindowID : AllWindowIDS) 
		{
			driver.switchTo().window(EachWindowID);
		}
		
	}
	
	
	//Switch back to mainwindow
	public void GetbacktoMainwindow()
	{
		driver.switchTo().window(MainwidnowId);
	}
	
	
	//Switch to window with title
	public void switchtowindowWithTitle(String title)
	{
		 //Get All Window IDs
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    
		for (String EachWindowID : AllWindowIDS) 
		{
			String PageTitle=driver.switchTo().window(EachWindowID).getTitle();
			if(PageTitle.contains(title))
			{
				break;   //Break stop iteration and eject from looping
			}
		}
	}
			
	//Create New Tab 
		public WebDriver CreateNewWIndow()
		{
			return driver.switchTo().newWindow(WindowType.WINDOW);
		}
		
		
		//Switch to frame
		public void SwitchToNewFrame(String FrameNameOrID)
		{
			driver.switchTo().defaultContent();
			driver.switchTo().frame(FrameNameOrID);
		}
		
		//Switch to Frame Using Frame Reference
		public void SwitchtoFrame_UsingFrameLocation(String FrameXpath)
		{
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.xpath(FrameXpath)));
		}
		
		
		//Verify Title presented
		public boolean  VerifyPageTitle(String ExpTitle)
		{
			return driver.getTitle().equals(ExpTitle);
		}
		
		//Verify Url Presented
		public boolean verifyPageurl(String Expurl)
		{
			return driver.getCurrentUrl().contains(Expurl);
		}
		
		//Verify ElementPresentedAtSource
		public boolean VerifyElementAtSource(String ElementID)
		{
			return driver.getPageSource().contains(ElementID);
		}
		
		
		//Verify ElementPresentedAtSource
		public WebElement CheckElementPresentedAtSource(String xpath)
		{
			try {
				return driver.findElement(By.xpath(xpath));
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		
		//Check Text Presented at webpage
		public boolean VerifyTextAtWebpage(String ExpText)
		{
			String PageText=driver.findElement(By.tagName("body")).getText();
			return PageText.contains(ExpText);
		}
		
		//Check Text Presented at location
		public boolean VerifyTextAtLocation(String Xpath,String ExpText)
		{
			boolean flag=false;
			if(CheckElementPresentedAtSource(Xpath)!=null)
			{
				String PageText=driver.findElement(By.xpath(Xpath)).getText();
				 flag=PageText.contains(ExpText);
			}
			return flag;
		}
		
		//Read Text Presented at location
		public String ReadtextAtLocation(String Xpath)
		{
			String Pagetext=null;
			if(CheckElementPresentedAtSource(Xpath)!=null)
			{
				Pagetext=driver.findElement(By.xpath(Xpath)).getText();
			}
			return Pagetext;
		}
		
		
		
}
