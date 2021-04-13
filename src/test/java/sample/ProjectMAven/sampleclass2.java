package sample.ProjectMAven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sampleclass2 {


	@BeforeClass
	public void method3()
	{
		System.out.println("Before class in sample class2 ");
	}

	@Test
	public void method10()
	{
		System.out.println("Test case "
				+ " in sample class 2");
	}

	@AfterClass
	public void method6()
	{
		System.out.println("After class in sample class 2");
	}
}
