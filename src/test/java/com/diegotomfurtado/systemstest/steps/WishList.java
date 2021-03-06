package com.diegotomfurtado.systemstest.steps;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import com.diegotomfurtado.systemstest.pages.HomePage;
import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WishList {

	@Before
	public static void setUpAll() {

		SeleniumReadPropertyKeys.DRIVER.manage().timeouts().implicitlyWait(SeleniumReadPropertyKeys.getTimeOut(),
				TimeUnit.SECONDS);
		SeleniumReadPropertyKeys.DRIVER.get(SeleniumReadPropertyKeys.getUrlToHome());
	}

	@Given("^a user is logged into his Netshoes account$")
	public void aUserIsLoggedIntoHisNetshoesAccount() throws Exception {

		_homePage.performLogin();
	}

	@When("^a user selects \"([^\"]*)\" to put on Wish List$")
	public void aUserSelectsToPutOnWishList(String textToInput) throws Exception {

		_homePage.inputTextOnMainFilter(textToInput);
		_homePage.clickOnButtonMainFilter();
		_homePage.selectItemsToMyWishList();
	}

	@Then("^a user could return anytime to finish his shopping$")
	public void aUserCouldReturnAnytimeToFinishHisShopping() throws Exception {

		_homePage.clickOnMyWishListButton();
		Assert.assertTrue(_homePage.checkItemsOnWishListPage());
	}

	private static final HomePage _homePage = new HomePage();
}
