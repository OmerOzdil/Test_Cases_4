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
      |Daily  |
      |Weekly |
      |Monthly|
      |Yearly |

  @wip
    Scenario: Test Case 9
      Given let user logged in as "usernamestoremanager" "password"
      When  user navigates "Activities" "Calendar Events"
      And user click on create Calendar Event option
      And user select repeat check box
      Then verify that repeat check box is selected
      Then verify that repeat every button is selected
      Then verify that Never radio button is selected as an Ends option
      Then verify that "Summary:Daily every 1 day" is displayed
