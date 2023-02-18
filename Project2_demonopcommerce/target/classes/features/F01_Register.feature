@smoke
Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully
    Given User go to register page
    When User select gender type
    And User enter "automation" & "tester"
    And User select date of birth
    And User enter email
    And User enter "P@ssw0rd" password and confirm password
    And User click on register button
    Then account is created successfully
