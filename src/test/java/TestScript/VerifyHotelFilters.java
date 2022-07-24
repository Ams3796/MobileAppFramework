package TestScript;

import java.time.LocalDate;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import UITestFramework.CreateSession;
import UITestFramework.GenericMethods;
import io.appium.java_client.ios.IOSDriver;
import objectRepo.AllowPermissionsPage;
import objectRepo.SearchProductPage;

public class VerifyHotelFilters extends CreateSession {

	AllowPermissionsPage ap;
	SearchProductPage sp;
	GenericMethods methods = new GenericMethods(driver);
	IOSDriver<WebElement> driver1;
	LocalDate local = LocalDate.now();

	@Test

	public void train() throws InterruptedException {
		ap = PageFactory.initElements(driver, AllowPermissionsPage.class);

		sp = PageFactory.initElements(driver, SearchProductPage.class);

		ap.allow_permissions();
		sp.getHomepage_search_field().click();
		sp.getLocation_dropdown().click();
		sp.getLocation_searchfield().sendKeys("Malad West Mumbai");
		sp.getLocation_first_suggestion().click();
		sp.getHomepage_search_field().click();
		sp.getSearch_item_field().sendKeys("Hotel");
		sp.getFirst_suggestion().click();
		sp.getAll_options_hotel().click();
		sp.getFilters_option().click();
		sp.getFilters_checkin_option().click();

		LocalDate checkin = local.plusDays(3);
		String s = checkin.toString();
		String[] s1 = s.split("-");
		System.out.println(s1.length);
		String checkin_date = "";
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
			checkin_date = s1[i];
		}
		((RemoteWebDriver) driver).findElementByXPath("//XCUIElementTypeStaticText[@name='" + checkin_date + "']")
				.click();

		LocalDate checkout = local.plusDays(5);
		String s2 = checkout.toString();
		String[] s3 = s2.split("-");
		System.out.println(s3.length);
		String checkout_date = "";
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]);
			checkout_date = s3[i];
		}
		((RemoteWebDriver) driver).findElementByXPath("//XCUIElementTypeStaticText[@name='" + checkout_date + "']")
				.click();

		sp.getBudget_filter_option().click();
		sp.getBudget_filter_1000to2000().click();
		Assert.assertTrue(sp.getFilter_checkedin_icon().isDisplayed());
		sp.getFilters_apply_button().click();

		List<WebElement> prices = sp.getResultspage_price();
		for (WebElement price : prices) {
			String text = price.getText();
			String[] str = text.split(" ");
			String price_symbol = str[0];
			String price_value = str[1];
			System.out.println(str[0]);
			System.out.println(str[1]);
			int value = Integer.parseInt(price_value);
			if (value >= 1000 && value <= 2000) {
				System.out.println("Pass : Price is inbetween 1000 and 2000");
			} else {
				System.out.println("Fail : Price is not inbetween 1000 and 2000");
			}
		}
		sp.getFilters_option().click();
		sp.getClear_all_optin().click();
		sp.getFilters_option().click();
		sp.getStar_rating_option().click();
		sp.getFive_star_rating().click();
		Assert.assertTrue(sp.getFilter_checkedin_icon().isDisplayed());
		sp.getFilters_apply_button().click();
	}
}
