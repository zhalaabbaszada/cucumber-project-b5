Feature: WebOrders login and link validation

  @HomeWork @smoke
  Scenario: User logs ing and prints links
    Given user is on WebOrders Login Page
    When user logs in with username "Tester" and password "test"
    Then user should be able to see the home page
    And user should be able to print out the count of the links
    And user should be able to print out each link test