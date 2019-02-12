package com.diegotomfurtado.systemstest.steps;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import com.diegotomfurtado.systemstest.pages.CustomerServicePage;
import com.diegotomfurtado.systemstest.pages.HomePage;
import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;

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
	public void a_user_is_looking_for_a_place_where_he_could_ask_something() {

		_homePage.clickOnButtonCustomerService();
	}

	@When("^a user found it he will <\"([^\"]*)\"> on the customer service place$")
	public void a_user_found_it_he_will_on_the_customer_service_place(String typeOnHelpField) {

		_customerServicePage.typeOnHelpField(typeOnHelpField);
		_customerServicePage.clickOnSearchElement();
		Assert.assertTrue(true);
	}

	@Then("^Netshoes will answer <\"([^\"]*)\">$")
	public void netshoes_will_answer(String resultFromSearch){
		
		Assert.assertEquals(resultFromSearch, _customerServicePage.lookingFor());
		Assert.assertTrue(_customerServicePage.returnAListWithPossibleResults());
	}

	HomePage _homePage = new HomePage();
	CustomerServicePage _customerServicePage = new CustomerServicePage();
}
