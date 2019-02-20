Feature: login functionality

  Scenario: Brit-Erp aplication

    Given user on login page
    When user login as manager using "manager UserName" and "Manager Password"
    Then homepage should display
    And title should be "page title"



