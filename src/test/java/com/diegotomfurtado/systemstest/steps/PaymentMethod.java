package com.diegotomfurtado.systemstest.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.diegotomfurtado.systemstest.pages.HomePage;
import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PaymentMethod {

	@Before
	public static void setUpAll() {

		SeleniumReadPropertyKeys.DRIVER.manage().timeouts().implicitlyWait(SeleniumReadPropertyKeys.getTimeOut(),
				TimeUnit.SECONDS);
		SeleniumReadPropertyKeys.DRIVER.get(SeleniumReadPropertyKeys.getUrlToHome());
	}
	
	@Given("^I know where are the payment method information$")
	public void iKnowWhereAreThePaymentMethodInformation(){

		Assert.assertTrue(_homePage.creditCardPackage());
	}

	@Then("^I will check if \"([^\"]*)\" are a avalable$")
	public void iWillCheckIfAreAAvalable(String creditCard) {

		Assert.assertTrue(_homePage.ListOfCredCards(creditCard));
	}
	
	HomePage _homePage = new HomePage();

}
