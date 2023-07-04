package robot_java_AutomationTool;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import com.sun.glass.events.KeyEvent;

public class Robot_Notepad_Automation {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		//Opening notepad at runtime by executing .exe file
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//creating object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(300);
		
		//Typing Hello Friends Text using Keyboard interactions
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_F);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_S);
		

	}

}
