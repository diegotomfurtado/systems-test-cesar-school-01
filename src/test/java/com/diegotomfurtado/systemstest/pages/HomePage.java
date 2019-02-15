package com.diegotomfurtado.systemstest.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.diegotomfurtado.systemstest.utils.CommonMethods;

public class HomePage {

	public void inputTextOnMainFilter(String textToInput) {

		_commonMethods.input(_mailFilterOnTheTopHeaderLocator, textToInput);
	}

	public void clickOnButtonMainFilter() {

		_commonMethods.clickOnButton(_buttonMainFilterLocator);
	}

	public void checkingIfThereIsALogInElementOnHomePage() {

		_commonMethods.clickOnButton(_bannerFromHomePageLocator);
	}

	public void filteringBySpecificProduct(String textToInput) {

		inputTextOnMainFilter(textToInput);
		clickOnButtonMainFilter();
	}

	public void clickOnButtonCustomerService() {

		_commonMethods.clickOnButton(_customerServicePageLocator);
	}

	public void verifyIfSocialMediaIsPresentOnPage() {

		_commonMethods.returnElementFromPage(_verifySocialMediaPresentLocator);
	}

	public void clickOnSocialMediaLink() {

		_commonMethods.clickOnButton(_redirectToSocialMediaLocator);
	}

	public boolean creditCardPackage() {

		return _commonMethods.findElementOnPage(_creditCardsElementsLocator);
	}

	public boolean ListOfCredCards(String creditCard) {

		String convertXpathInString = _creditCardsListLocator.toString();
		String replaceString = convertXpathInString.replace("By.xpath: ", "");

		By convertStringToXpath = xpath(replaceString.replace("@title='", "@title='" + creditCard + ""));

		return _commonMethods.findElementOnPage(convertStringToXpath);
	}
	public void performLogin() {
		
		_commonMethods.clickOnButton(_clickOnLoginButtonLocator);
		_loginPage.clickOnSignInButton();
		_loginPage.typeEmailAddressOnLoginForm();
		_loginPage.typePasswordOnLoginForm();
		_loginPage.goToUserAccount();
	}
	
	public void clickToCloseMarketPopup() {
		
		_commonMethods.clickOnButton(_closeMarketPopupLocator);
	}

	public void selectItemsToMyWishList() {

		_commonMethods.clickOnButton(_myWishListIconLocator);
	}
	
	public void clickOnMyWishListButton() {

		_commonMethods.clickOnButton(_myWishListButtonLocator);
	}
	
	public boolean checkItemsOnWishListPage() {

		return _commonMethods.findElementOnPage(_myWishListLocator);
	}

	private static final CommonMethods _commonMethods = new CommonMethods();
	private static final LoginPage _loginPage = new LoginPage();
	
	private static final By _bannerFromHomePageLocator = xpath("//div[@id='header-user-anonymous']");
	private static final By _buttonMainFilterLocator = xpath("//button[contains(@class,'border ns-icon ns-icon-search')]");
	private static final By _clickOnLoginButtonLocator = xpath("//*[@class='ns-icon ns-icon-arrow-down prv-action ns-void-link']//i[@class='ns-icon-user-ico']");
	private static final By _closeMarketPopupLocator = xpath("//*[@class=\"fechar-x\"]");
	private static final By _creditCardsElementsLocator = xpath("//ul[@class = 'payment-flag-list ']");
	private static final By _creditCardsListLocator = xpath("//ul[@class = 'payment-flag-list ']//*[@title='']");
	private static final By _customerServicePageLocator = xpath("//a[@class='central-doubts-button']");
	private static final By _mailFilterOnTheTopHeaderLocator = xpath("//input[@id='search-input']");
	private static final By _myWishListButtonLocator = xpath("//*[@class='my-wishlist']//a[contains(@href,'wishlist')]");
	private static final By _myWishListIconLocator = xpath("//*[@class='wishlist__heart']");
	private static final By _myWishListLocator = xpath("//*[@class='wishlist__items-list']");
	private static final By _redirectToSocialMediaLocator = xpath("//ul[@class='share-bar-social']//a[contains(@class, 'youtube')]");
	private static final By _verifySocialMediaPresentLocator = xpath("//ul[@class='share-bar-social']");
	

}
