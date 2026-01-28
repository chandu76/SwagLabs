package TestBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


public class BaseTest 
{
	public static WebDriver driver;
	public Properties p;
	public Logger logger;
	public static  WebDriverWait wait;
	@BeforeClass
	public void setup() throws IOException
	{
		
		FileReader file=new FileReader("./src//test//resources//Config.properties");
		p=new Properties();
		p.load(file);
		logger=LogManager.getLogger(this.getClass());

		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		
		driver=new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(p.getProperty("application_url"));

	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	public String randomsting()
	{
		String genaratednewstring=RandomStringUtils.randomAlphabetic(5);
		return genaratednewstring;

	}

}
