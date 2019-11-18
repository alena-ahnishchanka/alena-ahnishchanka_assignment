package pages.po.actions;

import business_objects.PageAddress;
import business_objects.RegisteredUser;
import pages.po.elements.AbstractPageElements;
import pages.po.elements.LogInPageElements;

import java.util.concurrent.TimeUnit;

public class LogInPageActions extends AbstractPageActions {

    private LogInPageElements logInPageElements = new LogInPageElements();

    public LogInPageActions() {
        super();
    }

    public RegisteredUser user = new RegisteredUser();

    public LogInPageActions open(PageAddress pageAddress) {
        driver.navigate().to(pageAddress.getLogInPageUrl());
        return this;
    }

    public LogInPageActions fillUsernameInput(String username) {
        waitForElementEnabled(logInPageElements.USERNAME_INPUT_LOCATOR);
        user.setUsername(username);
        driver.findElement(logInPageElements.USERNAME_INPUT_LOCATOR).sendKeys(user.getUsername());
        return this;
    }

    public LogInPageActions fillPasswordInput(String password) {
        waitForElementEnabled(logInPageElements.PASSWORD_INPUT_LOCATOR);
        user.setPassword(password);
        driver.findElement(logInPageElements.PASSWORD_INPUT_LOCATOR).sendKeys(user.getPassword());
        return this;
    }

    public ProfilePageActions clickLogInButton() throws InterruptedException {
        waitForElementEnabled(logInPageElements.LOGIN_BUTTON_LOCATOR);
        driver.findElement(logInPageElements.LOGIN_BUTTON_LOCATOR).click();
        return new ProfilePageActions();
    }

    public String verifyStatusMessageText() throws InterruptedException {
        waitForElementEnabled(logInPageElements.STATUS_LINE_LOCATOR);
        String statusMessageText = driver.findElement(logInPageElements.STATUS_LINE_LOCATOR).getText();
        return statusMessageText;
    }

    public Boolean logInPageEnabled() throws InterruptedException {
        waitForElementEnabled(logInPageElements.LOGIN_PAGE_LABEL_LOCATOR);
        Boolean logInPageEnabled = driver.findElement(logInPageElements.LOGIN_PAGE_LABEL_LOCATOR).isEnabled();
        return logInPageEnabled;
    }

    public HomePageActions openHomePage() {
        waitForElementEnabled(logInPageElements.HOME_LINK_LOCATOR);
        driver.findElement(logInPageElements.HOME_LINK_LOCATOR).click();
        return new HomePageActions();
    }

}
