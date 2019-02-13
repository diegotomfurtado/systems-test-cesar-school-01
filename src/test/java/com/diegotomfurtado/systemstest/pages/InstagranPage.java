package com.diegotomfurtado.systemstest.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.diegotomfurtado.systemstest.utils.CommonMethods;

public class InstagranPage {

	public String checkingIfSocialMediaIsAvailable() {

		return _commonMethods.returnElementFromPage(_netshoesTagOnInstagran);
	}

	public void clickToremoveAModalAlert() {

		_commonMethods.clickOnButton(_clickToRemoveAModalAlert);
	}
	
	private static final CommonMethods _commonMethods = new CommonMethods();
	private static final By _netshoesTagOnInstagran = xpath("//*[contains(@class, '_7UhW9')]");
	private static final By _clickToRemoveAModalAlert = xpath("//button[contains(@class,'dCJp8')]");

}
