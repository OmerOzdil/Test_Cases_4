$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/createCalendarEvent.feature");
formatter.feature({
  "name": "Create Calendar Events Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "Test Case 5",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "let user logged in as \"usernamestoremanager\" \"password\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.let_user_logged_in_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates \"Activities\" \"Calendar Events\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.user_navigates(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on create Calendar Event option",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.user_click_on_create_calendar_event_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that difference between end and start time is exactly 1 hour",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.verify_that_difference_between_end_and_start_time_is_exactly_hour(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Case 8",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "let user logged in as \"usernamestoremanager\" \"password\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.let_user_logged_in_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates \"Activities\" \"Calendar Events\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.user_navigates(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on create Calendar Event option",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.user_click_on_create_calendar_event_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select repeat check box",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.user_select_repeat_check_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that repeat check box is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.verify_that_repeat_check_box_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"Daily\" is selected as default and see the following options",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.verify_that_is_selected_as_default_and_see_the_following_options(java.lang.String,java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Case 9",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "let user logged in as \"usernamestoremanager\" \"password\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.let_user_logged_in_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates \"Activities\" \"Calendar Events\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.user_navigates(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on create Calendar Event option",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.user_click_on_create_calendar_event_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select repeat check box",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.user_select_repeat_check_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that repeat check box is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.verify_that_repeat_check_box_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that repeat every button is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.verify_that_repeat_every_button_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that Never radio button is selected as an Ends option",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.verify_that_never_radio_button_is_selected_as_an_ends_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"Summary:Daily every 1 day\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.verify_that_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Case 10",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "let user logged in as \"usernamestoremanager\" \"password\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.let_user_logged_in_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates \"Activities\" \"Calendar Events\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.user_navigates(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on create Calendar Event option",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.user_click_on_create_calendar_event_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select repeat check box",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.user_select_repeat_check_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"10\" as an occurrence as an Ends option",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.user_enters_as_an_occurrence_as_an_ends_option(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that  this message \"Summary:Daily every 1 day, end after 10 occurrences\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.verify_that_this_message_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Case 11",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "let user logged in as \"usernamestoremanager\" \"password\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.let_user_logged_in_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates \"Activities\" \"Calendar Events\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.user_navigates(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on create Calendar Event option",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.user_click_on_create_calendar_event_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select repeat check box",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.user_select_repeat_check_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  select By \"Nov 18, 2021\" as an Ends option",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.user_select_by_as_an_ends_option(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that the message \"Summary:Daily every 1 day, end by Nov 18, 2021\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.verify_that_the_message_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Case 12",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "let user logged in as \"usernamestoremanager\" \"password\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.let_user_logged_in_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates \"Activities\" \"Calendar Events\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.user_navigates(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on create Calendar Event option",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.CalenderEvents.user_click_on_create_calendar_event_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select repeat check box",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.user_select_repeat_check_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"Weekly\" options as a Repeat option",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.user_selects_options_as_a_Repeat_option(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"monday\" and \"friday\" options as a Repeat on options",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.user_selects_and_options_as_a_Repeat_on_options(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that following message \"Summary:Weekly every 1 week on Monday, Friday\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.createCalendarEventPage.verify_that_following_message_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});