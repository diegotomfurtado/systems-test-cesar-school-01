package com.diegotomfurtado.systemstest.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.diegotomfurtado.systemstest.utils.CommonMethods;

public class SearchPage {

	public void checkingIfThereIsProductList() {

		_commonMethods.checkProductsList(_productList);
	}

	public String getProductReturnFromTheFilter() {

		String getTextFromFilter = _commonMethods.readingTheFilterResult(_readingTheFilterResult);
		return getTextFromFilter;
	}

	public void clickOnDropListFromSearchOrderButton() {

		_commonMethods.clickOnButton(_searchOrderButton);
	}

	public void chooseTheHighestPriceOnSearchOrderButton() {

		_commonMethods.clickOnButton(_chooseOrderProductListByHighestPrice);
	}

	public void chooseTheNewReleasePriceOnSearchOrderButton() {

		_commonMethods.clickOnButton(_chooseOrderProductListByNewReleasePrice);
	}

	public void chooseTheLowestPriceOnSearchOrderButton() {

		_commonMethods.clickOnButton(_chooseOrderProductListByLowestPrice);
	}

	public void selectAProductFromTheProductList() {

		_commonMethods.clickOnFirstProduct(_conferingAProduct);
	}

	public void chooseTheHighestPrice() {

		clickOnDropListFromSearchOrderButton();
		chooseTheHighestPriceOnSearchOrderButton();
		selectAProductFromTheProductList();
	}

	public void chooseTheNewReleasePrice() {

		clickOnDropListFromSearchOrderButton();
		chooseTheNewReleasePriceOnSearchOrderButton();
		selectAProductFromTheProductList();
	}

	public void chooseTheLowestPrice() {

		clickOnDropListFromSearchOrderButton();
		chooseTheLowestPriceOnSearchOrderButton();
		selectAProductFromTheProductList();
	}

	public void selectASizeOfProduct() {

		try {
			_commonMethods.clickOnButton(_chooseTheSizeProduct);
		} catch (Exception e) {

			_commonMethods.returnToPreviousPage();
			chooseTheLowestPrice();
			puttingTheProductOnTheCart();
		}
	}

	public void clickOnTheButtonAddOnCart() {

		try {
			
			_commonMethods.clickOnButton(_buttonAddOnCart);
		} catch (Exception e) {

			_commonMethods.returnToPreviousPage();
			_commonMethods.returnToPreviousPage();
			chooseTheLowestPrice();
			puttingTheProductOnTheCart();
		}
	}

	public void puttingTheProductOnTheCart() {

		selectASizeOfProduct();
		clickOnTheButtonAddOnCart();
	}

	public void removingAProductOnTheCart() {

		_commonMethods.clickOnButton(_removingTheLastItemFromTheCart);
	}


	private static final CommonMethods _commonMethods = new CommonMethods();

	private static final By _productList = xpath("//div[contains(@class, 'item card-desktop') and @sku]");
	private static final By _readingTheFilterResult = xpath("//h1[contains(@class, 'search-query')]");
	private static final By _searchOrderButton = xpath("//li[@class='item']");
	private static final By _chooseOrderProductListByHighestPrice = xpath(
			"//li[@class = 'item opened']//a[contains(@href,'highest-first')]");
	private static final By _chooseOrderProductListByNewReleasePrice = xpath(
			"//li[@class = 'item opened']//a[contains(@href,'new-releases')]");
	private static final By _chooseOrderProductListByLowestPrice = xpath(
			"//li[@class = 'item opened']//a[contains(@href,'lowest-first')]");
	private static final By _conferingAProduct = xpath("//a[@class ='i card-link']");
	private static final By _chooseTheSizeProduct = xpath("//a[@class = 'product-item' and @qa-option= 'available']");
	private static final By _buttonAddOnCart = xpath("//button[@id='buy-button-now']");
	private static final By _removingTheLastItemFromTheCart = xpath(
			"//tr[contains(@class,'product-line')][2]//*[@class='actions']");
}
