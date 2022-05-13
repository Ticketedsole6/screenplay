Feature: Secure Login

  @run
  Scenario: Login Successful
    Given that a web user wants to login in page automation
    When he writes the correct credentials
    Then he should see the section secure page