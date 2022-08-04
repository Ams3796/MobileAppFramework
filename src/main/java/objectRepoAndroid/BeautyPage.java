package objectRepoAndroid;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;

public class BeautyPage {

	AndroidDriver<WebElement> driver;

	@FindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.justdial.search:id/filtermain1scroll']")
	private List<WebElement> beauty_options;

	public List<WebElement> getBeauty_options() {
		return beauty_options;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Beauty Parlours']")
	private WebElement beautyparlours_option;

	public WebElement getBeautyparlours_option() {
		return beautyparlours_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Beauty Services']")
	private WebElement beautyservices_option;

	public WebElement getBeautyservices_option() {
		return beautyservices_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Bridal Makeup']")
	private WebElement bridalmakeup_option;

	public WebElement getBridalmakeup_option() {
		return bridalmakeup_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Bridegroom Makeup']")
	private WebElement bridegroom_option;

	public WebElement getBridegroom_option() {
		return bridegroom_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Salons']")
	private WebElement salons_option;

	public WebElement getSalons_option() {
		return salons_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Spas']")
	private WebElement spas_option;

	public WebElement getSpas_option() {
		return spas_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/filter_catDispName']")
	private List<WebElement> sub_cat_1;

	public List<WebElement> getSub_cat_1() {
		return sub_cat_1;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/filter_catDispName']")
	private List<WebElement> sub_cat_2;

	public List<WebElement> getSub_cat_2() {
		return sub_cat_2;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Sort by']")
	private WebElement sortby_option;

	public WebElement getSortby_option() {
		return sortby_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Filters']")
	private WebElement filters_option;

	public WebElement getFilters_option() {
		return filters_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Map']")
	private WebElement map_option;

	public WebElement getMap_option() {
		return map_option;
	}

	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.justdial.search:id/comp_image']")
	private List<WebElement> respage_comp_image;

	public List<WebElement> getRespage_comp_image() {
		return respage_comp_image;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/comp_name']")
	private List<WebElement> respage_compname;

	public List<WebElement> getRespage_compname() {
		return respage_compname;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/ratingvalue']")
	private List<WebElement> respage_rating_value;

	public List<WebElement> getRespage_rating_value() {
		return respage_rating_value;
	}

	@FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.justdial.search:id/ratingbarm']")
	private List<WebElement> respage_rating_barm;

	public List<WebElement> getRespage_rating_barm() {
		return respage_rating_barm;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/ratingtext']")
	private List<WebElement> respage_rating_text;

	public List<WebElement> getRespage_rating_text() {
		return respage_rating_text;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/comp_address']")
	private List<WebElement> respage_comp_address;

	public List<WebElement> getRespage_comp_address() {
		return respage_comp_address;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/distance']")
	private List<WebElement> respage_distance;

	public List<WebElement> getRespage_distance() {
		return respage_distance;
	}

	@FindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.justdial.search:id/calllaychild1']")
	private List<WebElement> callnow_button;

	public List<WebElement> getCallnow_button() {
		return callnow_button;
	}

	@FindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.justdial.search:id/calllaychild2']")
	private List<WebElement> booknow_button;

	public List<WebElement> getBooknow_button() {
		return booknow_button;
	}

	@FindBy(xpath="//android.widget.TextView[@resource-id='com.justdial.search:id/filter_catDispName']")
	private WebElement beauty_subcat_filter;

	public WebElement getBeauty_subcat_filter() {
		return beauty_subcat_filter;
	}

}
