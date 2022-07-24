package objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.ios.IOSDriver;

public class VerifyMapsPage {

	IOSDriver<WebElement> driver;

	@FindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeCell//XCUIElementTypeStaticText[4]")
	private List<WebElement> resultspage_names;

	public List<WebElement> getResultspage_names() {
		return resultspage_names;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@label='explore listView']")
	private WebElement maps_explore_listview;

	public WebElement getMaps_explore_listview() {
		return maps_explore_listview;
	}

	@FindBy(xpath = "(//XCUIElementTypeCell//XCUIElementTypeOther//XCUIElementTypeImage)[1]")
	private WebElement maps_scrollbar_image;

	public WebElement getMaps_scrollbar_image() {
		return maps_scrollbar_image;
	}

	@FindBy(xpath = "(//XCUIElementTypeCell//XCUIElementTypeOther//XCUIElementTypeImage//following-sibling::XCUIElementTypeStaticText)[1]")
	private WebElement maps_scrollbar_names;

	public WebElement getMaps_scrollbar_names() {
		return maps_scrollbar_names;
	}

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Directions\"])[1]")
	private WebElement mapspage_directions_button;

	public WebElement getMapspage_directions_button() {
		return mapspage_directions_button;
	}

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Call\"])[1]")
	private WebElement mapspage_call_button;

	public WebElement getMapspage_call_button() {
		return mapspage_call_button;
	}

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Share\"])[1]")
	private WebElement mapspage_share_button;

	public WebElement getMapspage_share_button() {
		return mapspage_share_button;
	}
	
	@FindBy(xpath="//XCUIElementTypeTable//XCUIElementTypeCell[2]//XCUIElementTypeStaticText[4]")
	private WebElement maps_listview_result1_name;

	public WebElement getMaps_listview_result1_name() {
		return maps_listview_result1_name;
	}
	
	@FindBy(xpath="//XCUIElementTypeTable//XCUIElementTypeCell[3]//XCUIElementTypeStaticText[5]")
	private WebElement maps_listview_result2_name;

	public WebElement getMaps_listview_result2_name() {
		return maps_listview_result2_name;
	}

}