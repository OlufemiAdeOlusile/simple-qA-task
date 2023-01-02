Feature: Calculator

  Scenario: verify user can add and multiply with calculator
    Given I have a calculator
    When I add the following number 1 and number 2
    Then the total added should be 3
    When I multiply 3.0 with 2.0
    Then the total multiplied should be 6.0


  Scenario: verify user can add the sum of even numbers with calculator
    Given I have a calculator
    When I have the following numbers "2,40,3,5,9,100,2076"
    And I add the sum of even numbers
    Then the total sum of even numbers should be 2218
