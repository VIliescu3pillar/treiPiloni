package com.treiPiloni.testing.Utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by vlad.iliescu on 06/06/2017.
 */
public class Hook {

    private BaseUtil baseUtil;

    public Hook(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Before
    public void preTestsConfiguration() {
        //Chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/vlad.iliescu/Desktop/selenium requirements/chromedriver");
        baseUtil.driver = new ChromeDriver();
    }

    @After
    public void TearDownTest() {
        baseUtil.driver.close();
    }
}
