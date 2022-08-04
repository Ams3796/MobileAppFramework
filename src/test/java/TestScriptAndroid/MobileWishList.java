package TestScriptAndroid;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import UITestFramework.CreateSession;
import UITestFramework.GenericMethods;
import objectRepoAndroid.HomePage;
import objectRepoAndroid.MobilePage;
import objectRepoAndroid.SearchProductPage;

public class MobileWishList extends CreateSession {

	
	GenericMethods methods = new GenericMethods(driver);
	SearchProductPage sp;
	MobilePage mob;
	HomePage hp;

	@Test

	public void wishlist() {
		sp = PageFactory.initElements(driver, SearchProductPage.class);
		mob = PageFactory.initElements(driver, MobilePage.class);
		hp = PageFactory.initElements(driver, HomePage.class);

		hp.getPromo_banner_image().click();
		mob.getMobile_option().click();
		mob.getApple_mobiles_option().click();
		mob.getFirst_result().click();
		mob.getColor_option().click();
		mob.getWhite_color_option().click();
		mob.getOne_twenty_eight_storage_option().click();
		mob.getApply_button().click();
		String detailspage_prodname = mob.getDetailspage_prodname().getText();
		mob.getDetailspage_white_option().isDisplayed();
		String color = mob.getDetailspage_white_option().getText();
		System.out.println(color);
		mob.getDetailspage_onetwentyeightgb_storage().isDisplayed();
		String storage = mob.getDetailspage_onetwentyeightgb_storage().getText();
		System.out.println(storage);
		mob.getWishlist_icon().click();
		System.out.println("Product added to WishList");
		for (int i = 1; i <= 3; i++) {
			methods.back();
		}
		mob.getMore_option().click();
		mob.getWishlist_option().click();
		String wishlist_prodname = mob.getWishlist_productname().getText();
		Assert.assertEquals(detailspage_prodname, wishlist_prodname);
		System.out.println("Product available in Wislist");
		mob.getWishlist_productname().click();
		mob.getWishlist_icon().click();
		System.out.println("Product removed from Wishlist");

	}
}
