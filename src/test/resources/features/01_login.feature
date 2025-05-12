@login
Feature: Login

  @validLogin
  Scenario: User Want to Login : with valid credentials
    Given I am Testing Case : "1"
    And User arrives to Login Page
    And I enter a valid username
    And I enter a valid password
    And I click on the login button
    Then I verify login
