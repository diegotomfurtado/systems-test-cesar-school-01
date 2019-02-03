package com.diegotomfurtado.systemstest.steps;

import java.util.concurrent.TimeUnit;

import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;

import cucumber.api.PendingException;
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
	public void i_know_where_is_the_social_media_information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I will check if there are at least one of that$")
	public void i_will_check_if_there_are_at_least_one_of_that() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}
