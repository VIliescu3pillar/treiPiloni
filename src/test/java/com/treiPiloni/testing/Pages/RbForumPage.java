package com.treiPiloni.testing.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.net.ssl.SSLContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vlad.iliescu on 09/06/2017.
 */
public class RbForumPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public RbForumPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='navbar_username']")
     WebElement logInBox;

    @FindBy(xpath = "//*[@id='navbar_password']")
    WebElement passwordBox;

    @FindBy(xpath = "//*[@value='Log in']")
    WebElement logInButton;


    public void navigateToForum() {
        driver.get("http://forum.acmilan-online.com/");
    }

    public void enterUserNameInLogInBox() {
        logInBox.sendKeys("az.");
    }

    public void enterPasswordInPasswordBox() {
        passwordBox.sendKeys("vlad1321");
    }

    public void clickLogInButton() {
        logInButton.click();
    }

    public void goToCommodeLastPost() {
        WebElement goToLastPostButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Go to last post']")));
        goToLastPostButton.click();
    }

    public void openNewTabWithFootballItaliaNewsFeed() {
        openNewTab();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("http://www.football-italia.net/news");
    }

    public void publishMilanRelatedNews() {
        List<WebElement> newsItems = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='news-idx-item-title']")));

        for (WebElement newsItem: newsItems) {
            String newsTitle = newsItem.getText();
            if(newsTitle.contains("Milan")) {
                List<WebElement> childs = newsItem.findElements(By.xpath(".//*"));
                WebElement goToDetailsLink = childs.get(0);
                String detailsLink = childs.get(0).getAttribute("href");
                generatePost(newsTitle, detailsLink);

                openNewTab();

                ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
                driver.switchTo().window(tabs.get(tabs.size()-1));
                driver.get(detailsLink);


                driver.switchTo().window(tabs.get(1));
                System.out.println(newsTitle);
            }
        }
    }

    private void openNewTab() {
        ((JavascriptExecutor)driver).executeScript("window.open()");
    }

    private void generatePost(String title, String link) {
        System.out.println("Title" + '\n' + link);
    }
}
