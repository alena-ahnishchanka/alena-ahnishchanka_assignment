package pages.po.actions;

import business_objects.PageAddress;
import pages.po.elements.HomePageElements;

import java.util.concurrent.TimeUnit;

public class HomePageActions extends AbstractPageActions {

    private HomePageElements homePageElements = new HomePageElements();

    // IS iT NEEDED? AND FOR OTHER PAGES?
    public HomePageActions(){
        super();
    }

    public HomePageActions open(PageAddress pageAddress) {
        driver.navigate().to(pageAddress.getHomePageUrl());
        return this;
    }

    public LogInPageActions openLogInPage() {
        waitForElementPresent(homePageElements.LOGIN_LINK_LOCATOR);
        driver.findElement(homePageElements.LOGIN_LINK_LOCATOR).click();
        return new LogInPageActions();
    }

    public String verifyStatusMessageText() throws InterruptedException {
        waitForElementEnabled(homePageElements.STATUS_LINE_LOCATOR);
        String statusMessageText = driver.findElement(homePageElements.STATUS_LINE_LOCATOR).getText();
        return statusMessageText;
    }

    public SignUpPageActions openSignUpPage() {
        waitForElementPresent(homePageElements.SIGNUP_LINK_LOCATOR);
        driver.findElement(homePageElements.SIGNUP_LINK_LOCATOR).click();
        return new SignUpPageActions();
    }

    public Boolean homePageEnabled() throws InterruptedException {
        waitForElementEnabled(homePageElements.HOME_PAGE_LABEL_LOCATOR);
        Boolean homePageEnabled = driver.findElement(homePageElements.HOME_PAGE_LABEL_LOCATOR).isEnabled();
        return homePageEnabled;
    }

}
