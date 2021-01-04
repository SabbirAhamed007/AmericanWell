Feature: SignUp Amricanwell

  @tag6
  Scenario: Test signup Americanwell
    Given I open browser
    And type americanwell web address
    And mouse hover on Need to see a doctor
    And click on continue button
    And click on signup button
    When I fill all the fields
    And click on agree check button
    Then successfully signup
