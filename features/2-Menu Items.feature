Feature: Menu Items
  As a user
  After I login to SugarCRM
  I should see various Menu and Sub Menu Items

  Background: Login to SugarCRM
    Given I am on SugarCRM login page
    When I enter "{app.user}" and "{app.password}"
    And click on Login button
    Then I should be able to login or see error based on if the credentials are "true" or not

  Scenario: Check Menu Items and Sub Menu Items
    Given there are following Menu Items:
      | Sales | Marketing | Support | Activities | Collaboration | All |
    When I hover over the Menu Items
    Then I should see the following Sub Menus:
      | Sales         | Home,Accounts,Contacts,Opportunities,Leads                    |
      | Marketing     | Home,Accounts,Contacts,Leads,Campaigns,Targets,Target Lists   |
      | Support       | Home,Accounts,Contacts,Cases                                  |
      | Activities    | Home,Calendar,Calls,Meetings,Emails,Tasks,Notes               |
      | Collaboration | Home,Emails,Documents                                         |
      | All           | Home,Accounts,Contacts,Opportunities,Leads,Calendar,Documents |
