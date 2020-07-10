package com.vytrack.step_definitions;

import com.vytrack.pom.CalendarEventPage;
import com.vytrack.pom.CreateCalendarEvent;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class createCalendarEventPage {


    @Then("verify that Save and Close,Save and New and Save options available")
    public void verify_that_save_and_close_save_and_new_and_save_options_available() {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();

        BrowserUtils.waitForPageToLoad(4);

        BrowserUtils.waitFor(4);
        createCalendarEvent.SaveAndNewExpandButton1.click();

        Assert.assertTrue(createCalendarEvent.saveAndCloseButton.isDisplayed());
        Assert.assertTrue(createCalendarEvent.saveAndNewButton.isDisplayed());
        Assert.assertTrue(createCalendarEvent.saveButton.isDisplayed());

    }
    @When("user click on the Cancel Button")
    public void user_click_on_the_cancel_button() {
        BrowserUtils.waitForPageToLoad(4);
        BrowserUtils.waitFor(2);
        new CreateCalendarEvent().cancelButton.click();

    }
    @Then("verify that difference between end and start time is exactly {int} hour")
    public void verify_that_difference_between_end_and_start_time_is_exactly_hour(Integer int1) throws ParseException {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();

        BrowserUtils.waitForPageToLoad(4);
        //BrowserUtils.waitFor(3);

        SimpleDateFormat parser = new SimpleDateFormat("HH:mm");

        Date starttime=parser.parse(createCalendarEvent.startTime.getAttribute("value"));
        Date endTime=parser.parse(createCalendarEvent.endTime.getAttribute("value"));
        System.out.println("starttime = " + starttime);
        System.out.println("endTime = " + endTime);

        assertEquals(1,endTime.compareTo(starttime));


    }

    @When("user enter start time as {string}")
    public void user_enter_start_time_as(String startTime) {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();



        List<WebElement> st= Driver.get().findElements(By.xpath("//input[starts-with(@id,'time_selector_oro_calendar_event_form_start')]"));

        System.out.println(st.size());
        System.out.println(st);

        BrowserUtils.waitForPageToLoad(3);
        BrowserUtils.waitForClickablility(createCalendarEvent.startTime,4);
        createCalendarEvent.startTime.clear();
        createCalendarEvent.startTime.sendKeys(startTime);
        BrowserUtils.waitFor(2);
        createCalendarEvent.startTime.submit();
        BrowserUtils.clickWithJS(createCalendarEvent.endTime);



        System.out.println("createCalendarEvent.startTime = " + createCalendarEvent.startTime.getAttribute("value"));


    }

    @Then("verify that end time automatically set {string}")
    public void verify_that_end_time_automatically_set(String endTime) {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();

        BrowserUtils.waitForClickablility(createCalendarEvent.endTime,4);
        System.out.println("createCalendarEvent.endTime = " + createCalendarEvent.endTime.getAttribute("value"));

        BrowserUtils.waitFor(3);
        assertEquals(endTime,createCalendarEvent.endTime.getAttribute("value"));

    }
    @When("user select all day check box")
    public void user_select_all_day_check_box() {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();
        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForClickablility(createCalendarEvent.allDayEventCheckBox,5);

        try{
            createCalendarEvent.allDayEventCheckBox.click();
        }catch (Exception e){
            BrowserUtils.waitFor(2);
            createCalendarEvent.allDayEventCheckBox.click();
        }

    }

    @Then("verify that all day check box is selected")
    public void verify_that_all_day_check_box_is_selected() {

        assertTrue(new CreateCalendarEvent().allDayEventCheckBox.isSelected());
    }
    @Then("start and end input time are not displayed and start and end date box are displayed")
    public void start_and_end_input_time_are_not_displayed_and_start_and_end_date_box_are_displayed() {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();

        BrowserUtils.waitFor(1);
        assertTrue(createCalendarEvent.startDateBox.isDisplayed());
        assertTrue(createCalendarEvent.endDateBox.isDisplayed());
        assertFalse(createCalendarEvent.startTime.isDisplayed());
        assertFalse(createCalendarEvent.endTime.isDisplayed());
    }
    @When("user select repeat check box")
    public void user_select_repeat_check_box() {

        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();
        BrowserUtils.waitForPageToLoad(4);
        try {
            createCalendarEvent.repeatCheckBox.click();
        }catch (Exception e){
            BrowserUtils.waitForClickablility(createCalendarEvent.repeatCheckBox,5);
            BrowserUtils.waitFor(1);
            createCalendarEvent.repeatCheckBox.click();
        }
    }


    @Then("verify that repeat check box is selected")
    public void verify_that_repeat_check_box_is_selected() {

        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();
        assertTrue(createCalendarEvent.repeatCheckBox.isSelected());

    }
    @Then("verify that {string} is selected as default and see the following options")
    public void verify_that_is_selected_as_default_and_see_the_following_options(String defaultoption, List<String> expectedOptions) {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();

        WebElement firstSelectedOption = createCalendarEvent.getRepeatOptions().getFirstSelectedOption();

        // retrieve the text of the default option
        String actualOption = firstSelectedOption.getText();
        assertEquals(defaultoption, actualOption);

        // get the each web element from the select tag and put it in the List
        List<WebElement> options = createCalendarEvent.getRepeatOptions().getOptions();

        // create a new List to put actual options
        List<String> actualOptions = new ArrayList<>();

        // put each options in the crated List above.
        for (WebElement option : options) {
            actualOptions.add(option.getText());
            System.out.println(option.getText());
        }
        assertEquals(expectedOptions,actualOptions);
    }
    @Then("verify that repeat every button is selected")
    public void verify_that_repeat_every_button_is_selected() {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();
         assertTrue(createCalendarEvent.repeatEveryRadioButton.isSelected());
    }

    @Then("verify that Never radio button is selected as an Ends option")
    public void verify_that_never_radio_button_is_selected_as_an_ends_option() {

        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();
        assertTrue(createCalendarEvent.neverButton.isSelected());

    }


    @Then("verify that {string} is displayed")
    public void verify_that_is_displayed(String expectedText) {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();
        String actualText=createCalendarEvent.summaryText.getText() + createCalendarEvent.dailyText.getText();
        System.out.println("actualText = " + actualText);

        assertEquals(expectedText,actualText);

    }

    @When("user enters {string} as an occurrence as an Ends option")
    public void user_enters_as_an_occurrence_as_an_ends_option(String number) {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();
        createCalendarEvent.afterRadioButton.click();
        createCalendarEvent.afterOccurrenceInputBox.sendKeys(number);
        createCalendarEvent.afterOccurrenceInputBox.submit();

    }

    @Then("verify that  this message {string} is displayed")
    public void verify_that_this_message_is_displayed(String expectedText) {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();
        BrowserUtils.waitForVisibility(createCalendarEvent.occurrenceText,3);

        String actualText=createCalendarEvent.summaryText.getText() + createCalendarEvent.dailyText.getText() + createCalendarEvent.occurrenceText.getText();
        System.out.println("actualText = " + actualText);
        assertEquals(expectedText,actualText);

    }

    @When("user  select By {string} as an Ends option")
    public void user_select_by_as_an_ends_option(String date) {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();
        createCalendarEvent.byRadioButton.click();

        //BrowserUtils.waitForVisibility(createCalendarEvent.dateBox,3);
        //createCalendarEvent.dateBox.sendKeys(date);
        BrowserUtils.waitFor(1);
        createCalendarEvent.dateBox.sendKeys(date,Keys.ENTER);

    }

    @Then("verify that the message {string} is displayed")
    public void verify_that_the_message_is_displayed(String expectedText) {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();
        BrowserUtils.waitFor(2);
        String actualText=createCalendarEvent.summaryText.getText() +
                createCalendarEvent.dailyText.getText() +
                createCalendarEvent.byDateText.getText();
        System.out.println("actualText = " + actualText);
        assertEquals(expectedText,actualText);
    }
    @When("user selects {string} options as a Repeat option")
    public void user_selects_options_as_a_Repeat_option(String string) {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();
        Select repeatOptions = createCalendarEvent.getRepeatOptions();
        
        repeatOptions.selectByVisibleText(string);
        String actualOption = repeatOptions.getFirstSelectedOption().getText();
        System.out.println("actualOption = " + actualOption);

    }

    @When("user selects {string} and {string} options as a Repeat on options")
    public void user_selects_and_options_as_a_Repeat_on_options(String day1, String day2) {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();
        createCalendarEvent.repeatOnDay(day1).click();
        createCalendarEvent.repeatOnDay(day2).click();

    }

    @Then("verify that following message {string} is displayed")
    public void verify_that_following_message_is_displayed(String expectedText) {
        CreateCalendarEvent createCalendarEvent = new CreateCalendarEvent();
        String actualText=createCalendarEvent.summaryText.getText()+createCalendarEvent.repeatOnDaysText.getText();

        assertEquals(expectedText,actualText);


    }

}
