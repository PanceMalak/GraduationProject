@Login
  Feature: F02_Login|users could use login functionality to use their accounts
    @Smoke
    Scenario: user could login with valid email and password
      Given user go to login page
      When user login with "valid""test@example.com" and "P@sswOrd"
      And user press on login button
      Then user login to the system successfully

