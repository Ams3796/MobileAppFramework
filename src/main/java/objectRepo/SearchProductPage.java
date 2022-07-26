package objectRepo;

import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import UITestFramework.GenericMethods;
import io.appium.java_client.ios.IOSDriver;

public class SearchProductPage {

	public IOSDriver<WebElement> driver;
	GenericMethods methods = new GenericMethods(driver);
	LocalDate local = LocalDate.now();

	@FindBy(xpath = "//XCUIElementTypeTextField")
	private WebElement homepage_search_field;

	public WebElement getHomepage_search_field() {
		return homepage_search_field;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@label='locationHdrIcn']//following-sibling::XCUIElementTypeButton")
	private WebElement location_dropdown;

	public WebElement getLocation_dropdown() {
		return location_dropdown;
	}

	@FindBy(xpath = "//XCUIElementTypeTextField[@value='Start typing your location']")
	private WebElement location_searchfield;

	public WebElement getLocation_searchfield() {
		return location_searchfield;
	}

	@FindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")
	private WebElement location_first_suggestion;

	public WebElement getLocation_first_suggestion() {
		return location_first_suggestion;
	}

	@FindBy(xpath = "//XCUIElementTypeTextField[@value=' What? eg. Restaurants']")
	private WebElement search_item_field;

	public WebElement getSearch_item_field() {
		return search_item_field;
	}

	@FindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
	private List<WebElement> auto_suggestion;

	public List<WebElement> getAuto_suggestion() {
		return auto_suggestion;
	}

	@FindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell")
	private WebElement first_suggestion;

	public WebElement getFirst_suggestion() {
		return first_suggestion;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='egLoginLogoIcnND']")
	private WebElement jd_logo;

