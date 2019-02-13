$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/acceptancecriteria/ListOfSocialMedia.feature");
formatter.feature({
  "line": 2,
  "name": "Social media present on Netshoes",
  "description": "As a lover of social media, I want to know if Netshoes has at least one social media that I can follow",
  "id": "social-media-present-on-netshoes",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TestRun"
    }
  ]
});
formatter.before({
  "duration": 4489963671,
  "status": "passed"
});
formatter.before({
  "duration": 664556743,
  "status": "passed"
});
formatter.before({
  "duration": 651144553,
  "status": "passed"
});
formatter.before({
  "duration": 615067222,
  "status": "passed"
});
formatter.before({
  "duration": 626077741,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Checking if there are at least one social media available",
  "description": "",
  "id": "social-media-present-on-netshoes;checking-if-there-are-at-least-one-social-media-available",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I know where is the social media information",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I will check if there are at least one of that",
  "keyword": "Then "
});
formatter.match({
  "location": "ListOfSocialMedia.i_know_where_is_the_social_media_information()"
});
formatter.result({
  "duration": 228078069,
  "status": "passed"
});
formatter.match({
  "location": "ListOfSocialMedia.i_will_check_if_there_are_at_least_one_of_that()"
});
formatter.result({
  "duration": 10210296321,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of any elements located by By.xpath: //button[contains(@class,\u0027dCJp8\u0027)] (tried for 10 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Diegos-MacBook-Pro-2.local\u0027, ip: \u0027fe80:0:0:0:450:340:a13a:48fc%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.45.615355 (d5698f682d8b27..., userDataDir: /var/folders/d6/2mylyjh14qn...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:49864}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 72.0.3626.96, webStorageEnabled: true}\nSession ID: 37e42f48454e8c424662e37dac195836\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\n\tat com.diegotomfurtado.systemstest.utils.CommonMethods.waitElementAppearOnScreen(CommonMethods.java:41)\n\tat com.diegotomfurtado.systemstest.utils.CommonMethods.waitElementVisibilityAndBeClickable(CommonMethods.java:46)\n\tat com.diegotomfurtado.systemstest.utils.CommonMethods.clickOnButton(CommonMethods.java:18)\n\tat com.diegotomfurtado.systemstest.pages.InstagranPage.clickToremoveAModalAlert(InstagranPage.java:18)\n\tat com.diegotomfurtado.systemstest.steps.ListOfSocialMedia.i_will_check_if_there_are_at_least_one_of_that(ListOfSocialMedia.java:35)\n\tat ✽.Then I will check if there are at least one of that(src/test/resources/acceptancecriteria/ListOfSocialMedia.feature:7)\n",
  "status": "failed"
});
});