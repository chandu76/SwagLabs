package TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Login_page;
import PageObjects.Products_page;
import TestBase.BaseTest;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TC_002_Validating_LoginFunctionality extends BaseTest{

	@Test (priority = 0)
	public void TestLogin()
	{
		Login_page lp=new Login_page(driver);
		Products_page pp=new Products_page(driver);
		try
		{
			lp.setUserName(p.getProperty("username"));
			Thread.sleep(10000);
			lp.setPassword(p.getProperty("password"));
			Thread.sleep(3000);
			lp.Click_on_Login();
			try
			{
				Alert alert=driver.switchTo().alert();
				alert.accept();
			}
			catch(Exception e)
			{
				System.out.println("No Allert present");
			}
			Assert.assertEquals(pp.Verify_Title(),p.getProperty("TitleName"));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
			
		}

	}

}
