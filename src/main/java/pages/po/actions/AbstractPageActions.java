package pages.po.actions;

import business_objects.PageAddress;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.po.elements.AbstractPageElements;

import java.util.concurrent.TimeUnit;

public abstract class AbstractPageActions {


    public static WebDriver driver;

    public static void setDriver(WebDriver customDriver){
        driver = customDriver;
    }

    public void waitForElementPresent(By locator) {
        new WebDriverWait(driver, AbstractPageElements.WAIT_FOR_ELEMENT_TIMEOUT_SECONDS).until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    public void waitForElementEnabled(By locator) {
        new WebDriverWait(driver, AbstractPageElements.WAIT_FOR_ELEMENT_TIMEOUT_SECONDS).until(ExpectedConditions.elementToBeClickable(locator));
    }

}
