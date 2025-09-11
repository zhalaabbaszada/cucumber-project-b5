Feature: Wikipedia search functionality

  Background: this is for navigating Wikipedia web page
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box and search for it

  @wikipedia
  Scenario: Verify Wikipedia search title
    Then User sees "Steve Jobs - Wikipedia" is in the wiki title

  @wikipedia
  Scenario: Verify Wikipedia main header
    Then User sees "Steve Jobs" is in the header

  @wikipedia
  Scenario: Verify Wikipedia image header
    Then User sees "Steve Jobs" is in the image header






