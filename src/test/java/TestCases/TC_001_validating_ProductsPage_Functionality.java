package TestCases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Products_page;
import TestBase.BaseTest;

public class TC_001_validating_ProductsPage_Functionality extends BaseTest
{
	@Test(groups = "smoke")
	public void TestHomePage()
	{
		try
		{
			Products_page hp=new Products_page(driver);

			logger.info("******started test case**********");
			//hp.Verify_Homepage();
			//if(hp.Verify_Homepage()==true)
			{
				Assert.assertTrue(true);
			}
			//else
			{
				assertFalse(true);
			}
			logger.info("******End test case**********");
		}
		catch(Exception e)
		{
			Assert.assertFalse(true);
			logger.info("******Exception in test case**********");
		}
	}


}
