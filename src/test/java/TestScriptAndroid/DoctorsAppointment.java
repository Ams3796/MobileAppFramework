package TestScriptAndroid;

import java.awt.Color;
import java.time.LocalDate;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import UITestFramework.CreateSession;
import objectRepoAndroid.HomePage;
import objectRepoAndroid.SearchProductPage;

public class DoctorsAppointment extends CreateSession {

	HomePage hp;
	SearchProductPage sp;

	@Test

	public void dovtor() throws InterruptedException {
		hp = PageFactory.initElements(driver, HomePage.class);
		sp = PageFactory.initElements(driver, SearchProductPage.class);

		Thread.sleep(3000);
		hp.getHomepage_searchbar().click();
		sp.getLocation_button().click();
		sp.getLocation_searchfield().sendKeys("Azad Nagar Goregaon");
		sp.getLocation_first_suggestion().click();
		hp.getHomepage_searchbar().click();
		sp.getSearch_what_ex_restaurants().sendKeys("Zxy Kankatika");
		sp.getProd_first_suggestion().click();
		Assert.assertTrue(sp.getRespage_image().isDisplayed());
		String text = sp.getRespage_compname().getText();
		Assert.assertEquals(text, "Zxy Kankatika");
		System.out.println("Company Name : " + text);
		String add = sp.getRespage_address().getText();
		for (int i = 0; i <= 3; i++) {
			boolean display = sp.getRespage_buttons().get(i).isDisplayed();
			String text1 = sp.getRespage_buttons().get(i).getText();
			System.out.println("Button " + i + " displayed is : " + display);
		}
		sp.getBook_appointment_button().click();
		Assert.assertTrue(sp.getDoctors_header().isDisplayed());
		Assert.assertEquals(sp.getZxy_kankatika_text().getText(), "Zxy Kankatika");
		String add1 = sp.getDoctors_app_address().getText();
		add1.contains(add1);

		LocalDate d = LocalDate.now().plusDays(2);

		String s = d.toString();
		String[] s1 = s.split("-");
		System.out.println(s1.length);
		String date = "";
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
			date = s1[i];
		}
		driver.findElement(By.xpath("//android.widget.TextView[@text='" + date + "']")).click();
		sp.getDate_edit_icon().click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='" + date + "']")).click();
		System.out.println("Date is Editable");
		Thread.sleep(2000);
		sp.getTime().click();
		sp.getTime_edit_icon().click();
		Thread.sleep(2000);
		sp.getTime().click();
		System.out.println("Time is editable");
		sp.getI_am_the_patient_checkbox().click();
		sp.getPatientname_searchfield().sendKeys("Amaya");
		sp.getPatient_mob_number().sendKeys("7598273796");
		sp.getProceed_button().click();
		Assert.assertTrue(sp.getMobile_verification_header().isDisplayed());
		System.out.println("Displayed");
		Assert.assertTrue(sp.getMobile_verification_header().isDisplayed());
		System.out.println("Displayed");
		Assert.assertTrue(sp.getVerification_code_field().isDisplayed());
		System.out.println("Displayed");
		Assert.assertTrue(sp.getSubmit_button().isDisplayed());
		System.out.println("Displayed");
		System.out.println("Mobile verification section is present");
		
		
		
	}

}
