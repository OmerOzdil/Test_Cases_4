Feature: Create Calendar Events Page
  Scenario: Test Case 5
    Given let user logged in as "usernamestoremanager" "password"
    When user navigates "Activities" "Calendar Events"
    And user click on create Calendar Event option
    Then verify that difference between end and start time is exactly 1 hour



  Scenario: Test Case 8
    Given let user logged in as "usernamestoremanager" "password"
    When user navigates "Activities" "Calendar Events"
    And user click on create Calendar Event option
    And user select repeat check box
    Then verify that repeat check box is selected
    Then verify that "Daily" is selected as default and see the following options
      | Daily   |
      | Weekly  |
      | Monthty |
      | Yearly  |


  Scenario: Test Case 9
    Given let user logged in as "usernamestoremanager" "password"
    When  user navigates "Activities" "Calendar Events"
    And user click on create Calendar Event option
    And user select repeat check box
    Then verify that repeat check box is selected
    Then verify that repeat every button is selected
    Then verify that Never radio button is selected as an Ends option
    Then verify that "Summary:Daily every 1 day" is displayed


  Scenario: Test Case 10
    Given let user logged in as "usernamestoremanager" "password"
    When  user navigates "Activities" "Calendar Events"
    And user click on create Calendar Event option
    And user select repeat check box
    And user enters "10" as an occurrence as an Ends option
    Then verify that  this message "Summary:Daily every 1 day, end after 10 occurrences" is displayed

@wip
  Scenario: Test Case 11
    Given let user logged in as "usernamestoremanager" "password"
    When  user navigates "Activities" "Calendar Events"
    And user click on create Calendar Event option
    And user select repeat check box
    And user  select By "Nov 18, 2021" as an Ends option
    Then verify that the message "Summary:Daily every 1 day, end by Nov 18, 2021" is displayed


