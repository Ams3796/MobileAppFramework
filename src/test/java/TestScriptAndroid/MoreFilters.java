package TestScriptAndroid;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import UITestFramework.CreateSession;
import UITestFramework.GenericMethods;
import io.appium.java_client.AppiumDriver;
import objectRepoAndroid.DetailsPage;
import objectRepoAndroid.FilterPage;
import objectRepoAndroid.HomePage;
import objectRepoAndroid.ResultsPage;
import objectRepoAndroid.SearchProductPage;

public class MoreFilters extends CreateSession {

	HomePage hp;
	SearchProductPage sp;
	ResultsPage res;
	FilterPage filter;
	DetailsPage details;
	GenericMethods methods = new GenericMethods(driver);

	@Test

	public void morefilters() throws InterruptedException {

		hp = PageFactory.initElements(driver, HomePage.class);
		sp = PageFactory.initElements(driver, SearchProductPage.class);
		res = PageFactory.initElements(driver, ResultsPage.class);
		filter = PageFactory.initElements(driver, FilterPage.class);
		details = PageFactory.initElements(driver, DetailsPage.class);

		Thread.sleep(3000);
		hp.getHomepage_searchbar().click();
		sp.getSearch_what_ex_restaurants().sendKeys("Hotel");
		sp.getProd_first_suggestion().click();
		List<String> l = new ArrayList<String>();
		int size = res.getRespage_compname().size();
		for (int i = 0; i < size; i++) {
			String text = res.getRespage_compname().get(i).getText();
			System.out.println("Result : " + i + " " + text + "");
			l.add(text);
		}
		System.out.println(l);
		res.getFilters_option().click();
		methods.swipeByPercentage(0.5, 0.9, 0.5, 0.1, (AppiumDriver<?>) driver);
		int size1 = filter.getAmenities_filter_categories().size();
		System.out.println("Amenities Filter categories : " + size1);
		List<String> l1 = new ArrayList<String>();
		for (int i = 0; i < size1; i++) {
			String filter1 = filter.getAmenities_filter_categories().get(i).getText();
			System.out.println("Filter Selected : " + filter1);
			filter.getAmenities_filter_categories().get(i).click();
			String filter2 = filter.getAmenities_filter_categories().get(i + 1).getText();
			System.out.println("Filter Selected : " + filter2);
			filter.getAmenities_filter_categories().get(i + 1).click();
			filter.getFilter_apply().click();
			Thread.sleep(3000);
			
			for (int j = 0; j < size; j++) {
				String text1 = res.getRespage_compname().get(j).getText();
				System.out.println("Result : " + j + " " + text1);
				l1.add(text1);
			}
			Thread.sleep(5000);
			System.out.println(l1);
			Thread.sleep(5000);
			Assert.assertNotSame(l, l1);
			System.out.println("Applied Filters Verified");
			l.clear();
			l.addAll(l1);
			l1.removeAll(l1);
			res.getRespage_firstresult().click();
			methods.swipeByPercentage(0.5, 0.9, 0.5, 0.1, (AppiumDriver<?>) driver);
			methods.swipeByPercentage(0.5, 0.9, 0.5, 0.0, (AppiumDriver<?>) driver);
			if (methods.elementPresence(details.getDetailspage_amenities_moretext())) {
				details.getDetailspage_amenities_moretext().click();
				Thread.sleep(3000);
				int size2 = filter.getRespage_amenities().size();
				for (int k = 0; k < size2; k++) {
					if (filter1.equals(filter.getRespage_amenities().get(k).getText())) {
						System.out.println("Present");
					} else if (filter1.contains(filter.getRespage_amenities().get(k).getText())) {
						System.out.println("Present");
					} else if (i == size - 1) {
						i = -1;
						methods.swipeByPercentage(0.5, 0.9, 0.5, 0.1, (AppiumDriver<?>) driver);
					}
				}
				methods.backNavigation((AppiumDriver<?>) driver);
			} else {
				int size3 = filter.getRespage_amenities().size();
				for (int k = 0; k < size3; k++) {

					if (filter1.equals(filter.getRespage_amenities().get(k).getText())) {
						System.out.println("Present");
					} else if (filter1.contains(filter.getRespage_amenities().get(k).getText())) {
						System.out.println("Present");
					}
				}

			}
			System.out.println(" ");
			methods.backNavigation((AppiumDriver<?>) driver);
			res.getFilters_option().click();
			filter.getClear_filter().click();
			res.getFilters_option().click();
			Thread.sleep(1000);
			methods.swipeByPercentage(0.5, 0.9, 0.5, 0.1, (AppiumDriver<?>) driver);

		}
	}

}
