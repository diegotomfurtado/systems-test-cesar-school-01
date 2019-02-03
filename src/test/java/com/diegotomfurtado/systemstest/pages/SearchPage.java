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

		_commonMethods.clickOnButton(_chooseOrderProductList);
	}

	public void selectAnyProductFromTheProductList() {

		_commonMethods.clickOnFirstProduct(_conferingAProduct);
	}

	public void chooseTheHighestPrice() {

		clickOnDropListFromSearchOrderButton();
		chooseTheHighestPriceOnSearchOrderButton();
		selectAnyProductFromTheProductList();
	}

	public void selectASizeOfProduct() {

		_commonMethods.clickOnButton(_chooseTheSizeProduct);
	}

	public void selectAnotherSizeOfProduct() {

		_commonMethods.clickOnButton(_chooseAnotherSizeProduct);
	}

	public void clickOnTheButtonAddOnCart() {

		_commonMethods.clickOnButton(_buttonAddOnCart);
	}

	public void puttingTheProductOnTheCart() {

		selectASizeOfProduct();
		clickOnTheButtonAddOnCart();
	}

	public void puttingMoreThanOneProductOnTheCart() {

		selectAnotherSizeOfProduct();
		clickOnTheButtonAddOnCart();
	}

	private static final CommonMethods _commonMethods = new CommonMethods();

	private static final By _productList = xpath("//div[contains(@class, 'item card-desktop') and @sku]");
	private static final By _readingTheFilterResult = xpath("//h1[contains(@class, 'search-query')]");
	private static final By _searchOrderButton = xpath("//li[@class='item']");
	private static final By _chooseOrderProductList = xpath(
			"//li[@class = 'item opened']//a[contains(@href,'highest-first')]");
	private static final By _conferingAProduct = xpath("//a[@class ='i card-link']");
//	private static final By _conferingAProduct = xpath("//button[@id ='quick-view-button' and text() = 'Conferir']");
	private static final By _chooseTheSizeProduct = xpath("//a[@class = 'product-item' and @qa-option= 'available']");
	private static final By _chooseAnotherSizeProduct = xpath(
			"//ul[@class = 'radio-options']//li[not(@class='unavailable')][2]");
	private static final By _buttonAddOnCart = xpath("//button[@id='buy-button-now']");

}