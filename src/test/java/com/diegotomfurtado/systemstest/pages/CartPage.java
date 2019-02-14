package com.diegotomfurtado.systemstest.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.diegotomfurtado.systemstest.utils.CommonMethods;

public class CartPage {

	public Double getTotalPriceFromCart() {

		double resultTotalFromCart = 0;
		String real;
		String getTextFromFilter = null;

		try {

			getTextFromFilter = _commonMethods.readingTheFilterResult(_totalPriceFromCartUI01);

		} catch (Exception e) {

			getTextFromFilter = _commonMethods.readingTheFilterResult(_totalPriceFromCartUI02);

		} finally {

			if (getTextFromFilter.length() <= 9) {

				// Getting the Total from the Cart and convert to double.
				resultTotalFromCart = Double
						.parseDouble(getTextFromFilter.substring(getTextFromFilter.indexOf("R") + 3).replace(",", "."));

				return resultTotalFromCart;

			} else

				real = getTextFromFilter.replace(".", "");

			// Getting the Total from the Cart and convert to double.
			resultTotalFromCart = Double
					.parseDouble(real.substring(getTextFromFilter.indexOf("R") + 3).replace(",", "."));

		}

		return resultTotalFromCart;

	}

	public boolean puttingIntoTheCartWhileHasMoney(double getTotalMoneyToInvest) {

		Double totalPriceFromCart = getTotalPriceFromCart();

		while (totalPriceFromCart <= getTotalMoneyToInvest) {

			_commonMethods.returnToPreviousPage();
			_commonMethods.returnToPreviousPage();
			_searchPage.chooseTheNewReleasePrice();
			_searchPage.selectAProductFromTheProductList();
			_searchPage.puttingTheProductOnTheCart();

			totalPriceFromCart = getTotalPriceFromCart();
		}

		if (totalPriceFromCart > getTotalMoneyToInvest) {

			_searchPage.removingAProductOnTheCart();
		}

		return true;
	}

	private static final CommonMethods _commonMethods = new CommonMethods();
	private static final SearchPage _searchPage = new SearchPage();
	private static final By _totalPriceFromCartUI01 = xpath("//p[@class='cart-price-text']");
	private static final By _totalPriceFromCartUI02 = xpath("//div[@class='upsell__product-price']");
}
