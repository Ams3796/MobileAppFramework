package TestScriptAndroid;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import UITestFramework.CreateSession;
import UITestFramework.GenericMethods;
import io.appium.java_client.AppiumDriver;
import objectRepoAndroid.BeautyPage;
import objectRepoAndroid.HomePage;
import objectRepoAndroid.ResultsPage;

public class Beauty extends CreateSession {

	HomePage hp;
	BeautyPage beauty;
	ResultsPage res;
	GenericMethods methods = new GenericMethods(driver);

	@Test

	public void beauty() throws InterruptedException {
		hp = PageFactory.initElements(driver, HomePage.class);
		beauty = PageFactory.initElements(driver, BeautyPage.class);
		res = PageFactory.initElements(driver, ResultsPage.class);

		hp.getBeauty_option().click();
		Thread.sleep(3000);
		int size = beauty.getBeauty_options().size();
		System.out.println("Categories Count : " + size);

		for (int i = 0; i < size; i++) {
			beauty.getBeauty_options().get(i).click();
			Thread.sleep(2000);
			if (methods.elementPresence(beauty.getBeauty_subcat_filter())) {
				int size1 = beauty.getSub_cat_1().size();
				System.out.println("Sub Categories 1 : " + size1);
				for (int j = 0; j < size1; j++) {
					beauty.getSub_cat_1().get(j).click();
					Thread.sleep(2000);
					if (methods.elementPresence(beauty.getBeauty_subcat_filter())) {
						int size2 = beauty.getSub_cat_2().size();

						Thread.sleep(3000);
						System.out.println("Sub Categories 2 : " + size2);
						for (int k = 0; k < size2; k++) {
							beauty.getSub_cat_2().get(k).click();
							Thread.sleep(2000);
							Assert.assertTrue(res.getJdlogo().isDisplayed());
							Assert.assertTrue(beauty.getSortby_option().isDisplayed());
							Assert.assertTrue(beauty.getFilters_option().isDisplayed());
							Assert.assertTrue(beauty.getMap_option().isDisplayed());

							res.getRespage_first_comp_image().isDisplayed();
							res.getRespage_first_compname().isDisplayed();
							res.getRespage_first_rating_value().isDisplayed();
							res.getRespage__firstrating_barm().isDisplayed();
							res.getRespage_first_rating_text().isDisplayed();
							res.getRespage_first_comp_address().isDisplayed();
							methods.swipeByPercentage(0.5, 0.9, 0.5, 0.1, (AppiumDriver) driver);
							methods.backNavigation((AppiumDriver) driver);
						}
						methods.backNavigation((AppiumDriver) driver);
					} else {
						Thread.sleep(2000);
						Assert.assertTrue(res.getJdlogo().isDisplayed());
						Assert.assertTrue(beauty.getSortby_option().isDisplayed());
						Assert.assertTrue(beauty.getFilters_option().isDisplayed());
						Assert.assertTrue(beauty.getMap_option().isDisplayed());

						res.getRespage_first_comp_image().isDisplayed();
						res.getRespage_first_compname().isDisplayed();
						res.getRespage_first_rating_value().isDisplayed();
						res.getRespage__firstrating_barm().isDisplayed();
						res.getRespage_first_rating_text().isDisplayed();
						res.getRespage_first_comp_address().isDisplayed();
						methods.swipeByPercentage(0.5, 0.9, 0.5, 0.1, (AppiumDriver) driver);
						methods.backNavigation((AppiumDriver) driver);
					}

				}
				methods.backNavigation((AppiumDriver) driver);
			}

			else {
				Thread.sleep(3000);
				Assert.assertTrue(res.getJdlogo().isDisplayed());
				System.out.println("Verified");
				Assert.assertTrue(beauty.getSortby_option().isDisplayed());
				Assert.assertTrue(beauty.getFilters_option().isDisplayed());
				Assert.assertTrue(beauty.getMap_option().isDisplayed());

				res.getRespage_first_comp_image().isDisplayed();
				res.getRespage_first_compname().isDisplayed();
				res.getRespage_first_rating_value().isDisplayed();
				res.getRespage__firstrating_barm().isDisplayed();
				res.getRespage_first_rating_text().isDisplayed();
				res.getRespage_first_comp_address().isDisplayed();
				methods.swipeByPercentage(0.5, 0.9, 0.5, 0.1, (AppiumDriver) driver);
				methods.backNavigation((AppiumDriver) driver);
			}

		}
	}
}
