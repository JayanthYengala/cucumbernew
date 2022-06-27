$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/uniform.feature");
formatter.feature({
  "name": "Uniform login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with unauthorized user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user enter invalid Username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "validation message appears",
  "keyword": "Then "
});
formatter.step({
  "name": "user goes to menu",
  "keyword": "When "
});
formatter.step({
  "name": "user goes to reports",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks Marketing",
  "keyword": "And "
});
formatter.step({
  "name": "click on Affiliate activity",
  "keyword": "And "
});
formatter.step({
  "name": "user navigates to Affiliate Activity Report",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "Admin@123"
      ]
    }
  ]
});
formatter.background({
  "name": "Background section",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "uniforms.user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with unauthorized user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user enter invalid Username \"admin\" and password \"Admin@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "uniforms.user_enter_invalid_Username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validation message appears",
  "keyword": "Then "
});
formatter.match({
  "location": "uniforms.validation_message_appears()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user goes to menu",
  "keyword": "When "
});
formatter.match({
  "location": "uniforms.user_goes_to_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user goes to reports",
  "keyword": "When "
});
formatter.match({
  "location": "uniforms.user_goes_to_reports()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks Marketing",
  "keyword": "And "
});
formatter.match({
  "location": "uniforms.user_clicks_Marketing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Affiliate activity",
  "keyword": "And "
});
formatter.match({
  "location": "uniforms.click_on_Affiliate_activity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Affiliate Activity Report",
  "keyword": "Then "
});
formatter.match({
  "location": "uniforms.user_navigates_to_Affiliate_Activity_Report()"
});
formatter.result({
  "status": "passed"
});
});