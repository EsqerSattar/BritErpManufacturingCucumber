@smokeTest @login
Feature: Test environment is up and running

  Scenario: Verify the url is running
    When the user goes to URL
    Then the page title should be "Odoo"
    And the page URL should contain "database/selector"

  Scenario Outline: Verify 'Log in' functionality
    Given the user goes to URL
#    And the user click BriteErpDemo database
    When the "<valid user>" enters valid email
    And the "<valid user>" enters valid password
    And the user clicks Log in button
    Then the page title should be "#Inbox - Odoo"
   And the page URL should contain "active_id"

    Examples: valid users
    | valid user|
    | manager   |
    | user      |

