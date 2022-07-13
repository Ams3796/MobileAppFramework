package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.ios.IOSDriver;

public class AllowPermissionsPage {
	
	public IOSDriver<WebElement> driver;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name='Don’t Allow']")
	public WebElement dont_allow_notifications;

	public WebElement getDont_allow_notifications() {
		return dont_allow_notifications;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@label='Agree and Continue']")
	public WebElement agreeandcontinue;

	public WebElement getAgreeandcontinue() {
		return agreeandcontinue;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Don’t Allow']")
	private WebElement contact_dontallow;

	public WebElement getContact_dontallow() {
		return contact_dontallow;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Maybe Later']")
	private WebElement maybelater;

	public WebElement getMaybelater() {
		return maybelater;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Allow While Using App']")
	private WebElement allow_location_access;

	public WebElement getAllow_location_access() {
		return allow_location_access;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")
	private WebElement cancel_contact_settings;

	public WebElement getCancel_contact_settings() {
		return cancel_contact_settings;
	}
	
	public void allow_permissions()
	{
		dont_allow_notifications.click();
		agreeandcontinue.click();
		contact_dontallow.click();
		maybelater.click();
		allow_location_access.click();
	}

}
