package com.diegotomfurtado.systemstest.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.diegotomfurtado.systemstest.pages.HomePage;
import com.diegotomfurtado.systemstest.pages.SearchPage;
import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FilteringShoesFromHomePageStep {

	@Before
	public static void setUpAll() {

		SeleniumReadPropertyKeys.DRIVER.manage().timeouts().implicitlyWait(SeleniumReadPropertyKeys.getTimeOut(),
				TimeUnit.SECONDS);
		SeleniumReadPropertyKeys.DRIVER.get(SeleniumReadPropertyKeys.getUrlToHome());
	}

	@Given("^a user is on Home page without login$")
	public void aUserIsOnHomePageWithoutLogin() {

		_homePage.checkingIfThereIsALogInElementOnHomePage();
		Assert.assertEquals("Entrar", "Entrar");
	}

	@When("^a user search \"([^\"]*)\" on the filter$")
	public void aUserSearchOnTheFilter(String textToInput){

		_homePage.inputTextOnMainFilter(textToInput);
		_homePage.clickOnButtonMainFilter();
	}

	@Then("^a user will see \"([^\"]*)\" available on Netshoes$")
	public void aUserWillSeeAvailableOnNetshoes(String getTextFromFilter){

		_searchPage.checkingIfThereIsProductList();
		Assert.assertTrue(_searchPage.getProductReturnFromTheFilter().contains(getTextFromFilter));
	}

	private static final HomePage _homePage = new HomePage();
	private static final SearchPage _searchPage = new SearchPage();
}
