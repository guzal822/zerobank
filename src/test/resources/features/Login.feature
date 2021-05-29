@login
Feature: Only authorized users should be able to login


  Background:
    Given the user is on the login page


  Scenario:user login with valid credential
    When the user enter the valid credential
    Then the user should be able to login


  Scenario:user login with wrong username
    When the user enter the wrong username with right password
    Then the user should not be able to login
    And the user should see error message

  Scenario:user login with wrong password
    When  the user enter the right username with wrong password
    Then the user should not be able to login
    And the user should see error message

  Scenario:user login with blank username
    When  the user enter the blank username with right password
    Then the user should not be able to login
    And the user should see error message

  Scenario:user login with blank password
    When  the user enter the right username with blank password
    Then the user should not be able to login
    And the user should see error message


  Scenario:user login with invalid information
    When  the user enter the invalid information
    Then the user should not be able to login
    And the user should see error message


