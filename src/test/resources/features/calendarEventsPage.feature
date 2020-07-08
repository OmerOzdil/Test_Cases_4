  Feature:

    Scenario: Check three icon
      Given let user logged in as "usernamestoremanager" "password"
      When user navigates "Activities" "Calendar Events"
      And hover on the three dot icon
      Then verify view, edit and delete options available

    Scenario: Check title options is available
      Given let user logged in as "usernamestoremanager" "password"
      When user navigates "Activities" "Calendar Events"
      And the user click on grid options and deselect options
      Then Verify the "Title" column still displayed

    Scenario: Test Case 3
      Given  let user logged in as "usernamestoremanager" "password"
      When user navigates "Activities" "Calendar Events"
      And user click on create Calendar Event option
      Then verify that Save and Close,Save and New and Save options available

    Scenario: Test Case 4
      Given let user logged in as "usernamestoremanager" "password"
      When  user navigates "Activities" "Calendar Events"
      And user click on create Calendar Event option
      And user click on the Cancel Button
      Then verify that "All Calendar Events" page title is displayed

    Scenario: Test Case 6
      Given let user logged in as "usernamestoremanager" "password"
      When user navigates "Activities" "Calendar Events"
      And user click on create Calendar Event option
      And user enter start time as "09:00 PM"
      Then verify that end time automatically set "10:00 PM"
    @wip
    Scenario: Test case 7
      Given let user logged in as "usernamestoremanager" "password"
      When user navigates "Activities" "Calendar Events"
      And user click on create Calendar Event option
      And user select all day check box
      Then verify that all day check box is selected
      Then start and end input time are not displayed and start and end date box are displayed



