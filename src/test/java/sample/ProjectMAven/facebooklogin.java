package sample.ProjectMAven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Generalpackage.sleniumgenral;
import Pages.login;
import Pages.logout;

public class facebooklogin extends Browser
{
	String filepath="C:\\Users\\sathish.kumar15\\eclipse-workspace\\ProjectMAven\\inputfile\\";
	String fileName="inputdata.xls";
	String sheetName="input";
	sleniumgenral sc= new sleniumgenral();
	//this is use to log the value in the report.
		//static ExtentTest test;
		///here we will mention the path to generate the html report
		//static ExtentReports report;
	@BeforeSuite(alwaysRun=true)
	public void la()
	{
		launch();
		report = new ExtentReports(System.getProperty("user.dir")
				+"\\Reports\\ExtentReportResults.html",true);
		test = report.startTest("Sanity testing started");
	}
	@Test(dataProvider="multidata",groups="Sanity")
	public void loginandlogout(String uname, String pass)
	{
		 try
		 {
			// Thread.sleep(2000);
		 dr.get("https://www.facebook.com");
		 login lg= new login(dr);
		 lg.username(uname);
		 lg.password(pass);
		 lg.loginbuttn();
		 logout lo = new logout(dr);
		 lo.logoutdropdown();
		 lo.logoutoption();
		 test.log(LogStatus.PASS, test.addScreenCapture(sc.capture(dr)));

		 }
		 catch(Exception e)
		 {
			 test.log(LogStatus.FAIL, e);
			 
			 
		 }
	}
	
	@DataProvider(name = "multidata")
	public String[][] dataread() throws IOException
	{
		
		return excelreadandright.excelreaddata( filepath, fileName, sheetName );
	}
	
	@AfterSuite(alwaysRun=true)
	public void teardown()
	{
		dr.close();
		report.endTest(test);
		report.flush();
	}
}
