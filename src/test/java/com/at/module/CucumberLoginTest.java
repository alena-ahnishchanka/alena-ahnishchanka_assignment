package com.at.module;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.po.actions.AbstractPageActions;
import utils.DriverFactory;
import utils.WebDriverSingleton;

@CucumberOptions(
        strict = true,
        plugin = { "json:target/cucumber-report.json",
                "html:target/cucumber-report"},
        features = {"src/test/java/com/at/module/cucumber/features"},
        glue = {"com/at/module/cucumber/steps"})


public class CucumberLoginTest extends AbstractTestNGCucumberTests {

    // Factory Pattern usage for creating appropriate browser and using it:

    DriverFactory driverFactory = new DriverFactory();

    String driverName = "CHROME";

    // get an object of ChromeDriverSingleton and call its methods:
    WebDriverSingleton driver = driverFactory.getDriver(driverName);

    @BeforeClass(description = "Start browser")
    public void setUp() {
        AbstractPageActions.setDriver(driver.getWebDriverInstance());
    }

    @AfterClass(description = "Close browser")
    public void cleanUp() {
        driver.kill();
    }

}
