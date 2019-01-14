package com.diegotomfurtado.systemstest.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.diegotomfurtado.systemstest.utils.CommonMethods;

public class CartPage {

	public Double getTotalPriceFromCart() {

		double resultTotalFromCart = 0;
		String real;

		String getTextFromFilter = _commonMethods.readingTheFilterResult(_totalPriceFromCart);

		if (getTextFromFilter.length() <= 9) {

			// Getting the Total from the Cart and convert to double.
			resultTotalFromCart = Double
					.parseDouble(getTextFromFilter.substring(getTextFromFilter.indexOf("R") + 3).replace(",", "."));

			return resultTotalFromCart;

		} else

			real = getTextFromFilter.replace(".", "");

			// Getting the Total from the Cart and convert to double.
			resultTotalFromCart = Double.parseDouble(real.substring(getTextFromFilter.indexOf("R") + 3).replace(",", "."));
	
			return resultTotalFromCart;
	}

	public boolean fillingTheCart(int totalMoneyToSpend) {

		Double totalPriceFromCart = getTotalPriceFromCart();

		while (totalPriceFromCart <= totalMoneyToSpend) {

			_commonMethods.returnToPreviousPage();
			_searchPage.puttingMoreThanOneProductOnTheCart();

			totalPriceFromCart = getTotalPriceFromCart();

			System.out.println("Actual Amount Price: " + totalPriceFromCart);
		}

		return true;
	}

	private static final CommonMethods _commonMethods = new CommonMethods();
	private static final SearchPage _searchPage = new SearchPage();
	private static final By _totalPriceFromCart = xpath("//p[@class='cart-price-text']");
}
