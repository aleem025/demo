$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("1-Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "As a user\r\nI want to login to SugarCRM\r\nSo that I can use the features of application",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Login to SugarCRM",
  "description": "",
  "id": "login;login-to-sugarcrm",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on SugarCRM login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should be able to login or see error based on if the credentials are \"\u003cvalid\u003e\" or not",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login;login-to-sugarcrm;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "valid"
      ],
      "line": 13,
      "id": "login;login-to-sugarcrm;;1"
    },
    {
      "cells": [
        "raghav",
        "admin",
        "true"
      ],
      "line": 14,
      "id": "login;login-to-sugarcrm;;2"
    },
    {
      "cells": [
        "chandra",
        "valsatech",
        "true"
      ],
      "line": 15,
      "id": "login;login-to-sugarcrm;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2730331366,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login to SugarCRM",
  "description": "",
  "id": "login;login-to-sugarcrm;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on SugarCRM login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter \"raghav\" and \"admin\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should be able to login or see error based on if the credentials are \"true\" or not",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Login.i_am_on_SugarCRM_login_page()"
});
formatter.result({
  "duration": 2159832826,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "raghav",
      "offset": 9
    },
    {
      "val": "admin",
      "offset": 22
    }
  ],
  "location": "Login.i_enter_and(String,String)"
});
formatter.result({
  "duration": 229331663,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_on_Login_button()"
});
formatter.result({
  "duration": 1343308111,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 72
    }
  ],
  "location": "Login.i_should_be_able_to_login_or_see_error_based_on_if_the_credentials_are_or_not(String)"
});
formatter.write(null);
formatter.result({
  "duration": 3149762311,
  "status": "passed"
});
formatter.after({
  "duration": 952587475,
  "status": "passed"
});
formatter.before({
  "duration": 1926718844,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login to SugarCRM",
  "description": "",
  "id": "login;login-to-sugarcrm;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on SugarCRM login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter \"chandra\" and \"valsatech\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should be able to login or see error based on if the credentials are \"true\" or not",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Login.i_am_on_SugarCRM_login_page()"
});
formatter.result({
  "duration": 1969573148,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chandra",
      "offset": 9
    },
    {
      "val": "valsatech",
      "offset": 23
    }
  ],
  "location": "Login.i_enter_and(String,String)"
});
formatter.result({
  "duration": 243708743,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_on_Login_button()"
});
formatter.result({
  "duration": 578323525,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 72
    }
  ],
  "location": "Login.i_should_be_able_to_login_or_see_error_based_on_if_the_credentials_are_or_not(String)"
});
formatter.result({
  "duration": 60476816,
  "error_message": "java.lang.AssertionError: Error is displayed when logging in.Error:\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertFalse(Assert.java:64)\r\n\tat com.valsatech.bdd.gui.stepdefs.Login.i_should_be_able_to_login_or_see_error_based_on_if_the_credentials_are_or_not(Login.java:68)\r\n\tat ✽.Then I should be able to login or see error based on if the credentials are \"true\" or not(1-Login.feature:10)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 981933044,
  "status": "passed"
});
formatter.uri("2-Menu Items.feature");
formatter.feature({
  "line": 1,
  "name": "Menu Items",
  "description": "As a user\r\nAfter I login to SugarCRM\r\nI should see various Menu and Sub Menu Items",
  "id": "menu-items",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1933161508,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "Login to SugarCRM",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on SugarCRM login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter \"{app.user}\" and \"{app.password}\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should be able to login or see error based on if the credentials are \"true\" or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.i_am_on_SugarCRM_login_page()"
});
formatter.result({
  "duration": 1981944106,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "{app.user}",
      "offset": 9
    },
    {
      "val": "{app.password}",
      "offset": 26
    }
  ],
  "location": "Login.i_enter_and(String,String)"
});
formatter.result({
  "duration": 224682973,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_on_Login_button()"
});
formatter.result({
  "duration": 1229906477,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 72
    }
  ],
  "location": "Login.i_should_be_able_to_login_or_see_error_based_on_if_the_credentials_are_or_not(String)"
});
formatter.write(null);
formatter.result({
  "duration": 2129833826,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Check Menu Items and Sub Menu Items",
  "description": "",
  "id": "menu-items;check-menu-items-and-sub-menu-items",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "there are following Menu Items:",
  "rows": [
    {
      "cells": [
        "Sales",
        "Marketing",
        "Support",
        "Activities",
        "Collaboration",
        "All"
      ],
      "line": 14
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I hover over the Menu Items",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should see the following Sub Menus:",
  "rows": [
    {
      "cells": [
        "Sales",
        "Home,Accounts,Contacts,Opportunities,Leads"
      ],
      "line": 17
    },
    {
      "cells": [
        "Marketing",
        "Home,Accounts,Contacts,Leads,Campaigns,Targets,Target Lists"
      ],
      "line": 18
    },
    {
      "cells": [
        "Support",
        "Home,Accounts,Contacts,Cases"
      ],
      "line": 19
    },
    {
      "cells": [
        "Activities",
        "Home,Calendar,Calls,Meetings,Emails,Tasks,Notes"
      ],
      "line": 20
    },
    {
      "cells": [
        "Collaboration",
        "Home,Emails,Documents"
      ],
      "line": 21
    },
    {
      "cells": [
        "All",
        "Home,Accounts,Contacts,Opportunities,Leads,Calendar,Documents"
      ],
      "line": 22
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Common.there_are_following_Menu_Items(String\u003e)"
});
formatter.result({
  "duration": 114872449,
  "status": "passed"
});
formatter.match({
  "location": "Common.i_hover_over_the_Menu_Items()"
});
formatter.result({
  "duration": 21333,
  "status": "passed"
});
formatter.match({
  "location": "Common.i_should_see_the_following_Sub_Menus(String,String\u003e)"
});
formatter.result({
  "duration": 1014798611,
  "status": "passed"
});
formatter.after({
  "duration": 835627917,
  "status": "passed"
});
formatter.uri("3-Create Account.feature");
formatter.feature({
  "line": 1,
  "name": "Create Account",
  "description": "As a user\r\nI want to create an account under different modules\r\nSo that I can assign related opportunities, contacts and leads to the account",
  "id": "create-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1926458499,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "Login to SugarCRM",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on SugarCRM login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter \"{app.user}\" and \"{app.password}\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should be able to login or see error based on if the credentials are \"true\" or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.i_am_on_SugarCRM_login_page()"
});
formatter.result({
  "duration": 1977044947,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "{app.user}",
      "offset": 9
    },
    {
      "val": "{app.password}",
      "offset": 26
    }
  ],
  "location": "Login.i_enter_and(String,String)"
});
formatter.result({
  "duration": 230753489,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_on_Login_button()"
});
formatter.result({
  "duration": 1242369484,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 72
    }
  ],
  "location": "Login.i_should_be_able_to_login_or_see_error_based_on_if_the_credentials_are_or_not(String)"
});
formatter.write(null);
formatter.result({
  "duration": 2177716868,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Create an Account under Sales",
  "description": "",
  "id": "create-account;create-an-account-under-sales",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I am in \"Sales\" module",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I am on Create Account page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter the details to add an account and Save:",
  "rows": [
    {
      "cells": [
        "Name",
        "Sample Organization"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "the account should be added successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I should have an entry for the added record in database:",
  "rows": [
    {
      "cells": [
        "Name",
        "Sample Organization"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Sales",
      "offset": 9
    }
  ],
  "location": "Common.i_am_in_module(String)"
});
formatter.result({
  "duration": 87282534,
  "status": "passed"
});
formatter.match({
  "location": "Common.i_am_on_Create_Account_page()"
});
formatter.result({
  "duration": 2747245137,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.i_enter_the_details_to_add_an_account(String,String\u003e)"
});
formatter.write(null);
formatter.result({
  "duration": 2896367053,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.the_account_should_be_added_successfully()"
});
formatter.write("This is a custom message -- Account saved successfully");
formatter.write(null);
formatter.result({
  "duration": 53342004,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.i_should_have_an_entry_for_the_added_record_in_database(String,String\u003e)"
});
formatter.write("The name as saved in DB is : Sample Organization");
formatter.write("The id as saved in DB is : ef4e8619-fc9c-59c2-39d7-580922216574");
formatter.result({
  "duration": 173323388,
  "status": "passed"
});
formatter.after({
  "duration": 806594052,
  "status": "passed"
});
});