package robot_java_AutomationTool;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class CaptureScreen 
{
	public static void TakeScreen(String imagename) throws Exception
	{
		//Create object for Robot
		Robot robot=new Robot();
		BufferedImage Image=robot.createScreenCapture(new Rectangle(800,600));
		
		//Target file location
		File src=new File("D:\\Screens\\"+imagename+".png");
		ImageIO.write(Image, "PNG", src);
	}
	
	
	public static void main(String[] args) throws AWTException, IOException 
	{
		
		
		//Create object for Robot
		Robot robot=new Robot();
		BufferedImage Image=robot.createScreenCapture(new Rectangle(800,600));
		
		//Target file location
		File src=new File("D:\\Screens\\HomeScreen.png");
		//Write image into local drive
		ImageIO.write(Image, "PNG", src);
		
	}

}
