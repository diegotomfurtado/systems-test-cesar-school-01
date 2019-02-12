$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/acceptancecriteria/PuttingStuffOnTheCart.feature");
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
        "450",
        "calcado feminino"
      ],
      "line": 12,
      "id": "putting-any-stuff-on-the-cart-while-a-user-has-money.;choosing-items-to-put-on-the-cart-while-a-user-has-money;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4109761149,
  "status": "passed"
});
formatter.before({
  "duration": 1084173063,
  "status": "passed"
});
formatter.before({
  "duration": 592738448,
  "status": "passed"
});
formatter.before({
  "duration": 597320179,
  "status": "passed"
});
formatter.before({
  "duration": 583969886,
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
  "name": "a user has 450 reais to spend",
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
      "val": "450",
      "offset": 11
    }
  ],
  "location": "PuttingStuffOnTheCartStep.aUserHasReaisToSpend(double)"
});
formatter.result({
  "duration": 71062753,
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
  "duration": 9560855524,
  "status": "passed"
});
formatter.match({
  "location": "PuttingStuffOnTheCartStep.whileAUserHasMoneyWillCanPutMoreProductsOnTheCart()"
});
formatter.result({
  "duration": 13707247542,
  "status": "passed"
});
});