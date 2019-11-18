package pages.po.actions;

import business_objects.NewUser;
import business_objects.PageAddress;
import business_objects.RegisteredUser;
import org.openqa.selenium.support.ui.Select;
import pages.po.elements.LogInPageElements;
import pages.po.elements.SignUpPageElements;

import java.util.concurrent.TimeUnit;

public class SignUpPageActions extends AbstractPageActions {

    private SignUpPageElements signUpPageElements = new SignUpPageElements();

    public NewUser user = new NewUser();

    public SignUpPageActions() {
        super();
    }

    public SignUpPageActions open(PageAddress pageAddress) {
        driver.navigate().to(pageAddress.getSighUpPageUrl());
        return this;
    }

    public SignUpPageActions fillUsernameInput(String username) {
        waitForElementEnabled(signUpPageElements.USERNAME_INPUT_LOCATOR);
        user.setUsername(username);
        driver.findElement(signUpPageElements.USERNAME_INPUT_LOCATOR).sendKeys(user.getUsername());
        return this;
    }

    public SignUpPageActions fillPasswordInput(String password) {
        waitForElementEnabled(signUpPageElements.PASSWORD_INPUT_LOCATOR);
        user.setPassword(password);
        driver.findElement(signUpPageElements.PASSWORD_INPUT_LOCATOR).sendKeys(user.getPassword());
        return this;
    }

    public SignUpPageActions fillNameInput(String name) {
        waitForElementEnabled(signUpPageElements.NAME_INPUT_LOCATOR);
        user.setName(name);
        driver.findElement(signUpPageElements.NAME_INPUT_LOCATOR).sendKeys(user.getName());
        return this;
    }

    public SignUpPageActions fillEmailInput(String email) {
        waitForElementEnabled(signUpPageElements.EMAIL_INPUT_LOCATOR);
        user.setEmail(email);
        driver.findElement(signUpPageElements.EMAIL_INPUT_LOCATOR).sendKeys(user.getEmail());
        return this;
    }

    public SignUpPageActions selectDay(String day) {
        waitForElementEnabled(signUpPageElements.DAY_INPUT_LOCATOR);
        user.setDay(day);
        new Select (driver.findElement(signUpPageElements.DAY_INPUT_LOCATOR)).selectByValue(String.valueOf(user.getDay()));
        return this;
    }

    public SignUpPageActions selectMonth(String month) {
        waitForElementEnabled(signUpPageElements.MONTH_INPUT_LOCATOR);
        user.setMonth(month);
        new Select (driver.findElement(signUpPageElements.MONTH_INPUT_LOCATOR)).selectByValue(user.getMonth());
        return this;
    }

    public SignUpPageActions selectYear(String year) {
        waitForElementEnabled(signUpPageElements.YEAR_INPUT_LOCATOR);
        user.setYear(year);
        new Select (driver.findElement(signUpPageElements.YEAR_INPUT_LOCATOR)).selectByValue(String.valueOf(user.getYear()));
        return this;
    }

    public ProfilePageActions clickSubmitButton() throws InterruptedException {
        waitForElementEnabled(signUpPageElements.SUBMIT_BUTTON_LOCATOR);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.findElement(signUpPageElements.SUBMIT_BUTTON_LOCATOR).click();
        Thread.sleep(2000);
        return new ProfilePageActions();
    }

    public String verifyStatusMessageText() throws InterruptedException {
        waitForElementEnabled(signUpPageElements.STATUS_LINE_LOCATOR);
        String statusMessageText = driver.findElement(signUpPageElements.STATUS_LINE_LOCATOR).getText();
        return statusMessageText;
    }

    public Boolean signUpPageEnabled() throws InterruptedException {
        waitForElementEnabled(signUpPageElements.SIGNUP_PAGE_LABEL_LOCATOR);
        Boolean signUpPageEnabled = driver.findElement(signUpPageElements.SIGNUP_PAGE_LABEL_LOCATOR).isEnabled();
        return signUpPageEnabled;
    }

    public HomePageActions openHomePage() {
        waitForElementEnabled(signUpPageElements.HOME_LINK_LOCATOR);
        driver.findElement(signUpPageElements.HOME_LINK_LOCATOR).click();
        return new HomePageActions();
    }

}
