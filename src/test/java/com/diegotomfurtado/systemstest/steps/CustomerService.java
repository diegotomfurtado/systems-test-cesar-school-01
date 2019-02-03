package com.diegotomfurtado.systemstest.steps;

import java.util.concurrent.TimeUnit;

import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CustomerService {

	@Before
	public static void setUpAll() {

		SeleniumReadPropertyKeys.DRIVER.manage().timeouts().implicitlyWait(SeleniumReadPropertyKeys.getTimeOut(),
				TimeUnit.SECONDS);
		SeleniumReadPropertyKeys.DRIVER.get(SeleniumReadPropertyKeys.getUrlToHome());
	}

	@Given("^a user <\"([^\"]*)\"> on the customer service place$")
	public void a_user_on_the_customer_service_place(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Netshoes will <\"([^\"]*)\"> him$")
	public void netshoes_will_him(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
