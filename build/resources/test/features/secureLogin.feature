Feature: Secure Login

  @smokeTest
  Scenario: Login Succesfull
    Given that a web user wants to login in page automation
    When he writes the correct credentials
    Then he should see the section secure page