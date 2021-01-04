Feature: Test Telemed Tablets page

  @tag8
  Scenario: verify Telemed Tablets page
    Given I click chrome browser
    And open American well site
    When I mouse hover on Products
    And I click on Telemed Tablets
    And Verify Request a demo button
    And Verify American Well three hundred Telemed Tablet
    And Verify American Well two hundred Telemed Tablet
    And Verify American Well one hundred Telemed Tablet
    Then I close it
