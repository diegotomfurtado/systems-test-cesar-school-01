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

	public boolean creditCardPackage() {

		return _commonMethods.findElementOnPage(_creditCardsElements);
	}

	public boolean ListOfCredCards(String creditCard) {

		String convertXpathInString = _creditCardsList.toString();
		String replaceString = convertXpathInString.replace("By.xpath: ", "");

		By convertStringToXpath = xpath(replaceString.replace("@title='", "@title='" + creditCard + ""));

		return _commonMethods.findElementOnPage(convertStringToXpath);
	}
	public void performLogin() {
		
		_commonMethods.clickOnButton(_clickOnLoginButton);
		_loginPage.clickOnSignInButton();
		_loginPage.typeEmailAddressOnLoginForm();
		_loginPage.typePasswordOnLoginForm();
		_loginPage.goToUserAccount();
	}
	
	public void clickToCloseMarketPopup() {
		
		_commonMethods.clickOnButton(_closeMarketPopup);
	}

	public void selectItemsToMyWishList() {

		_commonMethods.clickOnButton(_myWishListLocator);
	}
	
	public void clickOnMyWishListButton() {

		_commonMethods.clickOnButton(_myWishListButtonLocator);
	}
	
	public boolean checkItemsOnWishListPage() {

		return _commonMethods.findElementOnPage(_myWishList);
	}

	private static final CommonMethods _commonMethods = new CommonMethods();
	private static final LoginPage _loginPage = new LoginPage();
	
	private static final By _mailFilterOnTheTopHeader = xpath("//input[@id='search-input']");
	private static final By _buttonMainFilter = xpath("//button[contains(@class,'border ns-icon ns-icon-search')]");
	private static final By _bannerFromHomePage = xpath("//div[@id='header-user-anonymous']");
	private static final By _customerServicePage = xpath("//a[@class='central-doubts-button']");
	private static final By _verifySocialMediaPresent = xpath("//ul[@class='share-bar-social']");
	private static final By _redirectToSocialMedia = xpath("//ul[@class='share-bar-social']//a[contains(@class, 'youtube')]");
	private static final By _creditCardsElements = xpath("//ul[@class = 'payment-flag-list ']");
	private static final By _creditCardsList = xpath("//ul[@class = 'payment-flag-list ']//*[@title='']");
	private static final By _clickOnLoginButton = xpath("//*[@class='ns-icon ns-icon-arrow-down prv-action ns-void-link']//i[@class='ns-icon-user-ico']");
	private static final By _closeMarketPopup = xpath("//*[@class=\"fechar-x\"]");
	private static final By _myWishListLocator = xpath("//*[@class='wishlist__heart']");
	private static final By _myWishListButtonLocator = xpath("//*[@class='my-wishlist']//a[contains(@href,'wishlist')]");
	private static final By _myWishList = xpath("//*[@class='wishlist__items-list']");
	

}
