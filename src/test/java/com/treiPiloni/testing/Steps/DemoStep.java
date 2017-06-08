package com.treiPiloni.testing.Steps;

import com.treiPiloni.testing.Pages.DemoPage;
import com.treiPiloni.testing.Utils.BaseUtil;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by vlad.iliescu on 07/06/2017.
 */
public class DemoStep {

    private BaseUtil baseUtil;
    private DemoPage demoPage;

    public DemoStep(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
        demoPage = new DemoPage(baseUtil.driver);
    }
    @Given("^I navigate to home-page$")
    public void iNavigateToHomePage() {
        baseUtil.driver.get("https://www.3pillarglobal.com/");
    }

    @Then("^I click on search Icon$")
    public void iClickOnSearchIcon()  {
        demoPage = new DemoPage(baseUtil.driver);
        demoPage.clickOnSearchIcon();
    }

    @Then("^I type ([^\"]*) and ([^\"]*)$")
    public void iSearchFor(String firstKeyword, String secondKeyword)  {
        demoPage.enterIntoSearchField(firstKeyword, secondKeyword);
    }
}
