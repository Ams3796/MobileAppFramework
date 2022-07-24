package TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import UITestFramework.CreateSession;
import UITestFramework.GenericMethods;
import io.appium.java_client.AppiumDriver;
import objectRepo.AllowPermissionsPage;
import objectRepo.FiltersPage;
import objectRepo.SearchProductPage;

public class Filter extends CreateSession {

	AllowPermissionsPage ap;
	SearchProductPage sp;
	FiltersPage filter;
	GenericMethods methods = new GenericMethods(driver);

	@Test

	public void allownow() throws InterruptedException {
		ap = PageFactory.initElements(driver, AllowPermissionsPage.class);
		sp = PageFactory.initElements(driver, SearchProductPage.class);
		filter = PageFactory.initElements(driver, FiltersPage.class);

		ap.allow_permissions();
		sp.search_location_maladwest();
		sp.getHomepage_search_field().click();
		sp.getSearch_item_field().sendKeys("Restaurant");
		sp.getFirst_suggestion().click();
		// sp.verify_filter_options();
		String first_res_before_filter = sp.getResultspage_firstresult().getText();
		System.out.println("Before Filter : " + first_res_before_filter);
		sp.getFilters_option().click();
		filter.getMore_filters_button().click();
		List<WebElement> list = filter.getMore_filters_categories();
		int size = list.size();
		System.out.println("Categories Count : " + size);

		for (int i = 1; i <= size; i++) {
			WebElement cat = driver.findElement(By.xpath(
					"(//XCUIElementTypeStaticText[@label='Select More Filters']//following::XCUIElementTypeCell//XCUIElementTypeStaticText)["
							+ i + "]"));
			cat.click();
			filter.getFilters_apply_button().click();
			Thread.sleep(20000);
			String first_result_after_filter = sp.getResultspage_firstresult().getText();
			System.out.println("After Filter : " + first_result_after_filter);
			Assert.assertNotSame(first_res_before_filter, first_result_after_filter);
			first_res_before_filter = first_result_after_filter;
			sp.getFilters_option().click();
			filter.getMore_filters_button().click();

			if (i % 4 == 0) {
				Thread.sleep(3000);
				methods.swipeByPercentage(0.6, 0.9, 0.6, 0.7, (AppiumDriver) driver);
				Thread.sleep(3000);

			}
		}
	}
}
