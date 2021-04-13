package sample.ProjectMAven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleclass 
{

	@BeforeSuite(alwaysRun =true)
	public void method1()
	{
		System.out.println("Before suitr");
	}
	@BeforeTest(alwaysRun =true)
	public void method2()
	{
		System.out.println("Before Test");
	}
	@BeforeClass(alwaysRun =true)
	public void method3()
	{
		System.out.println("Before class");
	}
	
	@AfterSuite(alwaysRun =true)
	public void method4()
	{
		System.out.println("After suitr");
	}
	@AfterTest(alwaysRun =true)
	public void method5()
	{
		System.out.println("After Test");
	}
	
	@BeforeMethod(alwaysRun =true)
	public void method7()
	{
		System.out.println("Before Method");
	}
	
	@Test(priority =0,groups="sanity")
	public void method9()
	{
		System.out.println("Test case1");
	}
	
	@Test(priority =2 , groups="sanity",description="testcase3",enabled=true , invocationCount=10,invocationTimeOut=50000,successPercentage=50,timeOut=2000)
	public void method11()
	{
		System.out.println("Test case3");
	}
	
	@Test(priority=1,dependsOnMethods ="method11",groups="SIT")
	public void method10()
	{
		System.out.println("Test case2");
	}
	
	@Test(priority=4,alwaysRun=true)
	public void method14()
	{
		System.out.println("Test case2");
	}
	
	@AfterMethod(alwaysRun =true)
	public void method8()
	{
		System.out.println("After Method");
	}
	@AfterClass(alwaysRun =true)
	public void method6()
	{
		System.out.println("After class");
	}
}
