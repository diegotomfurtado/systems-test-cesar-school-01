package com.diegotomfurtado.systemstest.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.diegotomfurtado.systemstest.utils.CommonMethods;

public class LoginPage {

	public void clickOnSignInButton() {
		_commonMethods.clickOnButton(_clickToLoginPageLocator);
	}

	public void typeEmailAddressOnLoginForm()  {

		_commonMethods.input(_typeOnSignInUserNameLocator, "diegotomfurtado@gmail.com");
	}

	public void typePasswordOnLoginForm() {
		_commonMethods.input(_typeOnSignInPasswordLocator, "r3m3mb3r");
	}

	public void goToUserAccount() {

		_commonMethods.clickOnButton(_clickOnAccessLogInButtonLocator);
	}

	CommonMethods _commonMethods = new CommonMethods();

	private static final By _clickOnAccessLogInButtonLocator = xpath("//*[@id='login-button']");
	private static final By _clickToLoginPageLocator = xpath("//a[contains(@href,'login')]");
	private static final By _typeOnSignInUserNameLocator = xpath("//input[@id='username']");
	private static final By _typeOnSignInPasswordLocator = xpath("//input[@id='password']");
}