	public WebElement getJd_logo() {
		return jd_logo;
	}

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=' Sort By'])[1]")
	private WebElement sortby_option;

	public WebElement getSortby_option() {
		return sortby_option;
	}

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\" Filters\"])[1]")
	private WebElement filters_option;

	public WebElement getFilters_option() {
		return filters_option;
	}

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\" Map\"])[1]")
	private WebElement map_option;

	public WebElement getMap_option() {
		return map_option;
	}

	@FindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeCell//XCUIElementTypeStaticText[4]")
	private List<WebElement> resultspage_names;

	public List<WebElement> getResultspage_names() {
		return resultspage_names;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@label='Apple Store']")
	private WebElement resultpage_jdpay;

	public WebElement getResultpage_jdpay() {
		return resultpage_jdpay;
	}

	@FindBy(xpath = "(//XCUIElementTypeTable//XCUIElementTypeCell//XCUIElementTypeStaticText[4])[1]")
	private WebElement resultspage_firstresult;

	public WebElement getResultspage_firstresult() {
		return resultspage_firstresult;
	}

	@FindBy(xpath = "(//XCUIElementTypeTable//XCUIElementTypeCell//XCUIElementTypeStaticText[5])")
	private WebElement first_result;

	public WebElement getFirst_result() {
		return first_result;
	}

	@FindBy(xpath = "(//XCUIElementTypeTable//XCUIElementTypeOther//XCUIElementTypeStaticText)[2]")
	private WebElement details_page_store_name;

	public WebElement getDetails_page_store_name() {
		return details_page_store_name;
	}

	@FindBy(xpath = "//XCUIElementTypeOther[@name='Call']/XCUIElementTypeStaticText")
	private List<WebElement> detailspage_options;

	public List<WebElement> getDetailspage_options() {
		return detailspage_options;
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

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Call']/XCUIElementTypeStaticText)[1]")
	private WebElement detailspage_option1;

	public WebElement getdetailspage_option1() {
		return detailspage_option1;
	}

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Call']/XCUIElementTypeStaticText)[2]")
	private WebElement detailspage_option2;

	public WebElement getDetailspage_option2() {
		return detailspage_option2;
	}

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Call']/XCUIElementTypeStaticText)[3]")
	private WebElement detailspage_option3;

	public WebElement getDetailspage_option3() {
		return detailspage_option3;
	}

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Call']/XCUIElementTypeStaticText)[4]")
	private WebElement detailspage_option4;

	public WebElement getDetailspage_option4() {
		return detailspage_option4;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@label='Best Deal']")
	private WebElement best_deal;

	public WebElement getBest_deal() {
		return best_deal;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@label='All Options']")
	private WebElement all_options_hotel;

	public WebElement getAll_options_hotel() {
		return all_options_hotel;
	}

	@FindBy(xpath = "//XCUIElementTypeCell//XCUIElementTypeButton")
	private WebElement filters_checkin_option;

	public WebElement getFilters_checkin_option() {
		return filters_checkin_option;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Apply\"]")
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

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'₹')]")
	private List<WebElement> resultspage_price;

	public List<WebElement> getResultspage_price() {
		return resultspage_price;
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

	@FindBy(xpath = "//XCUIElementTypeStaticText[@label='Aug, 2022']//preceding::XCUIElementTypeStaticText[@name='25']")
	private WebElement checkin_date;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@label='Aug, 2022']//preceding::XCUIElementTypeStaticText[@name='27']")
	private WebElement checkout_date;

	public WebElement getCheckin_date() {
		return checkin_date;
	}

	public WebElement getCheckout_date() {
		return checkout_date;
	}

	public void search_location_manyata() {
		homepage_search_field.click();
		location_dropdown.click();
		location_searchfield.sendKeys("Manyata Tech Park");
		location_first_suggestion.click();
	}

	public void search_location_maladwest() {
		homepage_search_field.click();
		location_dropdown.click();
		location_searchfield.sendKeys("Malad West Mumbai");
		location_first_suggestion.click();
	}

	public void search_item() {
		homepage_search_field.click();
		search_item_field.sendKeys("iPhone");
		List<WebElement> auto_sug = auto_suggestion;
		System.out.println("Suggestion Count : " + auto_sug.size());
		for (WebElement suggestion : auto_sug) {
			String texts = suggestion.getText();
			System.out.println(texts);
		}
		first_suggestion.click();
	}

	public void verify_logo() {
		String logo = jd_logo.getText();
		boolean display = jd_logo.isDisplayed();
		System.out.println("JustDial logo displayed is : " + display);
	}

	public void verify_filter_options() {
		boolean sort = sortby_option.isDisplayed();
		System.out.println("Sort option displayed is : " + sort);
		boolean filters = filters_option.isDisplayed();
		System.out.println("Filters option displayed is : " + filters);
		boolean map = map_option.isDisplayed();
		System.out.println("Map option displayed is : " + map);
	}

	public void results_page_names() {
		for (int i = 1; i <= 3; i++) {
			WebElement res_name = driver.findElementByXPath(
					"(//XCUIElementTypeTable//XCUIElementTypeCell//XCUIElementTypeStaticText[4])[" + i + "]");
			String text = res_name.getText();
			System.out.println("Result " + i + "Name : " + text);
		}

	}

	public void verify_details_page() throws InterruptedException {

		boolean store_name = details_page_store_name.isDisplayed();
		System.out.println("Store Name displayed is : " + store_name);
		String text1 = detailspage_option1.getText();
		boolean option1 = detailspage_option1.isDisplayed();
		System.out.println(text1 + " displayed is : " + option1);
		String text2 = detailspage_option2.getText();
		boolean option2 = detailspage_option2.isDisplayed();
		System.out.println(text2 + " displayed is : " + option2);
		String text3 = detailspage_option3.getText();
		boolean option3 = detailspage_option3.isDisplayed();
		System.out.println(text3 + " displayed is : " + option3);
		String text4 = detailspage_option4.getText();
		boolean option4 = detailspage_option4.isDisplayed();
		System.out.println(text4 + " displayed is : " + option4);
		boolean bestdeal = best_deal.isDisplayed();
		System.out.println("Best Deal displayed is :" + bestdeal);

	}

	public void check_in() {
		LocalDate checkin = local.plusDays(3);
		String s = checkin.toString();
		String[] s1 = s.split("-");
		System.out.println(s1.length);
		String checkin_date = "";
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
			checkin_date = s1[i];
		}
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name='" + checkin_date + "']").click();
	}

	public void check_out() {
		LocalDate checkout = local.plusDays(5);
		String s2 = checkout.toString();
		String[] s3 = s2.split("-");
		System.out.println(s3.length);
		String checkout_date = "";
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]);
			checkout_date = s3[i];
		}
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name='" + checkout_date + "']").click();

	}

} 
