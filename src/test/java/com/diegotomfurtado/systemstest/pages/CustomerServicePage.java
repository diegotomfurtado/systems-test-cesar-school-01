package com.diegotomfurtado.systemstest.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.diegotomfurtado.systemstest.utils.CommonMethods;


public class CustomerServicePage {

	public void typeOnHelpField(String typeOnHelpField) {
		
		_commonService.input(_helpField, typeOnHelpField);
	}
	
	public void clickOnSearchElement() {
		
		_commonService.clickOnButton(_searchElement);
	}
	
	public String lookingFor() {
		
		return _commonService.returnElementFromPage(_resultAfterSearch);
	}

	public boolean returnAListWithPossibleResults() {

		String returnElementFromSearch = _commonService.returnElementFromPage(_emptyList);
		
		if (returnElementFromSearch.isEmpty()){
			
			return false;
		}
		else {
			
//			_commonService.returnNumberOfTheList(_listFromHelpSearched);
			return true;
		}
			
	}
	
	CommonMethods _commonService = new CommonMethods();
	private static final By _helpField = xpath("//input[@id='dt-faq-search-input']");
	private static final By _searchElement = xpath("//button[@id='dt-faq-search-button']");
	private static final By _resultAfterSearch = xpath("//i[@class='ng-binding']");
	private static final By _emptyList = xpath("//strong[@class='ng-binding']");
	private static final By _listFromHelpSearched = xpath("//ul[@class='dt-faq-question-list ng-scope']");
}
