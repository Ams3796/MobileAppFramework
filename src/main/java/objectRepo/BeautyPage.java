package objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.ios.IOSDriver;

public class BeautyPage {

	public IOSDriver<WebElement> driver;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@label='BEAUTY']")
	private WebElement homepage_beauty_button;

	public WebElement getHomepage_beauty_button() {
		return homepage_beauty_button;
	}

	@FindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeCell//XCUIElementTypeStaticText")
	private List<WebElement> beauty_options;

	public List<WebElement> getBeauty_options() {
		return beauty_options;
	}
	
	@FindBy(xpath="//XCUIElementTypeStaticText[@label='Tattooing']")
	private WebElement tattooing_beauty;

	public WebElement getTattooing_beauty() {
		return tattooing_beauty;
	}
	

}
