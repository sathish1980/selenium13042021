package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login 
{
	WebDriver dr;
	@FindBy(id="email") 
	WebElement usname;
	@FindBy(id="pass") 
	WebElement pswrd;
	@FindBy(name="login") 
	WebElement lgbtn;
	
	public login(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);
	}
	public void username(String uname)
	{
		 //dr.findElement(By.id("email")).sendKeys(uname);
		 usname.sendKeys(uname);
	}
	
	public void password(String pass)
	{
		// dr.findElement(By.id("pass")).sendKeys(pass);
		pswrd.sendKeys(pass);
	}
	
	public void loginbuttn()
	{
		//dr.findElement(By.name("login")).click();
		lgbtn.click();
	}
	
	
	
	 

}
