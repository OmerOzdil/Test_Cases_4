package com.vytrack.step_definitions;

import com.vytrack.pom.CalendarEventPage;
import com.vytrack.pom.Dashboard;
import com.vytrack.pom.Login;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;

public class CalenderEvents {

    @Given("let user logged in as {string} {string}")
    public void let_user_logged_in_as(String username, String password) {
        Driver.get().get(ConfigurationReader.get("url"));
        Login login = new Login();
        
        BrowserUtils.waitFor(1);
        login.login(ConfigurationReader.get(username),ConfigurationReader.get(password));
    }
    @When("user navigates {string} {string}")
    public void user_navigates(String tab, String module) {
        BrowserUtils.waitForPageToLoad(5);
        Dashboard dashboard = new Dashboard();
        dashboard.navigateTomodule(tab,module);

        BrowserUtils.waitFor(2);

    }

    @When("hover on the three dot icon")
    public void hover_on_the_three_dot_icon() {

        CalendarEventPage calendarEventPage = new CalendarEventPage();
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(calendarEventPage.threeDotIcon).pause(200).build().perform();

    }


    @Then("verify view, edit and delete options available")
    public void verify_view_edit_and_delete_options_available() {
        CalendarEventPage calendarEventPage = new CalendarEventPage();

        Assert.assertTrue(calendarEventPage.viewIcon.isDisplayed());
        Assert.assertTrue(calendarEventPage.editIcon.isDisplayed());
        Assert.assertTrue(calendarEventPage.deleteIcon.isDisplayed());

    }
    @When("the user click on grid options and deselect options")
    public void the_user_click_on_grid_options_and_deselect_options() {
        CalendarEventPage calendarEventPage = new CalendarEventPage();

        BrowserUtils.waitFor(2);
        calendarEventPage.gridOptions.click();

        calendarEventPage.startCheckBox.click();
        calendarEventPage.calendarCheckBox.click();

        calendarEventPage.EndCheckBox.click();
        calendarEventPage.reCurrentCheckBox.click();
        calendarEventPage.reCurrenceCheckBox.click();
        calendarEventPage.invitationStatusCheckBox.click();

    }

    @Then("Verify the {string} column still displayed")
    public void verify_the_column_still_displayed(String string) {
        CalendarEventPage calendarEventPage = new CalendarEventPage();
        Assert.assertTrue(calendarEventPage.gridOptionsColums("Title").isDisplayed());
    }

    @When("user click on create Calendar Event option")
    public void user_click_on_create_calendar_event_option() {

        BrowserUtils.waitForPageToLoad(3);
        try{
            new CalendarEventPage().createCalendarEventButton.click();
        }catch (Exception e){
            BrowserUtils.waitFor(2);
            new CalendarEventPage().createCalendarEventButton.click();
        }

    }

    @Then("verify that {string} page title is displayed")
    public void verify_that_page_title_is_displayed(String string) {

        BrowserUtils.waitForPageToLoad(3);

        Dashboard dashboard = new Dashboard();
        BrowserUtils.waitForPageToLoad(3);
        assertEquals(string,dashboard.pageTitle.getText());



    }



}
