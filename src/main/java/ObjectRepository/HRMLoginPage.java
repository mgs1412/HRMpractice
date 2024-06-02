package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMLoginPage
{
  
	//Declaration
	
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Loginbtn;
	
	//Initialization
	
	public HRMLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//Utilization
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginbtn() {
		return Loginbtn;
	}
	//Business Library 
	/*
	 * this method will login to Page
	 */
	public void LoginToApplication()
	{
		userName.sendKeys(null);
		passWord.sendKeys(null);
		Loginbtn.click();
	}
	
	
	
}
