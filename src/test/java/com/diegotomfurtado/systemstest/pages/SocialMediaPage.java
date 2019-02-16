package com.diegotomfurtado.systemstest.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.diegotomfurtado.systemstest.utils.CommonMethods;

public class SocialMediaPage {

	public String checkingIfSocialMediaIsAvailable() throws InterruptedException {

		_commonMethods.switchToNewWindowPage(_checkSocialMediaLocator);
		return _commonMethods.returnElementFromPage(_checkSocialMediaLocator);
	}

	private static final CommonMethods _commonMethods = new CommonMethods();
	private static final By _checkSocialMediaLocator = xpath("//span[@id='channel-title']");
}
