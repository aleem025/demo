Feature: Create Account
  As a user
  I want to create an account under different modules
  So that I can assign related opportunities, contacts and leads to the account

  Background: Login to SugarCRM
    Given I am on SugarCRM login page
    When I enter "{app.user}" and "{app.password}"
    And click on Login button
    Then I should be able to login or see error based on if the credentials are "true" or not

  Scenario: Create an Account under Sales
    Given I am in "Sales" module
    And I am on Create Account page
    When I enter the details to add an account and Save:
      | Name | Sample Organization |
    Then the account should be added successfully
    And I should have an entry for the added record in database:
      | Name | Sample Organization |
