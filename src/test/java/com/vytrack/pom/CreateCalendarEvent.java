package com.vytrack.pom;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateCalendarEvent {
    public CreateCalendarEvent() {
        PageFactory.initElements(Driver.get(), this);

    }
    @FindBy(css = ".btn-success.btn.dropdown-toggle")
    public WebElement SaveAndNewExpandButton;

    @FindBy(xpath = "//span[@class='caret']")
    public WebElement SaveAndNewExpandButton1;

    @FindBy(xpath = "(//ul[@class='dropdown-menu']/li/button[@type='submit' and (contains(text(),'Save'))])[1]")
    public WebElement saveAndCloseButton;

    @FindBy(xpath = "(//ul[@class='dropdown-menu']/li/button[@type='submit' and (contains(text(),'Save'))])[2]")
    public WebElement saveAndNewButton;

    @FindBy(xpath = "(//ul[@class='dropdown-menu']/li/button[@type='submit' and (contains(text(),'Save'))])[3]")
    public WebElement saveButton;

    @FindBy(xpath = "//a[contains(text(),'Cancel')]")
    public WebElement cancelButton;

    @FindBy(xpath = "//input[starts-with(@id,'time_selector_oro_calendar_event_form_start')]")
    public WebElement startTime;

    @FindBy(xpath = "//input[starts-with(@id,'time_selector_oro_calendar_event_form_end-uid')]")
    public WebElement endTime;

    @FindBy(xpath = "//input[starts-with(@id,'oro_calendar_event_form_allDay')]")
    public WebElement allDayEventCheckBox;

    @FindBy(xpath = "//input[starts-with(@id,'date_selector_oro_calendar_event_form_start-')]")
    public WebElement startDateBox;

    @FindBy(xpath = "//input[starts-with(@id,'date_selector_oro_calendar_event_form_end-uid')]")
    public WebElement endDateBox;

    @FindBy(xpath = "//input[starts-with(@id,'recurrence-repeat')]")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//select[starts-with(@id,'recurrence-repeats')]")
    public WebElement repeatDropDown;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement repeatEveryRadioButton;

    @FindBy(xpath = "(//input[@type='radio'])[3]")
    public WebElement neverButton;

    @FindBy(xpath = "//label[text()='Summary:']")
    public WebElement summaryText;

    @FindBy(xpath = "//span[text()='Daily every 1 day']")
    public WebElement dailyText;

    @FindBy(xpath = "(//*[@type='radio'])[4]")
    public WebElement afterRadioButton;

    @FindBy(xpath = "(//input[@class='recurrence-subview-control__number'])[7]")
    public WebElement afterOccurrenceInputBox;

    @FindBy(xpath = "//span[text()=', end after 10 occurrences']")
    public WebElement occurrenceText;



    public Select getRepeatOptions(){
        return new Select(repeatDropDown);
    }

    









}
