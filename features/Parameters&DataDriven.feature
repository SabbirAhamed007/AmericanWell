Feature: Test Parameters & Data Driven

  @tag5
  Scenario Outline: Test Login with valid credentials
    Given Open Chrome
    And Type American well website
    And mousehoover on the dropdown menu Need to see a doctor?
    And click on cotinue button
    And Click on the login button
    When I enter valid "<username>" and "<password>"
    Then user should be able to login successfully

    Examples: 
      | username             | password  |
      | veneer_007@yahoo.com | password1 |
      | veneer_008@yahoo.com | password2 |
      | veneer_009@yahoo.com | password3 |
