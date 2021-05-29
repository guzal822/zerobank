Feature: pay bills page

  Background:
    Given the user is logged in


  Scenario: Pay bills page title
    When the user should navigate to "Pay Bills"
    Then the page should have the title "Pay Bills"


  Scenario: pay operation
    When the user should navigate to "Pay Bills"
    Then the user completes the successful pay operation
    Then the successful submission message should be displayed


  Scenario: pay operation
    When the user should navigate to "Pay Bills"
    Then the user completes pay operation without enter the amount
    Then the failed message should be displayed
