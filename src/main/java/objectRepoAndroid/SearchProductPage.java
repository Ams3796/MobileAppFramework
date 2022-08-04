package objectRepoAndroid;

import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;

public class SearchProductPage {

	AndroidDriver<WebElement> driver;

	@FindBy(xpath = "//android.widget.TextView[@text='SHOPPING']")
	private WebElement shopping_button;

	public WebElement getShopping_button() {
		return shopping_button;
	}

	@FindBy(id = "com.justdial.search:id/search_icon_home")
	private WebElement search_bar;

	public WebElement getSearch_bar() {
		return search_bar;
	}
	
	@FindBy(id="com.justdial.search:id/jd_detected_area_view")
	private WebElement location_button;
	
	public WebElement getLocation_button() {
		return location_button;
	}
	
	@FindBy(id="com.justdial.search:id/search_edit_text")
	private WebElement location_searchfield;

	public WebElement getLocation_searchfield() {
		return location_searchfield;
	}
	
	@FindBy(id="com.justdial.search:id/tvAreaView")
	private WebElement location_first_suggestion;

	public WebElement getLocation_first_suggestion() {
		return location_first_suggestion;
	}

	@FindBy(xpath="//android.widget.MultiAutoCompleteTextView[@resource-id='com.justdial.search:id/search_edit_text']")
	private WebElement search_what_ex_restaurants;

	public WebElement getSearch_what_ex_restaurants() {
		return search_what_ex_restaurants;
	}

	@FindBy(xpath = "//android.widget.MultiAutoCompleteTextView[@text='Search Products']")
	private WebElement prod_searchbar;

	public WebElement getProd_searchbar() {
		return prod_searchbar;
	}

	@FindBy(xpath = "//android.widget.RelativeLayout//android.widget.TextView[@resource-id='com.justdial.search:id/displayTxt']")
	private List<WebElement> prod_auto_suggestions;

	public List<WebElement> getProd_auto_suggestions() {
		return prod_auto_suggestions;
	}

	@FindBy(xpath = "//android.widget.RelativeLayout//android.widget.TextView[@resource-id='com.justdial.search:id/displayTxt']")
	private WebElement prod_first_suggestion;

	public WebElement getProd_first_suggestion() {
		return prod_first_suggestion;
	}

	@FindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.justdial.search:id/mod_list_model']")
	private WebElement plp;

