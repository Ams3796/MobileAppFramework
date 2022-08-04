package objectRepoAndroid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;

public class DetailsPage {

	AndroidDriver<WebElement> driver;

	@FindBy(id = "com.justdial.search:id/tvServiceHeader")
	private WebElement detailspage_amenities_header;

	public WebElement getDetailspage_amenities_header() {
		return detailspage_amenities_header;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/tvSerciefooter']")
	private WebElement detailspage_amenities_moretext;

	public WebElement getDetailspage_amenities_moretext() {
		return detailspage_amenities_moretext;
	}
	
//	public void verifyElement(String text)
//	{
//		driver.findElementByXPath("//android.widget.TextView[contains(@text,"+text+")]").isDisplayed();
//	}

}
