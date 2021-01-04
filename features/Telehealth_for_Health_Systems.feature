Feature: Test Telehealth for Health Systems & Hospitals

  @tag7
  Scenario: Telehealth for Health Systems & Hospitals scenario
    Given I open  chrome browser
    And type American Well address
    When I mouse hover on Solutions
    And click on Health Systems
    And Verify on Request a Demo button
    And Click Request a Demo button
    And Fillup Connect With Us
    Then I click on submit button
    And Registration successfully
