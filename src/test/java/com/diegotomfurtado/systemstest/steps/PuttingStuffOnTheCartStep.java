package com.diegotomfurtado.systemstest.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.diegotomfurtado.systemstest.pages.CartPage;
import com.diegotomfurtado.systemstest.pages.HomePage;
import com.diegotomfurtado.systemstest.pages.SearchPage;
import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PuttingStuffOnTheCartStep {

	@Before
	public static void setUpAll() {

		SeleniumReadPropertyKeys.DRIVER.manage().timeouts().implicitlyWait(SeleniumReadPropertyKeys.getTimeOut(),
				TimeUnit.SECONDS);
		SeleniumReadPropertyKeys.DRIVER.get(SeleniumReadPropertyKeys.getUrlToHome());
	}

	@Given("^a user has (\\d+) reais to spend$")
	public double aUserHasReaisToSpend(double money){

		getTotalMoney = money;
		return getTotalMoney;
	}

	@When("^a user chooses the products \"([^\"]*)\"$")
	public void aUserChoosesTheProducts(String getProductName){

		_homePage.filteringBySpecificProduct(getProductName);
		_searchPage.chooseTheHighestPrice();
		_searchPage.puttingTheProductOnTheCart();
	}

	@Then("^while a user has money will can put more products on the cart$")
	public void whileAUserHasMoneyWillCanPutMoreProductsOnTheCart(){

		Assert.assertTrue(_cartPage.puttingIntoTheCartWhileHasMoney(getTotalMoney));
	}

	double getTotalMoney = 0;
	
	private static final HomePage _homePage = new HomePage();
	private static final SearchPage _searchPage = new SearchPage();
	private static final CartPage _cartPage = new CartPage();
}
