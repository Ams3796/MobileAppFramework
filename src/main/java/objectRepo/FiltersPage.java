package objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.ios.IOSDriver;

public class FiltersPage {

	IOSDriver<WebElement> driver;

	@FindBy(xpath = "//XCUIElementTypeCell//XCUIElementTypeButton")
	private WebElement filters_checkin_option;

	public WebElement getFilters_checkin_option() {
		return filters_checkin_option;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Apply']")
	private WebElement filters_apply_button;

	public WebElement getFilters_apply_button() {
		return filters_apply_button;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@label='Budget']")
	private WebElement budget_filter_option;

	public WebElement getBudget_filter_option() {
		return budget_filter_option;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Rs 1001 to Rs 2000']\r\n" + "")
	private WebElement budget_filter_1000to2000;

	public WebElement getBudget_filter_1000to2000() {
		return budget_filter_1000to2000;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@label=\"checked icn\"]")
	private WebElement filter_checkedin_icon;

	public WebElement getFilter_checkedin_icon() {
		return filter_checkedin_icon;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@label='Clear All']")
	private WebElement clear_all_optin;

	public WebElement getClear_all_optin() {
		return clear_all_optin;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@label='Star Rating']")
	private WebElement star_rating_option;

	public WebElement getStar_rating_option() {
		return star_rating_option;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@label='5 Star']")
	private WebElement five_star_rating;

	public WebElement getFive_star_rating() {
		return five_star_rating;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@label='CUISINES']")
	private WebElement cuisines_filter_option;

	public WebElement getCuisines_filter_option() {
		return cuisines_filter_option;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@label='More Filters']")
	private WebElement more_filters_button;

	public WebElement getMore_filters_button() {
		return more_filters_button;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@label='Select More Filters']//following::XCUIElementTypeCell//XCUIElementTypeStaticText")
	private List<WebElement> more_filters_categories;

	public List<WebElement> getMore_filters_categories() {
		return more_filters_categories;
	}

	

}
