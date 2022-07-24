package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class AllowPermissionsPage {
	
	public AppiumDriver<WebElement> driver1;
	
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
	

	@FindBy(xpath = "//XCUIElementTypeTextField[@value='Name']")
	private WebElement name_field;

	public WebElement getName_field() {
		return name_field;
	}

	@FindBy(xpath = "//XCUIElementTypeTextField[@value='Mobile Number']")
	private WebElement mobile_number_field;

	public WebElement getMobile_number_field() {
		return mobile_number_field;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@label='login button']")
	private WebElement login_button;

	public WebElement getLogin_button() {
		return login_button;
	}
	
	
	
	public void allow_permissions()
	{
		dont_allow_notifications.click();
		agreeandcontinue.click();
		contact_dontallow.click();
		maybelater.click();
		allow_location_access.click();
	}
	
	public void login() {
		name_field.sendKeys("Amaya");
		mobile_number_field.sendKeys("9706388670");
		login_button.click();
	}

}
