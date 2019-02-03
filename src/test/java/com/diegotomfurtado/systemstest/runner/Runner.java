package com.diegotomfurtado.systemstest.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;
import com.liferay.gs.testFramework.SeleniumWaitMethods;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		snippets = SnippetType.CAMELCASE, 
		dryRun = false, 
		features = 
				{
				"src/test/resources/acceptancecriteria/FilteringAnyThingFromHomePage.feature",
				"src/test/resources/acceptancecriteria/PuttingStuffOnTheCart.feature" 
				}, 
		glue = 
				{
				"com.diegotomfurtado.systemstest.steps" 
				}, 
		tags = 
				{ 
				"@TestRun",
				"~@Ignore"
				}, 
		plugin = "html:target/report.html")

public class Runner {
	public static Boolean runnedFromAllTestsSuite = false;

	@AfterClass
	public static void afterClass() throws Exception {
		runnedFromAllTestsSuite = false;
		closeDriver();
	}

	@BeforeClass
	public static void beforeClass() throws Exception {
		runnedFromAllTestsSuite = true;
	}

	public static void closeDriver() {
		if (!runnedFromAllTestsSuite) {
			if (SeleniumReadPropertyKeys.DRIVER.toString().contains("chrome")) {
				SeleniumReadPropertyKeys.DRIVER.close();
				SeleniumWaitMethods.waitMediumTime();
				SeleniumWaitMethods.waitMediumTime();
				SeleniumWaitMethods.waitMediumTime();
				SeleniumReadPropertyKeys.DRIVER.quit();
			} else {
				SeleniumReadPropertyKeys.DRIVER.quit();
			}
		}
	}
}
