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
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
}
