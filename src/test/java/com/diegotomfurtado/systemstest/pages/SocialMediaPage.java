package com.diegotomfurtado.systemstest.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.diegotomfurtado.systemstest.utils.CommonMethods;

public class SocialMediaPage {

	public String checkingIfSocialMediaIsAvailable() throws InterruptedException {

		_commonMethods.switchToNewWindowPage();
		return _commonMethods.returnElementFromPage(_clickToRemoveAModalAlert_Youtube);
	}

	private static final CommonMethods _commonMethods = new CommonMethods();
	private static final By _clickToRemoveAModalAlert_Youtube = xpath("//span[@id='channel-title']");
}
