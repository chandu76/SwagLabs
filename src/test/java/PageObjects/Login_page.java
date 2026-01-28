package PageObjects;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.BaseTest;

public class Login_page extends BasePage {
	Properties p=new Properties();
	

	public Login_page(WebDriver driver) 
	{
		super(driver);
	}
	
	//WebElements Xpaths
	
	@FindBy(xpath = "//*[@id='root']/div/div")
	WebElement Element_Swaglabs_logo;
	@FindBy(xpath="//*[@id='user-name']")
	WebElement Element_Username;
	@FindBy(xpath ="//*[@id='password']")
	WebElement Element_Password;
	@FindBy(xpath ="//*[@id='login-button']")
	WebElement Element_Login;
	@FindBy(xpath ="//*[@id='login_credentials']/h4")
	WebElement Element_Acceptedusername_text;
	@FindBy(xpath =" //*[@id=\"login_credentials\"]/text()[1]")
	WebElement List_Accepted_userNames;
	@FindBy(xpath ="//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/h4")
	WebElement Element_PasswordText;
	@FindBy(xpath =" //*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/text()")
	WebElement Element_ElementAccepted_Password;
	
	//Actions
	public boolean SwaglabsTitle()
	{
		try
		{
			return(Element_Swaglabs_logo.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void setUserName(String username)
	{
		
		BaseTest.wait.until(ExpectedConditions.visibilityOf(Element_Username));
		Element_Username.clear();
		Element_Username.sendKeys(username);
		
	}
	public void setPassword(String password)
	{
		BaseTest.wait.until(ExpectedConditions.visibilityOf(Element_Password));
		Element_Password.clear();
		Element_Password.sendKeys(password);
	}
	public void Click_on_Login()
	{
		Element_Login.click();
	}
	public void Check_Element_Acceptedusername_text()
	{
		Element_Acceptedusername_text.getText();
	}
	public void Check_List_Accepted_userNames()
	{
		List_Accepted_userNames.getText();
	}
	public void Check_Element_PasswordText()
	{
		Element_PasswordText.getText();
	}
	public void Check_Element_ElementAccepted_Password()
	{
		Element_ElementAccepted_Password.getText();
	}
	
}
