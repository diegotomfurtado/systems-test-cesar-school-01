package com.diegotomfurtado.systemstest.steps;

import java.util.concurrent.TimeUnit;

import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerService {

	@Before
	public static void setUpAll() {

		SeleniumReadPropertyKeys.DRIVER.manage().timeouts().implicitlyWait(SeleniumReadPropertyKeys.getTimeOut(),
				TimeUnit.SECONDS);
		SeleniumReadPropertyKeys.DRIVER.get(SeleniumReadPropertyKeys.getUrlToHome());
	}

	@Given("^a user is looking for a place where he could ask something$")
	public void a_user_is_looking_for_a_place_where_he_could_ask_something() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^a user found it he will <\"([^\"]*)\"> on the customer service place$")
	public void a_user_found_it_he_will_on_the_customer_service_place(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Netshoes will answer him$")
	public void netshoes_will_answer_him() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
