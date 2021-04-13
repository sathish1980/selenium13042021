package Generalpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sleniumgenral 
{

public static String capture(WebDriver driver) throws IOException {
		
		TakesScreenshot ts = ((TakesScreenshot) driver);
	
		File scrFile=ts.getScreenshotAs(OutputType.FILE);
		
		File Dest = new File(System.getProperty("user.dir")+"\\screenshot\\" + System.currentTimeMillis()+ ".png");
	
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		}

public static void webdriverwaitelementobeclickable(WebDriver dr,String element)
{
	WebDriverWait wait= new WebDriverWait(dr,60);
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
	 
}

}
