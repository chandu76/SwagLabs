package TestCases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Products_page;
import TestBase.BaseTest;

public class TC_001_validating_ProductsPage_Functionality extends BaseTest
{
	Products_page pp=new Products_page(driver);

	@Test(groups = "smoke")
	public void TestHomePage()
	{
		try
		{
			System.out.println(pp.Verify_Title());
		}	
		catch(Exception e)
		{
			Assert.assertFalse(true);
		}
	}
	@Test
	public void backpack_isDisplayed()
	{
		
	}

	
}
