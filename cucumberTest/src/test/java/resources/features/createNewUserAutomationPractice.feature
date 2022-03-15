#Autor: Andres Rios
#Date: 15/03/2022
#Description: Practicing Cucumber feature and execution in automation pracice page.

@SmokeRegression
Feature: Creating a new User on test Automation Page

  @smoketestProject
  Scenario Outline: Creating a new user
    Given the user is on the home page Automatio logo
    When the user do click on the signIn button
    And the user type his <email> and clicks over create and account button
    And  the user enters the personal infomation <firstname> and <lastname>
    Then the user can check the create an account page
    Examples:
      | email                     | firstname | lastname |
      | lalocadelacasa4@gmail.com | Andres    | Rios     |
