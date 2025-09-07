Feature: Google Search Functionality Title Validation
  User Story: As a user, when I am on the Google search page
  I should be abe to search whatever I want and see the relevant result


  Scenario: Search functionality result title validation
    Given user is on Google search page
    When user types Loop Academy in the google search box and clicks enter
    Then user should be able to see Loop Academy - Google search in the google title Story:

  @google_search
  Scenario: Search functionality result title validation
    Given user is on Google search page
    When user types "Loop Academy" in the google search box and clicks enter
    Then user should be able to see "Loop Academy - Google Search" in the google title