#Autor: Andres Rios
#Date: 10/03/2022
#Description: Practicing Cucumber feature and execution.

@SmokeRegression
Feature: Test Login functionality

  @smoketestProject
  Scenario Outline: Check login is successful on the page
    Given the user is on the login project page
    When the user enters the valid <username> and <password>
    And taps over login button
    Then the user can check if this is valid credentials
    Examples:
      | username | password |
      | Raghav   | 12345    |
      | Andres   | 12345    |
      | Carlos   | 12345    |
