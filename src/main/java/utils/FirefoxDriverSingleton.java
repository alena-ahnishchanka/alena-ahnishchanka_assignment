package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxDriverSingleton implements WebDriverSingleton {

    static WebDriver instance;

    // Singleton Pattern usage for browser creating:
    public WebDriver getWebDriverInstance() {
        if (instance != null) {
            return instance;
        }
        return instance = initBrowserFactory();
    }

    private WebDriver initBrowserFactory() {

     // Set the firefox driver
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");

        driver = new FirefoxDriver();

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    //  Close the firefox driver instance
    public void kill() {
        if (instance != null) {
            try {
                instance.quit();
            } catch (Exception e) {
                DefaultLogger.error("Cannot kill browser");
            } finally {
                instance = null;
            }
        }
    }
}