	public WebElement getPlp() {
		return plp;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/tvpdname']")
	private WebElement pdp_prod_name;

	public WebElement getPdp_prod_name() {
		return pdp_prod_name;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='BUY NOW']")
	private WebElement buynow_button;

	public WebElement getBuynow_button() {
		return buynow_button;
	}

	@FindBy(id = "com.justdial.search:id/tvAddToCartBtn")
	private WebElement add_to_cart_button;

	public WebElement getAdd_to_cart_button() {
		return add_to_cart_button;
	}

	@FindBy(id = "com.justdial.search:id/textcountcarttext")
	private WebElement cart_icon_count;

	public WebElement getCart_icon_count() {
		return cart_icon_count;
	}

//	@FindBy(id="com.justdial.search:id/add_address_text_view")
//	private WebElement add_new_address_button;
//	
//
//	public WebElement getAdd_new_address_button() {
//		return add_new_address_button;
//	}

	@FindBy(id = "com.justdial.search:id/mod_list_model")
	private WebElement prodname_in_cart;

	public WebElement getProdname_in_cart() {
		return prodname_in_cart;
	}

	@FindBy(id = "com.justdial.search:id/totalamounttext")
	private WebElement total_amount;

	public WebElement getTotal_amount() {
		return total_amount;
	}

	@FindBy(id = "com.justdial.search:id/txt_place_order")
	private WebElement place_order_button;

	public WebElement getPlace_order_button() {
		return place_order_button;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='SELECT THIS']")
	private WebElement select_this_address;

	public WebElement getSelect_this_address() {
		return select_this_address;
	}

	@FindBy(id = "com.justdial.search:id/txt_address")
	private WebElement location_address;

	public WebElement getLocation_address() {
		return location_address;
	}

	@FindBy(id = "com.justdial.search:id/txt_order_product_name")
	private WebElement summary_prodname;

	public WebElement getSummary_prodname() {
		return summary_prodname;
	}

	@FindBy(id = "com.justdial.search:id/txt_proceed_payment")
	private WebElement proceed_for_payment;

	public WebElement getProceed_for_payment() {
		return proceed_for_payment;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Pay']")
	private WebElement jd_pay;

	public WebElement getJd_pay() {
		return jd_pay;
	}
	
	@FindBy(xpath="//android.widget.RelativeLayout[@resource-id='com.justdial.search:id/overAllRatingLayout']//android.widget.LinearLayout//android.widget.RelativeLayout")
	private List<WebElement> respage_buttons;

	public List<WebElement> getRespage_buttons() {
		return respage_buttons;
	}
	
	@FindBy(id="com.justdial.search:id/home_bannerImage")
	private WebElement respage_image;

	public WebElement getRespage_image() {
		return respage_image;
	}
	
	@FindBy(id="com.justdial.search:id/company_name")
	private WebElement respage_compname;

	public WebElement getRespage_compname() {
		return respage_compname;
	}
	
	@FindBy(id="com.justdial.search:id/jdPayButtonc2")
	private WebElement jdpay_button;

	public WebElement getJdpay_button() {
		return jdpay_button;
	}
	
	@FindBy(id="com.justdial.search:id/button1")
	private WebElement book_appointment_button;

	public WebElement getBook_appointment_button() {
		return book_appointment_button;
	}
	
	@FindBy(id="com.justdial.search:id/short_address_dis_view")
	private WebElement respage_address;

	public WebElement getRespage_address() {
		return respage_address;
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Doctors']")
	private WebElement doctors_header;

	public WebElement getDoctors_header() {
		return doctors_header;
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Zxy Kankatika']")
	private WebElement zxy_kankatika_text;

	public WebElement getZxy_kankatika_text() {
		return zxy_kankatika_text;
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Location : Dindoshi-malad East  ']")
	private WebElement doctors_app_address;

	public WebElement getDoctors_app_address() {
		return doctors_app_address;
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Date : ']//following-sibling::android.view.View")
	private WebElement date_edit_icon;
	
	public WebElement getDate_edit_icon() {
		return date_edit_icon;
	}
	
	@FindBy(xpath="//android.view.View//android.widget.Button")
	private WebElement time;
	
	public WebElement getTime() {
		return time;
	}

	@FindBy(xpath="//android.widget.TextView[@text='Time : ']//following-sibling::android.view.View")
	private WebElement time_edit_icon;

	public WebElement getTime_edit_icon() {
		return time_edit_icon;
	}
	
	@FindBy(xpath="//android.view.View[@text='I am the patient']")
	private WebElement I_am_the_patient_checkbox;

	public WebElement getI_am_the_patient_checkbox() {
		return I_am_the_patient_checkbox;
	}
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='patientName']")
	private WebElement patientname_searchfield;

	public WebElement getPatientname_searchfield() {
		return patientname_searchfield;
	}
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='patientMobile']")
	private WebElement patient_mob_number;

	public WebElement getPatient_mob_number() {
		return patient_mob_number;
	}
	
	@FindBy(xpath="//android.widget.Button[@text='PROCEED']")
	private WebElement proceed_button;

	public WebElement getProceed_button() {
		return proceed_button;
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Mobile Verification']")
	private WebElement mobile_verification_header;

	public WebElement getMobile_verification_header() {
		return mobile_verification_header;
	}
	
	@FindBy(xpath="//android.widget.EditText[@text='VERIFICATION CODE']")
	private WebElement verification_code_field;

	public WebElement getVerification_code_field() {
		return verification_code_field;
	}
	
	@FindBy(xpath="//android.widget.Button[@text='SUBMIT']")
	private WebElement submit_button;

	public WebElement getSubmit_button() {
		return submit_button;
	}
	
	
	
	
	
	
	
	

	

}
