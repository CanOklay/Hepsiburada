package com.testinium.base;

import com.testinium.util.Browser;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseTest {

    private static RemoteWebDriver driver;
    protected final Logger log = LogManager.getLogger(BaseTest.class);
    protected static Browser browser = new Browser();

    @Before
    public void setUp() {
        log.info("SetUp işlemi yapılıyor...");
        browser.setBrowser("https://www.hepsiburada.com/");
    }

    @After
    public void teardown() {
        getDriver().close();
    }

    public static RemoteWebDriver getDriver() {
        return driver;
    }

    public static void setDriver(RemoteWebDriver driver) {
        BaseTest.driver = driver;
    }
}
