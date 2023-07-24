package common.Library;

public class RunTest {

	public static void main(String[] args)
	{
		
		CommonActions action=new CommonActions();
		action.LaunchBrowser(CommonObjects.browser);
		action.loadpage(CommonObjects.url);
		
		action.typetext(CommonObjects.username, "sunil");
		action.typetext(CommonObjects.password, CommonObjects.ip_password);
		action.ClickElemnet(CommonObjects.login_button);
		
		action.sleep(5000);
		
		action.typetext(CommonObjects.username, "Admin");
		action.typetext(CommonObjects.password, CommonObjects.ip_password);
		action.ClickElemnet(CommonObjects.login_button);
	}

}
