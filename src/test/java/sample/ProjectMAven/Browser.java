package sample.ProjectMAven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Browser 
{
	public static WebDriver dr;
	public static ExtentTest test;
	public static ExtentReports report;

	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sathish.kumar15\\OneDrive - EY\\Desktop\\SathishkumarR\\Personal\\Software\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--disable-notifications");
		dr=new ChromeDriver(options);
		dr.manage().window().maximize();
	}
}
