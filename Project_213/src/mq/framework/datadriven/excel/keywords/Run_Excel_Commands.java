package framework.datadriven.excel.keywords;

public class Run_Excel_Commands 
{

	public static void main(String[] args) 
	{
		
		Excel_commonReusable_actions
		.GetWorkbookAnd_Sheet("InputData.xlsx", "multipledata");
		
		int Rcount=Excel_commonReusable_actions.GetRowCount();
		for (int i = 1; i <= Rcount; i++) 
		{
			String UID=Excel_commonReusable_actions
					.getStringCellData(i, 0);
			System.out.println(UID);
			
			Excel_commonReusable_actions
			.WriteData_At_exsitingRow_And_NewCell(i, 2, "Tetpass");
		}
		
		Excel_commonReusable_actions.CreateOtuputFile("OP.xlsx");
		
		

	}

}
