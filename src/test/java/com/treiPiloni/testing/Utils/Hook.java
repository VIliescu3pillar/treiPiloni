package com.treiPiloni.testing.Utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

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
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");
        baseUtil.driver = new ChromeDriver();
    }

    @After
    public void TearDownTest() {
        baseUtil.driver.close();
    }
}
