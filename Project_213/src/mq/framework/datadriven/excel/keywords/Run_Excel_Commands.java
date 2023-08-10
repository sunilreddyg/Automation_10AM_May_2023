package framework.datadriven.excel.keywords;

public class Run_Excel_Commands {

	public static void main(String[] args) 
	{
		
		Excel_commonReusable_actions
		.GetWorkbookAnd_Sheet("InputData.xlsx", "config");
		
		String browser=Excel_commonReusable_actions
					.getStringCellData(1, 0);
		System.out.println(browser);
		
		

	}

}
