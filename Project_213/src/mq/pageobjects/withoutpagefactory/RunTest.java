package pageobjects.withoutpagefactory;

import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class RunTest 
{

	@org.junit.Ignore
	public void test1() 
	{
		TestCase1 tc1=new TestCase1();
		tc1.Tc001_Add_AdminSystemUser();
	}
	
	@Test
	public void test2() 
	{
		TestCase2 tc2=new TestCase2();
		tc2.AddEmployeeList_UnderPIM();
	}
	
	

}
