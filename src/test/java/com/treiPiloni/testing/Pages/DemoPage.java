package com.treiPiloni.testing.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by vlad.iliescu on 06/06/2017.
 */
public class DemoPage {
    private WebDriver driver;

    public DemoPage(WebDriver driver) {
        this.driver = driver;
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
        WebDriverWait wait = new WebDriverWait(driver, 30);
        searchIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='nav-search-icon']")));
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
