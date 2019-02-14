package com.diegotomfurtado.systemstest.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.diegotomfurtado.systemstest.utils.CommonMethods;


public class WishListPage {

	public void typeOnHelpField(String typeOnHelpField) {
		
		_commonMethods.input(_helpField, typeOnHelpField);
	}
	
	public void clickOnSearchElement() {
		
		_commonMethods.clickOnButton(_searchElement);
	}
	
	public String lookingFor() {
		
		return _commonMethods.returnElementFromPage(_resultAfterSearch);
	}

	public boolean returnAListWithPossibleResults() {

		String returnElementFromSearch = _commonMethods.returnElementFromPage(_emptyList);
		
		if (returnElementFromSearch.isEmpty()){
			
			return false;
		}
		else {
			
			return true;
		}
			
	}
	
	private static final CommonMethods _commonMethods = new CommonMethods();
	
	private static final By _helpField = xpath("//input[@id='dt-faq-search-input']");
	private static final By _searchElement = xpath("//button[@id='dt-faq-search-button']");
	private static final By _resultAfterSearch = xpath("//i[@class='ng-binding']");
	private static final By _emptyList = xpath("//strong[@class='ng-binding']");
}
