@Regression
Feature: F01_Register|users could register with new accounts
  @Smoke
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enter first name"automation"and last name"tester"
    And user enter date of birth
    And user enter email "test@example.com"field
    And user fills Password fields "P@sswOrd" "P@sswOrd"
    And user clicks on register button
    Then success message is displayed
