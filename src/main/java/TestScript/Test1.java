package TestScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import UITestFramework.CreateSession;
import UITestFramework.GenericMethods;
import objectRepo.AllowPermissionsPage;

public class Test1 extends CreateSession {

	GenericMethods methods = new GenericMethods(driver);
	AllowPermissionsPage ap;

	@Test
	public void sample() throws InterruptedException {
		ap = PageFactory.initElements(driver, AllowPermissionsPage.class);
		ap.getDont_allow_notifications().click();
		Thread.sleep(3000);
		ap.getAgreeandcontinue().click();
		ap.getContact_dontallow().click();
		ap.getMaybelater().click();
		ap.getAllow_location_access().click();
	}

}
