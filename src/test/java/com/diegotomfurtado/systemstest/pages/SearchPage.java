package com.diegotomfurtado.systemstest.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.diegotomfurtado.systemstest.utils.CommonMethods;

public class SearchPage {

	public void checkingIfThereIsProductList() {

		_commonMethods.checkProductsList(_productListLocator);
	}

	public String getProductReturnFromTheFilter() {

		String getTextFromFilter = _commonMethods.readingTheFilterResult(_readingTheFilterResultLocator);
		return getTextFromFilter;
	}

	public void clickOnDropListFromSearchOrderButton() {

		_commonMethods.clickOnButton(_searchOrderButtonLocator);
	}

	public void chooseTheHighestPriceOnSearchOrderButton() {

		_commonMethods.clickOnButton(_chooseOnProductListByHighestPriceLocator);
	}

	public void chooseTheNewReleasePriceOnSearchOrderButton() {

		_commonMethods.clickOnButton(_chooseOnProductListByNewReleasePriceLocator);
	}

	public void chooseTheLowestPriceOnSearchOrderButton() {

		_commonMethods.clickOnButton(_chooseOnProductListByLowestPriceLocator);
	}

	public void selectAProductFromTheProductList() {

		_commonMethods.clickOnFirstProduct(_conferingAProductLocator);
	}

	public void chooseTheHighestPrice() {

		clickOnDropListFromSearchOrderButton();
		chooseTheHighestPriceOnSearchOrderButton();
	}

	public void chooseTheNewReleasePrice() {

		clickOnDropListFromSearchOrderButton();
		chooseTheNewReleasePriceOnSearchOrderButton();
	}

	public void chooseTheLowestPrice() {

		clickOnDropListFromSearchOrderButton();
		chooseTheLowestPriceOnSearchOrderButton();
	}

	public void selectASizeOfProduct() {

		try {
			_commonMethods.clickOnButton(_chooseTheSizeProductLocator);
		} catch (Exception e) {

			_commonMethods.returnToPreviousPage();
			chooseTheLowestPrice();
			puttingTheProductOnTheCart();
		}
	}

	public void clickOnTheButtonAddOnCart() {

		try {
			
			_commonMethods.clickOnButton(_addOnCartLocator);
		} catch (Exception e) {

			_commonMethods.returnToPreviousPage();
			_commonMethods.returnToPreviousPage();
			chooseTheLowestPrice();
			puttingTheProductOnTheCart();
		}
	}

	public void puttingTheProductOnTheCart() {

		selectAProductFromTheProductList();
		selectASizeOfProduct();
		clickOnTheButtonAddOnCart();
	}

	public void removingAProductOnTheCart() {

		_commonMethods.clickOnButton(_removingTheLastItemFromTheCartLocator);
	}


	private static final CommonMethods _commonMethods = new CommonMethods();

	private static final By _addOnCartLocator = xpath("//button[@id='buy-button-now']");
	private static final By _chooseOnProductListByHighestPriceLocator = xpath(
			"//li[@class = 'item opened']//a[contains(@href,'highest-first')]");
	private static final By _chooseOnProductListByNewReleasePriceLocator = xpath(
			"//li[@class = 'item opened']//a[contains(@href,'new-releases')]");
	private static final By _chooseOnProductListByLowestPriceLocator = xpath(
			"//li[@class = 'item opened']//a[contains(@href,'lowest-first')]");
	private static final By _chooseTheSizeProductLocator = xpath("//a[@class = 'product-item' and @qa-option= 'available']");
	private static final By _conferingAProductLocator = xpath("//a[@class ='i card-link']");
	private static final By _productListLocator = xpath("//div[contains(@class, 'item card-desktop') and @sku]");
	private static final By _readingTheFilterResultLocator = xpath("//h1[contains(@class, 'search-query')]");
	private static final By _removingTheLastItemFromTheCartLocator = xpath(
			"//tr[contains(@class,'product-line')][2]//*[@class='actions']");
	private static final By _searchOrderButtonLocator = xpath("//li[@class='item']");
}
