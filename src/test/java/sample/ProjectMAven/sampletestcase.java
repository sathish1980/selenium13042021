package sample.ProjectMAven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampletestcase 
{

	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sathish.kumar15\\OneDrive - EY\\Desktop\\SathishkumarR\\Personal\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver wedi= new ChromeDriver();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampletestcase sp= new sampletestcase();
		sp.launch();
	}

}
