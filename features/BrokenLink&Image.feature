Feature: Test broken link & image

  @tag2
  Scenario: Broken link and Image scenario
    Given I open Americanwell website
    When I verify the links & Image
    Then I close the website
