package com.treiPiloni.testing.Steps;

import com.treiPiloni.testing.Pages.DemoPage;
import com.treiPiloni.testing.Pages.RbForumPage;
import com.treiPiloni.testing.Utils.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by vlad.iliescu on 09/06/2017.
 */
public class RbForumSteps {

    private BaseUtil baseUtil;
    private RbForumPage rbForumPage;

    public RbForumSteps(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
        rbForumPage = new RbForumPage(baseUtil.driver);
    }


    @Given("^I navigate to forum web page$")
    public void iNavigateToForumWebPage() {
        // Write code here that turns the phrase above into concrete actions
        rbForumPage.navigateToForum();
    }

    @And("^I introduce valid credentials$")
    public void iIntroduceValidCredentials() {
        // Write code here that turns the phrase above into concrete actions
        rbForumPage.enterUserNameInLogInBox();
        rbForumPage.enterPasswordInPasswordBox();
    }

    @And("^I click the login button$")
    public void iClickTheLoginButton() {
        // Write code here that turns the phrase above into concrete actions
        rbForumPage.clickLogInButton();

    }

    @Then("^I am logged in$")
    public void iAmLoggedIn() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I click on go to last commode post$")
    public void iClickOnGoToLastCommodePost() {
        // Write code here that turns the phrase above into concrete actions
        rbForumPage.goToCommodeLastPost();
    }

    @Then("^I open a new tab with football Italia news feed$")
    public void iOpenANewTabWithFootballItaliaNewsFeed() {
        // Write code here that turns the phrase above into concrete actions
        rbForumPage.openNewTabWithFootballItaliaNewsFeed();
    }

    @Then("^I publish Milan related news$")
    public void iPublishMilanRelatedNews() {
        // Write code here that turns the phrase above into concrete actions
        rbForumPage.publishMilanRelatedNews();
    }
}
