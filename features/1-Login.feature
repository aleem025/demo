Feature: Login
  As a user
  I want to login to SugarCRM
  So that I can use the features of application

  Scenario Outline: Login to SugarCRM
    Given I am on SugarCRM login page
    When I enter "<username>" and "<password>"
    And click on Login button
    Then I should be able to login or see error based on if the credentials are "<valid>" or not

    Examples: 
      | username | password  | valid |
      | raghav   | admin | true  |
      | chandra  | valsatech | true  |
