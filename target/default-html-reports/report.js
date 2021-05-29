$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivity.feature");
formatter.feature({
  "name": "account activity page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Account drop down",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user should navigate to \"Account Activity\"",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationStepDefs.the_user_should_navigate_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down default option should be \"Savings\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationStepDefs.account_drop_down_default_option_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have the following options",
  "rows": [
    {
      "cells": [
        "Savings",
        "Checking",
        "Savings",
        "Loan",
        "Credit Card",
        "Brokerage"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "NavigationStepDefs.account_drop_down_should_have_the_following_options(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});