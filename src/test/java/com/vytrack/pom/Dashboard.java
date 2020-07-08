package com.vytrack.pom;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    public Dashboard(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement pageTitle;

    public void navigateTomodule(String tab, String module){

        String tabLocator="//span[contains(text(),'"+tab+"') and (@class='title title-level-1')]";
        String moduleLocator="//span[contains(text(),'"+module+"') and(@class='title title-level-2')]";

        WebElement tab1=Driver.get().findElement(By.xpath(tabLocator));
        WebElement module1=Driver.get().findElement(By.xpath(moduleLocator));

        try {
            BrowserUtils.waitForPageToLoad(4);
            BrowserUtils.waitForVisibility(By.xpath(tabLocator),5);
            Actions actions= new Actions(Driver.get());
            actions.moveToElement(tab1).pause(200).build().perform();

            BrowserUtils.waitForClickablility(module1,3);
            module1.click();

        }catch(Exception e){

            BrowserUtils.waitFor(3);
            new Actions(Driver.get()).moveToElement(tab1).pause(200).build().perform();
            BrowserUtils.waitForClickablility(module1,3);
            module1.click();


        }
    }

}
