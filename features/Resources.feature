Feature: Test Resources page

  @tag10
  Scenario: Test functional on Resources page
    Given I open Americal well page
    And mouse hover on Resources
    And Click Resources center
    And click on Increasing Access to Mental Healthcare via Telehealth
    When I fillup the download form
    And click submit
    Then It will show Your case study is ready!
