package objectRepoAndroid;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;

public class FilterPage {

	AndroidDriver<WebElement> driver;

	@FindBy(xpath = "//android.widget.TextView[@text='QUICK FILTERS']/..//android.view.ViewGroup//android.widget.TextView")
	private List<WebElement> quickfilters_categories;

	public List<WebElement> getQuickfilters_categories() {
		return quickfilters_categories;
	}

	@FindBy(id = "com.justdial.search:id/res_filter_apply")
	private WebElement filter_apply;

	public WebElement getFilter_apply() {
		return filter_apply;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='CUISINES']/..//android.view.ViewGroup//android.widget.TextView")
	private List<WebElement> cuisines_filter_categories;

	public List<WebElement> getCuisines_filter_categories() {
		return cuisines_filter_categories;
	}

	@FindBy(xpath = "//android.widget.ImageButton[@resource-id='com.justdial.search:id/resultMoreButton']")
	private WebElement filterspage_morebutton;

	public WebElement getFilterspage_morebutton() {
		return filterspage_morebutton;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='MORE FILTERS']/..//android.view.ViewGroup//android.widget.TextView")
	private List<WebElement> more_filter_categories;

	public List<WebElement> getMore_filter_categories() {
		return more_filter_categories;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='AMENITIES']/..//android.view.ViewGroup//android.widget.TextView")
	private List<WebElement> amenities_filter_categories;

	public List<WebElement> getAmenities_filter_categories() {
		return amenities_filter_categories;
	}
	
	@FindBy(id="com.justdial.search:id/res_filter_clear")
	private WebElement clear_filter;

	public WebElement getClear_filter() {
		return clear_filter;
	}
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.justdial.search:id/details_services_title']")
	private List<WebElement> respage_amenities;

	public List<WebElement> getRespage_amenities() {
		return respage_amenities;
	}
	
	

}
