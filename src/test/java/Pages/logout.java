package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Generalpackage.sleniumgenral;

public class logout 
{
	WebDriver dr;
	
	String dropdownxpath = "(//div[@aria-label='Account'])[1]";
	String lodropdown = "//span[text()='Log Out']";
	@FindBy(xpath="(//div[@aria-label='Account'])[1]")
	WebElement lgdropdown;
	@FindBy(xpath="//span[text()='Log Out']")
	WebElement lgoption;
	
	public logout(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);
	}
	 public void logoutdropdown()
	 {
	 sleniumgenral.webdriverwaitelementobeclickable(dr,dropdownxpath);
	 //dr.findElement(By.xpath(dropdownxpath)).click();
	 lgdropdown.click();
	 }
	 
	 public void logoutoption() 
	 {
		 sleniumgenral.webdriverwaitelementobeclickable(dr,lodropdown);
			
	 //dr.findElement(By.xpath(lodropdown)).click();
	 lgoption.click();
	 }
	
}
