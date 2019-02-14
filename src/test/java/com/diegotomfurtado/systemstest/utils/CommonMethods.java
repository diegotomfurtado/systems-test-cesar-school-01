package com.diegotomfurtado.systemstest.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.diegotomfurtado.systemstest.pages.HomePage;
import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;
import com.liferay.gs.testFramework.SeleniumWaitMethods;

public class CommonMethods {

	public void clickOnFilterField(By locator) {
		waitElementVisibilityAndBeClickable(locator);
		SeleniumReadPropertyKeys.DRIVER.findElement(locator).click();
	}

	public void clickOnButton(By locator) {
		waitElementVisibilityAndBeClickable(locator);
		SeleniumReadPropertyKeys.DRIVER.findElement(locator).click();
	}

	public void checkProductsList(By locator) {

		waitElementAppearOnScreen(locator);
	}

	public void input(By locator, String input) {

		waitElementVisibilityAndBeClickable(locator);
		SeleniumReadPropertyKeys.DRIVER.findElement(locator).clear();
		SeleniumReadPropertyKeys.DRIVER.findElement(locator).sendKeys(input);
	}

	public String readingTheFilterResult(By locator) {

		waitElementAppearOnScreen(locator);
		return SeleniumReadPropertyKeys.DRIVER.findElement(locator).getText();
	}

	public boolean findElementOnPage(By locator) {

		waitElementAppearOnScreen(locator);
		return SeleniumReadPropertyKeys.DRIVER.findElement(locator).isDisplayed();
	}

	public void waitElementAppearOnScreen(By locator) {
		SeleniumWaitMethods.getWaitDriver().until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		SeleniumWaitMethods.getWaitDriver().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitElementVisibilityAndBeClickable(By locator) {
		waitElementAppearOnScreen(locator);
		SeleniumWaitMethods.getWaitDriver().until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void returnToPreviousPage() {

		SeleniumReadPropertyKeys.DRIVER.navigate().back();
	}

	public void clickOnFirstProduct(By locator) {

		waitElementVisibilityAndBeClickable(locator);
		action.moveToElement(SeleniumReadPropertyKeys.DRIVER.findElement(locator)).build().perform();
		clickOnButton(locator);
	}

	public String returnElementFromPage(By locator) {

		waitElementVisibilityAndBeClickable(locator);
		return SeleniumReadPropertyKeys.DRIVER.findElement(locator).getText();
	}

	public String returnList(By locator) {

		waitElementVisibilityAndBeClickable(locator);
		return SeleniumReadPropertyKeys.DRIVER.findElement(locator).getText();
	}

	public void switchToNewWindowPage() throws InterruptedException {
		for (String winHandle : SeleniumReadPropertyKeys.DRIVER.getWindowHandles()) {

			Thread.sleep(3000);
			SeleniumReadPropertyKeys.DRIVER.switchTo().window(winHandle);
		}
	}

	Actions action = new Actions(SeleniumReadPropertyKeys.DRIVER);
	HomePage _homePage = new HomePage();
}
