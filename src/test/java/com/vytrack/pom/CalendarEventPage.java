package com.vytrack.pom;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventPage {
    public CalendarEventPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "(//a[text()='...'])[1]")
    public WebElement threeDotIcon;

    @FindBy(xpath = "//a[@title='View']")
    public WebElement viewIcon;

    @FindBy(xpath = "//a[@title='Edit']")
    public WebElement editIcon;

    @FindBy(xpath = "//li[@class='launcher-item']//a[contains(@title,'Delete')]")
    public WebElement deleteIcon;

    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridOptions;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[2]")
    public WebElement calendarCheckBox;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[3]")
    public WebElement startCheckBox;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[4]")
    public WebElement EndCheckBox;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[5]")
    public WebElement reCurrentCheckBox;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[6]")
    public WebElement reCurrenceCheckBox;

    @FindBy(xpath = "(//input[starts-with(@id,'column-c')])[7]")
    public WebElement invitationStatusCheckBox;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEventButton;


    public WebElement gridOptionsColums(String str){
        String locator="//span[text()='"+str+"']";
        WebElement webElement = Driver.get().findElement(By.xpath(locator));
        return webElement;


    }




}
