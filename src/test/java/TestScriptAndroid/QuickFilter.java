package TestScriptAndroid;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import UITestFramework.CreateSession;
import UITestFramework.GenericMethods;
import io.appium.java_client.AppiumDriver;
import objectRepoAndroid.FilterPage;
import objectRepoAndroid.HomePage;
import objectRepoAndroid.ResultsPage;
import objectRepoAndroid.SearchProductPage;

public class QuickFilter extends CreateSession {

	HomePage hp;
	SearchProductPage sp;
	ResultsPage res;
	FilterPage filter;
	GenericMethods methods = new GenericMethods(driver);

	@Test

	public void filters() throws InterruptedException {
		hp = PageFactory.initElements(driver, HomePage.class);
		sp = PageFactory.initElements(driver, SearchProductPage.class);
		res = PageFactory.initElements(driver, ResultsPage.class);
		filter = PageFactory.initElements(driver, FilterPage.class);

		Thread.sleep(3000);
		hp.getHomepage_searchbar().click();
		sp.getSearch_what_ex_restaurants().sendKeys("Restaurant");
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

		int size1 = filter.getQuickfilters_categories().size();
		System.out.println("Quick Filter categories : " + size1);
		List<String> l1 = new ArrayList<String>();
		for (int i = 0; i < size1; i++) {
			filter.getQuickfilters_categories().get(i).click();
			filter.getFilter_apply().click();
			Thread.sleep(3000);
			for (int j = 0; j < size; j++) {
				String text1 = res.getRespage_compname().get(j).getText();
				System.out.println("Result : " + j + " " + text1);
				l1.add(text1);
			}
			System.out.println(l1);
			Assert.assertNotSame(l, l1);
			System.out.println("Applied Filters Verified");
			l.clear();
			l.addAll(l1);
			l1.removeAll(l1);
			res.getFilters_option().click();
			Thread.sleep(3000);
		}

		filter.getFilterspage_morebutton().click();
		methods.swipeByPercentage(0.5, 0.7, 0.5, 0.3, (AppiumDriver<?>) driver);
		int size2 = filter.getCuisines_filter_categories().size();
		System.out.println("Cuisines Filter Categories : " + size2);

		for (int i = 0; i < size2; i++) {

			filter.getCuisines_filter_categories().get(i).click();
			filter.getFilter_apply().click();
			Thread.sleep(3000);
			for (int j = 0; j < size; j++) {
				String text1 = res.getRespage_compname().get(j).getText();
				System.out.println("Result : " + j + " " + text1);
				l1.add(text1);
			}
			System.out.println(l1);
			Assert.assertNotSame(l, l1);
			System.out.println("Applied Filters Verified");
			l.clear();
			l.addAll(l1);
			l1.removeAll(l1);
			res.getFilters_option().click();
			Thread.sleep(3000);
			filter.getFilterspage_morebutton().click();
			methods.swipeByPercentage(0.5, 0.7, 0.5, 0.3, (AppiumDriver<?>) driver);
		}
		methods.backNavigation((AppiumDriver<?>) driver);
	}

}
