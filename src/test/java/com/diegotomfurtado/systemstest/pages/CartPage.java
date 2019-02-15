package com.diegotomfurtado.systemstest.pages;

import com.diegotomfurtado.systemstest.utils.CommonMethods;

public class CartPage {

	public boolean puttingIntoTheCartWhileHasMoney(double getTotalMoneyToInvest) {

		Double totalPriceFromCart = _commonMethods.getTotalPriceFromCart();

		while (totalPriceFromCart <= getTotalMoneyToInvest) {

			_commonMethods.returnToPreviousPage();
			_commonMethods.returnToPreviousPage();
			_searchPage.chooseTheNewReleasePrice();
			_searchPage.selectAProductFromTheProductList();
			_searchPage.puttingTheProductOnTheCart();

			totalPriceFromCart = _commonMethods.getTotalPriceFromCart();
		}

		if (totalPriceFromCart > getTotalMoneyToInvest) {

			_searchPage.removingAProductOnTheCart();
		}

		return true;
	}

	private static final CommonMethods _commonMethods = new CommonMethods();
	private static final SearchPage _searchPage = new SearchPage();
}
