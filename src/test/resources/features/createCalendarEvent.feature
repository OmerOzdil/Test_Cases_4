Feature: Create Calendar Events Page
  @wip
  Scenario: Test Case 5
    Given let user logged in as "usernamestoremanager" "password"
    When user navigates "Activities" "Calendar Events"
    And user click on create Calendar Event option
    Then verify that difference between end and start time is exactly 1 hour