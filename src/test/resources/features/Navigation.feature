@navigation
Feature: navigation to different module

  Background:
    Given the user is on the login page

  Scenario:navigate to Account Summary
    When the user enter the valid credential
    Then the user should be able to login
    And  the title should contains "Cash Accounts" types

  Scenario:navigate to Account Summary
    When the user enter the valid credential
    Then the user should be able to login
    And  the title should contains "Investment Accounts" types

  Scenario:navigate to Account Summary
    When the user enter the valid credential
    Then the user should be able to login
    And  the title should contains "Credit Accounts" types

  Scenario:navigate to Account Summary
    When the user enter the valid credential
    Then the user should be able to login
    And  the title should contains "Loan Accounts" types

    Scenario: Credit Accounts table account column
      When the user is logged in
      Then the credit accounts have columns as listed below
      |Account     |Credit Card |Balance     |


