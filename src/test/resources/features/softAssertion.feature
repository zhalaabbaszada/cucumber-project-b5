Feature: Practice soft assertion

  @soft
  Scenario: Soft assertion practice
    Given user is on Docuport login page
    Then user validates "Login" text is displayed
    Then user validates "Docuport" text is displayed