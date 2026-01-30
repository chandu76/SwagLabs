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
			pp.Verify_Title();
			if(pp.Verify_Title()==true)
			{
				Assert.assertTrue(true);
			}
		}	
		catch(Exception e)
		{
			Assert.fail("test fail");
		}
	}

	@Test
	public void Test_backpack_isDisplayed()
	{
		try
		{
			Assert.assertTrue(pp.verify_imgDisplayed());
		}
		catch(Exception e)
		{
			Assert.fail(e.getMessage());
		}

	}
	@Test
	public void Test_Backpack_imglink()
	{
		try
		{
			Assert.assertTrue(pp.verify_ImgLinkdisplayed());
		}
		catch(Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
	@Test
	public void Test_imageLink()
	{
		pp.verify_imglink_click();
		if()
		{
			
		}
		
	}

}
