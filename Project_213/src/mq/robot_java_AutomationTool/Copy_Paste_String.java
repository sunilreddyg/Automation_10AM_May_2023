package robot_java_AutomationTool;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.Keys;

import com.sun.glass.events.KeyEvent;

public class Copy_Paste_String 
{
	
	public static void copystring(String text)
	{
		//String selection
		StringSelection Stext=new StringSelection(text);
		//Get Access of system clipboard 
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Save Content to clipboard
		clipboard.setContents(Stext, Stext);
	}
	
	

	public static void main(String[] args) throws Exception
	{
		
		//Opening notepad at runtime by executing .exe file
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//creating object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(300);
		
		String text="Hello friends welcome to selenium automation demo";
		
		//String selection
		StringSelection Stext=new StringSelection(text);
		//Get Access of system clipboard 
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Save Content to clipboard
		clipboard.setContents(Stext, Stext);
		
		
		//Press Control+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		String newtextpath="Demo timings are 10:30 AM";
		copystring(newtextpath);
		
		//Press Control+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release control Key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
	
	
		
	}

}
