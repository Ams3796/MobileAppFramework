package TestScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import UITestFramework.CreateSession;
import UITestFramework.GenericMethods;
import objectRepo.AllowPermissionsPage;
import objectRepo.SearchProductPage;

public class VerifyPages extends CreateSession {
	// IOSDriver<WebElement> driver;
	GenericMethods methods = new GenericMethods(driver);
	AllowPermissionsPage ap;
	SearchProductPage sp;

	@Test
	public void test1() throws InterruptedException {
		ap = PageFactory.initElements(driver, AllowPermissionsPage.class);
		sp = PageFactory.initElements(driver, SearchProductPage.class);
		ap.allow_permissions();
		sp.search_location_manyata();
		sp.search_item();
		sp.verify_logo();
		sp.verify_filter_options();
		sp.getResultpage_jdpay().click();
		methods.refresh();
		sp.verify_details_page();
		
		

	}

}
