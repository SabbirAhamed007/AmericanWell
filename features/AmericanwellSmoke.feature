Feature: Test smoke Americanwell

  @tag1
  Scenario: Test smoke on Americanwell
    Given I open chrome browser
    And type Americanwell web address
    When I verify Americanwell homepae
    Then I close the browser
