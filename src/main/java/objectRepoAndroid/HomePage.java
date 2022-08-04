package objectRepoAndroid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {
	
	AndroidDriver<WebElement> driver;

	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.justdial.search:id/promo_banner_image']")
	private WebElement promo_banner_image;

	public WebElement getPromo_banner_image() {
		return promo_banner_image;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='SHOPPING']")
	private WebElement shopping_option;

	public WebElement getShopping_option() {
		return shopping_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Beauty']")
	private WebElement beauty_option;

	public WebElement getBeauty_option() {
		return beauty_option;
	}
	
	@FindBy(id="com.justdial.search:id/search_edit_text_home")
	private WebElement homepage_searchbar;

	public WebElement getHomepage_searchbar() {
		return homepage_searchbar;
	}

}
