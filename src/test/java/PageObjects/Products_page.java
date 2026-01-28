package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products_page extends BasePage {

	public Products_page(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//*[@id='header_container']/div[2]/span  ")
	WebElement Element_Title;


	//BackPack Elements

	@FindBy(xpath="//*[@id='item_4_img_link']/img")
	WebElement Back_pack_Imagelink;
	@FindBy(xpath="//*[@id='item_4_title_link']")
	WebElement Back_pack_Titlelink ;
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[1]/div")
	WebElement Back_pack_text;
	@FindBy(xpath=" //*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")
	WebElement Backpack_price ;
	@FindBy(xpath=" //*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement backpack_Addtocart ;


	@FindBy(xpath="")
	WebElement ;
	@FindBy(xpath="")
	WebElement ;
	@FindBy(xpath="")
	WebElement ;
	@FindBy(xpath="")
	WebElement ;
	@FindBy(xpath="")
	WebElement ;
	@FindBy(xpath="")
	WebElement ;
	@FindBy(xpath="")
	WebElement ;
	@FindBy(xpath="")
	WebElement ;
	@FindBy(xpath="")
	WebElement ;
	@FindBy(xpath="")
	WebElement ;
	@FindBy(xpath="")
	WebElement ;
	@FindBy(xpath="")
	WebElement ;




	//Actions
	public String Verify_Title()
	{
		try 
		{
			return(Element_Title.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}


	}

}
