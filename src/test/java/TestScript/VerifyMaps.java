package TestScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import UITestFramework.CreateSession;
import UITestFramework.GenericMethods;
import io.appium.java_client.AppiumDriver;
import objectRepo.AllowPermissionsPage;
import objectRepo.SearchProductPage;
import objectRepo.VerifyMapsPage;

public class VerifyMaps extends CreateSession {

	AllowPermissionsPage ap;
	SearchProductPage sp;
	VerifyMapsPage map;
	GenericMethods methods = new GenericMethods(driver);

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test

	public void restaurant() throws InterruptedException {
		ap = PageFactory.initElements(driver, AllowPermissionsPage.class);
		sp = PageFactory.initElements(driver, SearchProductPage.class);
		map = PageFactory.initElements(driver, VerifyMapsPage.class);

		ap.allow_permissions();
		sp.search_location_manyata();
		sp.search_item();
		sp.verify_filter_options();

		String text = sp.getResultspage_firstresult().getText();
		System.out.println("Result 1 : " + text);
		sp.getMap_option().click();
		Thread.sleep(3000);
		map.getMaps_explore_listview().click();
		Thread.sleep(3000);
		String text1 = map.getMaps_listview_result1_name().getText();
		System.out.println("Result 2 : " + text1);
		Assert.assertEquals(text, text1);
		System.out.println("Results Matching");
		map.getMaps_explore_listview().click();
		Thread.sleep(3000);

		for (int i = 1; i <= 3; i++) {
			System.out.println("Result " + i + "");
			boolean direction = map.getMapspage_directions_button().isDisplayed();
			System.out.println("Direction icon displayed is :" + direction);
			boolean call = map.getMapspage_call_button().isDisplayed();
			System.out.println("Call icon displayed is :" + call);
			boolean share = map.getMapspage_share_button().isDisplayed();
			System.out.println("Share icon displayed is :" + share);
			boolean name = map.getMaps_scrollbar_names().isDisplayed();
			System.out.println("Name displayed is : " + name);
			methods.swipeByPercentage(0.95, 0.80, 0.05, 0.80, (AppiumDriver)driver);
		}
	}
}
