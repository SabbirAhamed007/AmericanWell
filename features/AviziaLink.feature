Feature: Test Avizia link

  @tag3
  Scenario: Test Avizia link of home pae
    Given I open American well home page
    When I click on Avizia link
    Then I validate the Avizia page
    And close the website
