package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public interface WebDriverSingleton {

    WebDriver getWebDriverInstance();

    void kill();

}
