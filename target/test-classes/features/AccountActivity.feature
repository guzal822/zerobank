Feature: account activity page

  Background:
    Given the user is logged in

  Scenario:navigate to Account Activity
    When the user should navigate to "Account Activity"
    Then the page should have the title "Account Activity"

  @wip
  Scenario:Account drop down
    When the user should navigate to "Account Activity"
    Then Account drop down default option should be "Savings"
    And  Account drop down should have the following options
      | Savings | Checking | Savings | Loan | Credit Card | Brokerage |


  Scenario: transactions table
    When the user should navigate to "Account Activity"
    Then Transactions table should have clolumn listed below
      | Date | Description | Deposit | Withdrawal |





