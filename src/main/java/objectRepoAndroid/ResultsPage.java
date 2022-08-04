package objectRepoAndroid;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage {

	@FindBy(id = "com.justdial.search:id/jd_image_home")
	private WebElement jdlogo;

	public WebElement getJdlogo() {
		return jdlogo;
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

	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.justdial.search:id/comp_image']")
	private WebElement respage_first_comp_image;

	public WebElement getRespage_first_comp_image() {
		return respage_first_comp_image;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/comp_name']")
	private WebElement respage_first_compname;

	public WebElement getRespage_first_compname() {
		return respage_first_compname;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/ratingvalue']")
	private WebElement respage_first_rating_value;

	public WebElement getRespage_first_rating_value() {
		return respage_first_rating_value;
	}

	@FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.justdial.search:id/ratingbarm']")
	private WebElement respage__firstrating_barm;

	public WebElement getRespage__firstrating_barm() {
		return respage__firstrating_barm;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/ratingtext']")
	private WebElement respage_first_rating_text;

	public WebElement getRespage_first_rating_text() {
		return respage_first_rating_text;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/comp_address']")
	private WebElement respage_first_comp_address;

	public WebElement getRespage_first_comp_address() {
		return respage_first_comp_address;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/distance']")
	private WebElement respage_first_distance;

	public WebElement getRespage_first_distance() {
		return respage_first_distance;
	}

	@FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.justdial.search:id/mainlay']")
	private WebElement respage_mainlay;

	public WebElement getRespage_mainlay() {
		return respage_mainlay;
	}

	@FindBy(xpath="(//android.widget.TextView[@resource-id='com.justdial.search:id/comp_name'])[1]")
	private WebElement respage_firstresult;

	public WebElement getRespage_firstresult() {
		return respage_firstresult;
	}

}
