package com.diegotomfurtado.systemstest.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.diegotomfurtado.systemstest.utils.CommonMethods;

public class LoginPage {

	public void clickOnSignInButton() {
		_commonMethods.clickOnButton(_clickToLoginPage);
	}

	public void typeEmailAddressOnLoginForm() {

		_commonMethods.input(_typeOnSignInUserName, "diegotomfurtado@gmail.com");
	}

	public void typePasswordOnLoginForm() {
		_commonMethods.input(_typeOnSignInPassword, "r3m3mb3r");
	}

	public void goToUserAccount() {

		_commonMethods.clickOnButton(_clickOnAccessLogInButton);
	}

	CommonMethods _commonMethods = new CommonMethods();

	private static final By _clickToLoginPage = xpath("//a[contains(@href,'login')]");
	private static final By _typeOnSignInUserName = xpath("//input[@id='username']");
	private static final By _typeOnSignInPassword = xpath("//input[@id='password']");
	private static final By _clickOnAccessLogInButton = xpath("//*[@id=\"login-button\"]");
}
