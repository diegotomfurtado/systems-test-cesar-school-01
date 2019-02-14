$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/acceptancecriteria/FilteringAnyThingFromHomePage.feature");
formatter.feature({
  "line": 2,
  "name": "Choosing any male shoes from the Home page",
  "description": "As a user, without account created, when he choose any stuff from the home page, he hope to see all stuff which Netshoes has.",
  "id": "choosing-any-male-shoes-from-the-home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TestRun"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Filtering any shoes and accessory from the home page",
  "description": "",
  "id": "choosing-any-male-shoes-from-the-home-page;filtering-any-shoes-and-accessory-from-the-home-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "a user search \"\u003canything such as shoes or accessory\u003e\" on the filter",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "a user will see \"\u003ca list from the filter searched\u003e\" available on Netshoes",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "choosing-any-male-shoes-from-the-home-page;filtering-any-shoes-and-accessory-from-the-home-page;",
  "rows": [
    {
      "cells": [
        "anything such as shoes or accessory",
        "a list from the filter searched"
      ],
      "line": 13,
      "id": "choosing-any-male-shoes-from-the-home-page;filtering-any-shoes-and-accessory-from-the-home-page;;1"
    },
    {
      "cells": [
        "calcado masculino",
        "CALCADO MASCULINO"
      ],
      "line": 14,
      "id": "choosing-any-male-shoes-from-the-home-page;filtering-any-shoes-and-accessory-from-the-home-page;;2"
    },
    {
      "cells": [
        "perfume feminino",
        "PERFUME FEMININO"
      ],
      "line": 15,
      "id": "choosing-any-male-shoes-from-the-home-page;filtering-any-shoes-and-accessory-from-the-home-page;;3"
    },
    {
      "cells": [
        "perfume masculino",
        "PERFUME MASCULINO"
      ],
      "line": 16,
      "id": "choosing-any-male-shoes-from-the-home-page;filtering-any-shoes-and-accessory-from-the-home-page;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4997654347,
  "status": "passed"
});
formatter.before({
  "duration": 593069882,
  "status": "passed"
});
formatter.before({
  "duration": 586374083,
  "status": "passed"
});
formatter.before({
  "duration": 673140828,
  "status": "passed"
});
formatter.before({
  "duration": 656416874,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "a user is on Home page without login",
  "keyword": "Given "
});
formatter.match({
  "location": "FilteringShoesFromHomePageStep.aUserIsOnHomePageWithoutLogin()"
});
formatter.result({
  "duration": 239578639,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Filtering any shoes and accessory from the home page",
  "description": "",
  "id": "choosing-any-male-shoes-from-the-home-page;filtering-any-shoes-and-accessory-from-the-home-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestRun"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "a user search \"calcado masculino\" on the filter",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "a user will see \"CALCADO MASCULINO\" available on Netshoes",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "calcado masculino",
      "offset": 15
    }
  ],
  "location": "FilteringShoesFromHomePageStep.aUserSearchOnTheFilter(String)"
});
formatter.result({
  "duration": 6155745222,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CALCADO MASCULINO",
      "offset": 17
    }
  ],
  "location": "FilteringShoesFromHomePageStep.aUserWillSeeAvailableOnNetshoes(String)"
});
formatter.result({
  "duration": 1043202065,
  "status": "passed"
});
formatter.before({
  "duration": 677170587,
  "status": "passed"
});
formatter.before({
  "duration": 842731575,
  "status": "passed"
});
formatter.before({
  "duration": 782972810,
  "status": "passed"
});
formatter.before({
  "duration": 1889736154,
  "status": "passed"
});
formatter.before({
  "duration": 808053496,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "a user is on Home page without login",
  "keyword": "Given "
});
formatter.match({
  "location": "FilteringShoesFromHomePageStep.aUserIsOnHomePageWithoutLogin()"
});
formatter.result({
  "duration": 1314053208,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Filtering any shoes and accessory from the home page",
  "description": "",
  "id": "choosing-any-male-shoes-from-the-home-page;filtering-any-shoes-and-accessory-from-the-home-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestRun"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "a user search \"perfume feminino\" on the filter",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "a user will see \"PERFUME FEMININO\" available on Netshoes",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "perfume feminino",
      "offset": 15
    }
  ],
  "location": "FilteringShoesFromHomePageStep.aUserSearchOnTheFilter(String)"
});
formatter.result({
  "duration": 18841442462,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PERFUME FEMININO",
      "offset": 17
    }
  ],
  "location": "FilteringShoesFromHomePageStep.aUserWillSeeAvailableOnNetshoes(String)"
});
formatter.result({
  "duration": 1537908200,
  "status": "passed"
});
formatter.before({
  "duration": 690924720,
  "status": "passed"
});
formatter.before({
  "duration": 681354690,
  "status": "passed"
});
formatter.before({
  "duration": 840517716,
  "status": "passed"
});
formatter.before({
  "duration": 1867015236,
  "status": "passed"
});
formatter.before({
  "duration": 1731328464,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "a user is on Home page without login",
  "keyword": "Given "
});
formatter.match({
  "location": "FilteringShoesFromHomePageStep.aUserIsOnHomePageWithoutLogin()"
});
formatter.result({
  "duration": 1526925303,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Filtering any shoes and accessory from the home page",
  "description": "",
  "id": "choosing-any-male-shoes-from-the-home-page;filtering-any-shoes-and-accessory-from-the-home-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestRun"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "a user search \"perfume masculino\" on the filter",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "a user will see \"PERFUME MASCULINO\" available on Netshoes",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "perfume masculino",
      "offset": 15
    }
  ],
  "location": "FilteringShoesFromHomePageStep.aUserSearchOnTheFilter(String)"
});
formatter.result({
  "duration": 19208888205,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PERFUME MASCULINO",
      "offset": 17
    }
  ],
  "location": "FilteringShoesFromHomePageStep.aUserWillSeeAvailableOnNetshoes(String)"
});
formatter.result({
  "duration": 1396586631,
  "status": "passed"
});
formatter.uri("src/test/resources/acceptancecriteria/ListOfSocialMedia.feature");
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
  "duration": 686557218,
  "status": "passed"
});
formatter.before({
  "duration": 817663879,
  "status": "passed"
});
formatter.before({
  "duration": 788083198,
  "status": "passed"
});
formatter.before({
  "duration": 833061838,
  "status": "passed"
});
formatter.before({
  "duration": 712360061,
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
  "location": "ListOfSocialMedia.iKnowWhereIsTheSocialMediaInformation()"
});
formatter.result({
  "duration": 1622593726,
  "status": "passed"
});
formatter.match({
  "location": "ListOfSocialMedia.iWillCheckIfThereAreAtLeastOneOfThat()"
});
formatter.result({
  "duration": 6907610495,
  "status": "passed"
});
formatter.uri("src/test/resources/acceptancecriteria/PaymentMethod.feature");
formatter.feature({
  "line": 2,
  "name": "Check the payment method are available",
  "description": "As a customer, I want to know which payment method is available to me.",
  "id": "check-the-payment-method-are-available",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TestRun"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Checking if my payment method are available to buy my stuff at Netshoes",
  "description": "",
  "id": "check-the-payment-method-are-available;checking-if-my-payment-method-are-available-to-buy-my-stuff-at-netshoes",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I know where are the payment method information",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I will check if \"\u003cmy payment method\u003e\" are a avalable",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "check-the-payment-method-are-available;checking-if-my-payment-method-are-available-to-buy-my-stuff-at-netshoes;",
  "rows": [
    {
      "cells": [
        "my payment method"
      ],
      "line": 10,
      "id": "check-the-payment-method-are-available;checking-if-my-payment-method-are-available-to-buy-my-stuff-at-netshoes;;1"
    },
    {
      "cells": [
        "Visa"
      ],
      "line": 11,
      "id": "check-the-payment-method-are-available;checking-if-my-payment-method-are-available-to-buy-my-stuff-at-netshoes;;2"
    },
    {
      "cells": [
        "Mastercard"
      ],
      "line": 12,
      "id": "check-the-payment-method-are-available;checking-if-my-payment-method-are-available-to-buy-my-stuff-at-netshoes;;3"
    },
    {
      "cells": [
        "NCard"
      ],
      "line": 13,
      "id": "check-the-payment-method-are-available;checking-if-my-payment-method-are-available-to-buy-my-stuff-at-netshoes;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 834952779,
  "status": "passed"
});
formatter.before({
  "duration": 2011905830,
  "status": "passed"
});
formatter.before({
  "duration": 2020691808,
  "status": "passed"
});
formatter.before({
  "duration": 1752143040,
  "status": "passed"
});
formatter.before({
  "duration": 1151202034,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Checking if my payment method are available to buy my stuff at Netshoes",
  "description": "",
  "id": "check-the-payment-method-are-available;checking-if-my-payment-method-are-available-to-buy-my-stuff-at-netshoes;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestRun"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I know where are the payment method information",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I will check if \"Visa\" are a avalable",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentMethod.iKnowWhereAreThePaymentMethodInformation()"
});
formatter.result({
  "duration": 1361437708,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Visa",
      "offset": 17
    }
  ],
  "location": "PaymentMethod.iWillCheckIfAreAAvalable(String)"
});
formatter.result({
  "duration": 51762936,
  "status": "passed"
});
formatter.before({
  "duration": 514718660,
  "status": "passed"
});
formatter.before({
  "duration": 1733861543,
  "status": "passed"
});
formatter.before({
  "duration": 698716845,
  "status": "passed"
});
formatter.before({
  "duration": 1936222066,
  "status": "passed"
});
formatter.before({
  "duration": 1793301871,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Checking if my payment method are available to buy my stuff at Netshoes",
  "description": "",
  "id": "check-the-payment-method-are-available;checking-if-my-payment-method-are-available-to-buy-my-stuff-at-netshoes;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestRun"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I know where are the payment method information",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I will check if \"Mastercard\" are a avalable",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentMethod.iKnowWhereAreThePaymentMethodInformation()"
});
formatter.result({
  "duration": 1328933271,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mastercard",
      "offset": 17
    }
  ],
  "location": "PaymentMethod.iWillCheckIfAreAAvalable(String)"
});
formatter.result({
  "duration": 55680428,
  "status": "passed"
});
formatter.before({
  "duration": 525914763,
  "status": "passed"
});
formatter.before({
  "duration": 1619740756,
  "status": "passed"
});
formatter.before({
  "duration": 713787149,
  "status": "passed"
});
formatter.before({
  "duration": 1205708460,
  "status": "passed"
});
formatter.before({
  "duration": 1169020533,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Checking if my payment method are available to buy my stuff at Netshoes",
  "description": "",
  "id": "check-the-payment-method-are-available;checking-if-my-payment-method-are-available-to-buy-my-stuff-at-netshoes;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestRun"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I know where are the payment method information",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I will check if \"NCard\" are a avalable",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentMethod.iKnowWhereAreThePaymentMethodInformation()"
});
formatter.result({
  "duration": 822025609,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NCard",
      "offset": 17
    }
  ],
  "location": "PaymentMethod.iWillCheckIfAreAAvalable(String)"
});
formatter.result({
  "duration": 675097034,
  "status": "passed"
});
formatter.uri("src/test/resources/acceptancecriteria/PuttingStuffOnTheCart.feature");
formatter.feature({
  "line": 2,
  "name": "Putting any stuff on the cart while a user has money.",
  "description": "As a user, I want to choose any items on Netshoes website to spend my money.",
  "id": "putting-any-stuff-on-the-cart-while-a-user-has-money.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TestRun"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Choosing items to put on the Cart while a user has money",
  "description": "",
  "id": "putting-any-stuff-on-the-cart-while-a-user-has-money.;choosing-items-to-put-on-the-cart-while-a-user-has-money",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "a user has \u003cmoney\u003e reais to spend",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "a user chooses the products \"\u003cmale or female\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "while a user has money will can put more products on the cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "putting-any-stuff-on-the-cart-while-a-user-has-money.;choosing-items-to-put-on-the-cart-while-a-user-has-money;",
  "rows": [
    {
      "cells": [
        "money",
        "male or female"
      ],
      "line": 11,
      "id": "putting-any-stuff-on-the-cart-while-a-user-has-money.;choosing-items-to-put-on-the-cart-while-a-user-has-money;;1"
    },
    {
      "cells": [
        "500",
        "calcado feminino"
      ],
      "line": 12,
      "id": "putting-any-stuff-on-the-cart-while-a-user-has-money.;choosing-items-to-put-on-the-cart-while-a-user-has-money;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 513570895,
  "status": "passed"
});
formatter.before({
  "duration": 1746708028,
  "status": "passed"
});
formatter.before({
  "duration": 1505231286,
  "status": "passed"
});
formatter.before({
  "duration": 1838437426,
  "status": "passed"
});
formatter.before({
  "duration": 1633497759,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Choosing items to put on the Cart while a user has money",
  "description": "",
  "id": "putting-any-stuff-on-the-cart-while-a-user-has-money.;choosing-items-to-put-on-the-cart-while-a-user-has-money;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestRun"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "a user has 500 reais to spend",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "a user chooses the products \"calcado feminino\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "while a user has money will can put more products on the cart",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 11
    }
  ],
  "location": "PuttingStuffOnTheCartStep.aUserHasReaisToSpend(double)"
});
formatter.result({
  "duration": 851245,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "calcado feminino",
      "offset": 29
    }
  ],
  "location": "PuttingStuffOnTheCartStep.aUserChoosesTheProducts(String)"
});
formatter.result({
  "duration": 10592095328,
  "status": "passed"
});
formatter.match({
  "location": "PuttingStuffOnTheCartStep.whileAUserHasMoneyWillCanPutMoreProductsOnTheCart()"
});
formatter.result({
  "duration": 15308177307,
  "status": "passed"
});
formatter.uri("src/test/resources/acceptancecriteria/WishList.feature");
formatter.feature({
  "line": 2,
  "name": "WishList",
  "description": "As a user, I want to save anything on the WishList and return anytime to buy.",
  "id": "wishlist",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TestRun"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "putting anything on the WishList",
  "description": "",
  "id": "wishlist;putting-anything-on-the-wishlist",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "a user selects \"\u003cany stuff\u003e\" to put on Wish List",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "a user could return anytime to finish his shopping",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "wishlist;putting-anything-on-the-wishlist;",
  "rows": [
    {
      "cells": [
        "any stuff"
      ],
      "line": 13,
      "id": "wishlist;putting-anything-on-the-wishlist;;1"
    },
    {
      "cells": [
        "calcado feminino"
      ],
      "line": 14,
      "id": "wishlist;putting-anything-on-the-wishlist;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 527375722,
  "status": "passed"
});
formatter.before({
  "duration": 1261690976,
  "status": "passed"
});
formatter.before({
  "duration": 768416079,
  "status": "passed"
});
formatter.before({
  "duration": 1139294747,
  "status": "passed"
});
formatter.before({
  "duration": 1133024216,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "a user is logged into his Netshoes account",
  "keyword": "Given "
});
formatter.match({
  "location": "WishList.aUserIsLoggedIntoHisNetshoesAccount()"
});
formatter.result({
  "duration": 36074866508,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //*[@class\u003d\u0027ns-icon ns-icon-arrow-down prv-action ns-void-link\u0027]//i[@class\u003d\u0027ns-icon-user-ico\u0027] (tried for 15 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Diegos-MacBook-Pro-2.local\u0027, ip: \u0027fe80:0:0:0:450:340:a13a:48fc%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.45.615355 (d5698f682d8b27..., userDataDir: /var/folders/d6/2mylyjh14qn...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:63128}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 72.0.3626.109, webStorageEnabled: true}\nSession ID: 7c800d96d83f65dfb32044ef179e869c\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\n\tat com.diegotomfurtado.systemstest.utils.CommonMethods.waitElementAppearOnScreen(CommonMethods.java:49)\n\tat com.diegotomfurtado.systemstest.utils.CommonMethods.waitElementVisibilityAndBeClickable(CommonMethods.java:53)\n\tat com.diegotomfurtado.systemstest.utils.CommonMethods.clickOnButton(CommonMethods.java:19)\n\tat com.diegotomfurtado.systemstest.pages.HomePage.performLogin(HomePage.java:63)\n\tat com.diegotomfurtado.systemstest.steps.WishList.aUserIsLoggedIntoHisNetshoesAccount(WishList.java:37)\n\tat ✽.Given a user is logged into his Netshoes account(src/test/resources/acceptancecriteria/WishList.feature:6)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 14,
  "name": "putting anything on the WishList",
  "description": "",
  "id": "wishlist;putting-anything-on-the-wishlist;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestRun"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "a user selects \"calcado feminino\" to put on Wish List",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "a user could return anytime to finish his shopping",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "calcado feminino",
      "offset": 16
    }
  ],
  "location": "WishList.aUserSelectsToPutOnWishList(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WishList.aUserCouldReturnAnytimeToFinishHisShopping()"
});
formatter.result({
  "status": "skipped"
});
});