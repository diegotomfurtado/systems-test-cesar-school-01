package com.diegotomfurtado.systemstest.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.diegotomfurtado.systemstest.utils.CommonMethods;


public class WishListPage {

	public void typeOnHelpField(String typeOnHelpField) {
		
		_commonMethods.input(_helpFieldLocator, typeOnHelpField);
	}
	
	public void clickOnSearchElement() {
		
		_commonMethods.clickOnButton(_searchElementLocator);
	}
	
	public String lookingFor() {
		
		return _commonMethods.returnElementFromPage(_resultAfterSearchLocator);
	}

	public boolean returnAListWithPossibleResults() {

		String returnElementFromSearch = _commonMethods.returnElementFromPage(_emptyListLocator);
		
		if (returnElementFromSearch.isEmpty()){
			
			return false;
		}
		else {
			
			return true;
		}
			
	}
	
	private static final CommonMethods _commonMethods = new CommonMethods();
	
	private static final By _helpFieldLocator = xpath("//input[@id='dt-faq-search-input']");
	private static final By _searchElementLocator = xpath("//button[@id='dt-faq-search-button']");
	private static final By _resultAfterSearchLocator = xpath("//i[@class='ng-binding']");
	private static final By _emptyListLocator = xpath("//strong[@class='ng-binding']");
}
