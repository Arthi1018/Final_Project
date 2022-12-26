$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/file/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "To check whether Adactin application is working fine",
  "description": "",
  "id": "to-check-whether-adactin-application-is-working-fine",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "To check whether login functionality is working fine",
  "description": "",
  "id": "to-check-whether-adactin-application-is-working-fine;to-check-whether-login-functionality-is-working-fine",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Launch the browser and and pass the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should get navigated to Search Hotels page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "to-check-whether-adactin-application-is-working-fine;to-check-whether-login-functionality-is-working-fine;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "to-check-whether-adactin-application-is-working-fine;to-check-whether-login-functionality-is-working-fine;;1"
    },
    {
      "cells": [
        "Arthiha1018",
        "IA779U"
      ],
      "line": 13,
      "id": "to-check-whether-adactin-application-is-working-fine;to-check-whether-login-functionality-is-working-fine;;2"
    },
    {
      "cells": [
        "abc",
        "123"
      ],
      "line": 14,
      "id": "to-check-whether-adactin-application-is-working-fine;to-check-whether-login-functionality-is-working-fine;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "To check whether login functionality is working fine",
  "description": "",
  "id": "to-check-whether-adactin-application-is-working-fine;to-check-whether-login-functionality-is-working-fine;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Launch the browser and and pass the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter \"Arthiha1018\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"IA779U\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should get navigated to Search Hotels page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.launch_the_browser_and_and_pass_the_URL()"
});
formatter.result({
  "duration": 22016496400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Arthiha1018",
      "offset": 12
    }
  ],
  "location": "Step_Def.user_enter_in_the_username_field(String)"
});
formatter.result({
  "duration": 441797000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IA779U",
      "offset": 13
    }
  ],
  "location": "Step_Def.user_enters_in_the_password_field(String)"
});
formatter.result({
  "duration": 220638800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1441089900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_should_get_navigated_to_Search_Hotels_page()"
});
formatter.result({
  "duration": 30386600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "To check whether login functionality is working fine",
  "description": "",
  "id": "to-check-whether-adactin-application-is-working-fine;to-check-whether-login-functionality-is-working-fine;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Launch the browser and and pass the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter \"abc\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"123\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should get navigated to Search Hotels page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.launch_the_browser_and_and_pass_the_URL()"
});
formatter.result({
  "duration": 461791300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 12
    }
  ],
  "location": "Step_Def.user_enter_in_the_username_field(String)"
});
formatter.result({
  "duration": 249748000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 13
    }
  ],
  "location": "Step_Def.user_enters_in_the_password_field(String)"
});
formatter.result({
  "duration": 152511700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 595236800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_should_get_navigated_to_Search_Hotels_page()"
});
formatter.result({
  "duration": 32230400,
  "error_message": "java.lang.AssertionError: expected [Adactin.com - Search Hotel] but found [Adactin.com - Hotel Reservation System]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:136)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:575)\r\n\tat org.testng.Assert.assertEquals(Assert.java:585)\r\n\tat co.step.Step_Def.user_should_get_navigated_to_Search_Hotels_page(Step_Def.java:41)\r\n\tat ✽.Then User should get navigated to Search Hotels page(src/test/java/com/feature/file/Adactin.feature:9)\r\n",
  "status": "failed"
});
});