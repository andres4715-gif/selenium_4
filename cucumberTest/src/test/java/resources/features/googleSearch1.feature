#Autor: Andres Rios
#Date: 10/03/2022
#Description: Practicing Cucumber feature and execution.

Feature: feature to test google search functionality

  @googletest
  Scenario: Validate google search is working
    Given the user is on the google home page
    When the user enters text in search box
    And hits enter
    Then the user is navigated to the search results

