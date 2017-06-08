package com.treiPiloni.testing.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by vlad.iliescu on 06/06/2017.
 */
public class DemoPage {
    public DemoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='nav-search-icon']")
    private WebElement searchIcon;

    @FindBy(xpath = "//*[@class='searchBlock']//*[@placeholder='SEARCH']")
    private WebElement searchField;

    public void clickOnSearchIcon() {
        searchIcon.click();
    }

    public void enterIntoSearchField(String firstKeyWord, String secondKeyWord) {
        searchField.click();
        searchField.sendKeys(firstKeyWord + "" + secondKeyWord);
        //wait a bit to visually see results
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
