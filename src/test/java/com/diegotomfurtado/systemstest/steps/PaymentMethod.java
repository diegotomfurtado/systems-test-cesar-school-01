package com.diegotomfurtado.systemstest.steps;

import java.util.concurrent.TimeUnit;

import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;

import cucumber.api.PendingException;
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
	public void i_know_where_are_the_payment_method_information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I will check if <\"([^\"]*)\"> are a avalable$")
	public void i_will_check_if_are_a_avalable(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
