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

  Scenario: user can choose a favourite team
    Given I am Testing Case : "2"
    And user enters their first name
    And user selects a favourite team
    And user clicks on submit
    Then user sees a certified message

  Scenario: user can logout
    Given I am Testing Case : "3"
    And user clicks on the logout button
    Then user is logged out