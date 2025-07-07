@dashboard


Feature: Dashboard

  Scenario: user can choose a favourite team
    Given I am Testing Case : "1"
    And I login into Application
    And user enters their first name
    And user selects a favourite team
    And user clicks on submit
    Then user sees a certified message


  Scenario: User can toggle dark mode
    Given I am Testing Case : "2"
    And I click on the dark mode toggle

