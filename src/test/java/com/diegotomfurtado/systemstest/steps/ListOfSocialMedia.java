package com.diegotomfurtado.systemstest.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.diegotomfurtado.systemstest.pages.HomePage;
import com.diegotomfurtado.systemstest.pages.SocialMediaPage;
import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ListOfSocialMedia {

	@Before
	public static void setUpAll() {

		SeleniumReadPropertyKeys.DRIVER.manage().timeouts().implicitlyWait(SeleniumReadPropertyKeys.getTimeOut(),
				TimeUnit.SECONDS);
		SeleniumReadPropertyKeys.DRIVER.get(SeleniumReadPropertyKeys.getUrlToHome());
	}
	
	@Given("^I know where is the social media information$")
	public void iKnowWhereIsTheSocialMediaInformation(){
		
		_homePage.verifyIfSocialMediaIsPresentOnPage();
	}

	@Then("^I will check if there are at least one of that$")
	public void iWillCheckIfThereAreAtLeastOneOfThat() throws InterruptedException{

		_homePage.clickOnSocialMediaLink();
		Assert.assertEquals("Netshoes", _instagran.checkingIfSocialMediaIsAvailable());
	}
	
	HomePage _homePage = new HomePage();
	SocialMediaPage _instagran = new SocialMediaPage();
}
