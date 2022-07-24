package TestScript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import UITestFramework.CreateSession;
import objectRepo.AllowPermissionsPage;
import objectRepo.BeautyPage;
import objectRepo.SearchProductPage;

public class Beauty extends CreateSession {

	AllowPermissionsPage ap;
	SearchProductPage sp;
	BeautyPage beauty;

	@Test
	public void allow() {
		ap = PageFactory.initElements(driver, AllowPermissionsPage.class);
		beauty = PageFactory.initElements(driver, BeautyPage.class);
		sp = PageFactory.initElements(driver, SearchProductPage.class);
		ap.allow_permissions();
		beauty.getHomepage_beauty_button().click();
		beauty.getTattooing_beauty().click();
		sp.verify_filter_options();
		List<WebElement> res_names = sp.getResultspage_names();
		System.out.println(res_names.size()); 
		for (WebElement res_name : res_names) {
			String text = res_name.getText();
			System.out.println(text);
		}

	}

}
