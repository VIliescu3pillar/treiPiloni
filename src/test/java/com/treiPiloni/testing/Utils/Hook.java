package com.treiPiloni.testing.Utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

        DesiredCapabilities capability = DesiredCapabilities.chrome();
        try {
            baseUtil.driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


//        System.setProperty("webdriver.chrome.driver", "/Users/vlad.iliescu/Desktop/selenium requirements/chromedriver");
//        baseUtil.driver = new ChromeDriver();
    }

    @After
    public void TearDownTest() {
        baseUtil.driver.close();
    }
}
