package com.diegotomfurtado.systemstest.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.diegotomfurtado.systemstest.utils.CommonMethods;

public class HomePage {

	public void inputTextOnMainFilter(String textToInput) {

		_commonMethods.input(_mailFilterOnTheTopHeader, textToInput);
	}

	public void clickOnButtonMainFilter() {

		_commonMethods.clickOnButton(_buttonMainFilter);
	}

	public void checkingIfThereIsALogInElementOnHomePage() {

		_commonMethods.clickOnButton(_bannerFromHomePage);
	}
	
	public void filteringBySpecificProduct(String textToInput) {

		inputTextOnMainFilter(textToInput);
		clickOnButtonMainFilter();
	}
	
	public void clickOnButtonCustomerService() {

		_commonMethods.clickOnButton(_customerServicePage);
	}
	
	public void verifyIfSocialMediaIsPresentOnPage() {

		_commonMethods.returnElementFromPage(_verifySocialMediaPresent);
	}
	
	public void clickOnSocialMediaLink() {

		_commonMethods.clickOnButton(_redirectToSocialMedia);
	}

	private static final CommonMethods _commonMethods = new CommonMethods();
	private static final By _mailFilterOnTheTopHeader = xpath("//input[@id='search-input']");
	private static final By _buttonMainFilter = xpath("//button[contains(@class,'border ns-icon ns-icon-search')]");
	private static final By _bannerFromHomePage = xpath("//div[@id='header-user-anonymous']");
	private static final By _customerServicePage = xpath("//a[@class='central-doubts-button']");
	private static final By _verifySocialMediaPresent = xpath("//ul[@class='share-bar-social']");
	private static final By _redirectToSocialMedia = xpath("//ul[@class='share-bar-social']//a[contains(@class, 'instagram')]");
	
}
