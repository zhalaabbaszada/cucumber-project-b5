Feature: Scenario Outline Practice

  @google_search_outline
  Scenario Outline:
    Given user is on Google search page
    When user searches for "<country>"
    Then user should see "<capital>" in the results as capital
    And we love Loop Academy

    Examples:
      | country     | capital    |
      | Azerbaijan  | Baku       |
      | Ukraine     | Kyiv       |
      | Afghanistan | Kabul      |
      | USA         | Washington, D.C.|
      | Turkiye     | Ankara     |
      | Uzbekistan  | Tashkent   |
      | Georgia     | Atlanta    |




      # option + command + L  - mac
      # CTRL + ALT + L        - window