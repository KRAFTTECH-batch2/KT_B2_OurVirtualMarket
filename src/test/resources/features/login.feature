Feature: Login Test

  Scenario: The user should be login with valid credentials
    Given The user is on the login page
    When The user should fill in valid credentials
    Then The user should be able to login

  @login
    Scenario: The user sholud be login with parameters
      Given The user is on the login page
      When The user should input "krafttest@proje.com" and "test123"
      Then The user should be able to login

