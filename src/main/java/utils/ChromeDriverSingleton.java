package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ChromeDriverSingleton implements WebDriverSingleton {

    static WebDriver instance;

    // Singleton Pattern usage for browser creating:
    public WebDriver getWebDriverInstance() {
        if (instance != null) {
            return instance;
        }
        return instance = initBrowserFactory();
    }

    private WebDriver initBrowserFactory() {

    // Set the chrome driver
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

    // Create Object of ChromeOption Class
        ChromeOptions option=new ChromeOptions();

    // Set Headless mode "true" of "false" option
        option.setHeadless(false);

        driver = new ChromeDriver(option);

        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }

    //  Close the chrome driver instance
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
