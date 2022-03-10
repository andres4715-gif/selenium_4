#Autor: Andres Rios
#Date: 10/03/2022
#Description: Practicing Cucumber feature and execution.

  @SmokeRegression
Feature: feature to test functionality

  @smoketest
  Scenario: Check login is successful with valid credentials
    Given the user is on the login page
    When the user enters username and password
    And clicks on login button
    Then the user is navigated to the home page

