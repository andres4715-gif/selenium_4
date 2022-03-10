Feature: Search
  @smoketest
  Scenario Outline: Search clothes

    Given the user is in the index page
    When the user enters <clothes> in the search bar
    And the user clicks the search button
    Then the <clothes> page appears

    Examples:
      | clothes |
      | dresses |
      | blouses |