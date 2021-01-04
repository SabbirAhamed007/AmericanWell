
Feature: Test Health Plans 
  
  @tag11
  Scenario: Test Health Plans scenario
    Given I open american well website
    And mouse hover on solution
    And click on Health Plans
    And click on request demo
    When I fill up the Connect With Us form
    And click submit button
    Then I validate the Thank you
    

  