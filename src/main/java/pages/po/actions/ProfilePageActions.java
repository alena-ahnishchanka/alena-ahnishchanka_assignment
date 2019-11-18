package pages.po.actions;

import business_objects.PageAddress;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.po.elements.AbstractPageElements;
import pages.po.elements.ProfilePageElements;
import utils.Screenshoter;

import java.util.concurrent.TimeUnit;

public class ProfilePageActions extends AbstractPageActions {

    private ProfilePageElements profilePageElements = new ProfilePageElements();

    public ProfilePageActions() {
        super();
    }

    public ProfilePageActions open(PageAddress pageAddress) {
        driver.navigate().to(pageAddress.getProfilePageUrl());
        return this;
    }

    public DetailsPageActions openDetailsPage() {
        waitForElementEnabled(profilePageElements.DETAILS_LINK_LOCATOR);
        driver.findElement(profilePageElements.DETAILS_LINK_LOCATOR).click();
        return new DetailsPageActions();
    }

    public Boolean profilePageEnabled() throws InterruptedException {
        Boolean profilePageEnabled;
        try {
            profilePageEnabled = driver.findElement(profilePageElements.PROFILE_PAGE_LABEL_LOCATOR).isDisplayed();
        } catch (NoSuchElementException e) {
            profilePageEnabled = false;
        }
        return profilePageEnabled;
    }

    public Boolean welcomeMessageIsDisplayed() throws InterruptedException {
        waitForElementEnabled(profilePageElements.PROFILE_PAGE_WELCOME_MESSAGE_LOCATOR);
        Boolean welcomeMessageIsDisplayed = driver.findElement(profilePageElements.PROFILE_PAGE_WELCOME_MESSAGE_LOCATOR).isDisplayed();
        return welcomeMessageIsDisplayed;
    }

    public String verifyWelcomeMessageText() throws InterruptedException {
        waitForElementEnabled(profilePageElements.PROFILE_PAGE_WELCOME_MESSAGE_LOCATOR);
        String welcomeMessageText = driver.findElement(profilePageElements.PROFILE_PAGE_WELCOME_MESSAGE_LOCATOR).getText();
        return welcomeMessageText;
    }

    public String verifySuperPowerMessageText() throws InterruptedException {
        waitForElementEnabled(profilePageElements.PROFILE_PAGE_SUPER_POWER_MESSAGE_LOCATOR);
        String superPowerMessageText = driver.findElement(profilePageElements.PROFILE_PAGE_SUPER_POWER_MESSAGE_LOCATOR).getText();
        return superPowerMessageText;
    }

    public String verifyListOfUsersMessageText() throws InterruptedException, NoSuchElementException {
        String listOfUsersMessageText;
        try {
            listOfUsersMessageText = driver.findElement(profilePageElements.PROFILE_PAGE_LIST_OF_USERS_MESSAGE_LOCATOR).getText();
        } catch (NoSuchElementException e) {
            listOfUsersMessageText = "no message";
        }
        return listOfUsersMessageText;
    }

    public Boolean listOfUsersTableIsDisplayed() throws InterruptedException {
        Boolean listOfUsersTableIsDisplayed;
        try {
            listOfUsersTableIsDisplayed = driver.findElement(profilePageElements.PROFILE_PAGE_LIST_OF_USERS_TABLE_LOCATOR).isDisplayed();
        } catch (NoSuchElementException e) {
            listOfUsersTableIsDisplayed = false;
        }
        return listOfUsersTableIsDisplayed;
    }

    public Boolean verifySuperPowerMessageIsDisplayed() throws InterruptedException {
        Boolean superPowerMessageIsDisplayed;
        try {
            superPowerMessageIsDisplayed = driver.findElement(profilePageElements.PROFILE_PAGE_SUPER_POWER_MESSAGE_LOCATOR).isDisplayed();
        } catch (NoSuchElementException e) {
            superPowerMessageIsDisplayed = false;
        }
        return superPowerMessageIsDisplayed;
    }

    public int verifyListOfUsersTableSize() throws InterruptedException {
        waitForElementEnabled(profilePageElements.PROFILE_PAGE_LIST_OF_USERS_TABLE_LOCATOR);
        int listOfUsersTableSize = driver.findElement(profilePageElements.PROFILE_PAGE_LIST_OF_USERS_TABLE_LOCATOR).findElements(By.className("home-module--tr--1vrAR")).size()-1;
        return listOfUsersTableSize;
    }

    public String verifyUser1InList() throws InterruptedException {
        waitForElementEnabled(profilePageElements.PROFILE_PAGE_USER1_IN_LIST_LOCATOR);
        String user1InList = driver.findElement(profilePageElements.PROFILE_PAGE_USER1_IN_LIST_LOCATOR).getText();
        return user1InList;
    }

    public String verifyUser2InList() throws InterruptedException {
        waitForElementEnabled(profilePageElements.PROFILE_PAGE_USER2_IN_LIST_LOCATOR);
        String user2InList = driver.findElement(profilePageElements.PROFILE_PAGE_USER2_IN_LIST_LOCATOR).getText();
        return user2InList;
    }

    public String verifyUser3InList() throws InterruptedException {
        waitForElementEnabled(profilePageElements.PROFILE_PAGE_USER3_IN_LIST_LOCATOR);
        String user3InList = driver.findElement(profilePageElements.PROFILE_PAGE_USER3_IN_LIST_LOCATOR).getText();
        return user3InList;
    }

    public String verifyEmail1InList() throws InterruptedException {
        waitForElementEnabled(profilePageElements.PROFILE_PAGE_EMAIL1_IN_LIST_LOCATOR);
        String email1InList = driver.findElement(profilePageElements.PROFILE_PAGE_EMAIL1_IN_LIST_LOCATOR).getText();
        return email1InList;
    }

    public String verifyEmail2InList() throws InterruptedException {
        waitForElementEnabled(profilePageElements.PROFILE_PAGE_EMAIL2_IN_LIST_LOCATOR);
        String email2InList = driver.findElement(profilePageElements.PROFILE_PAGE_EMAIL2_IN_LIST_LOCATOR).getText();
        return email2InList;
    }

    public String verifyEmail3InList() throws InterruptedException {
        waitForElementEnabled(profilePageElements.PROFILE_PAGE_EMAIL3_IN_LIST_LOCATOR);
        String email3InList = driver.findElement(profilePageElements.PROFILE_PAGE_EMAIL3_IN_LIST_LOCATOR).getText();
        return email3InList;
    }

    public String verifyStatusMessageText() throws InterruptedException {
        waitForElementEnabled(profilePageElements.STATUS_LINE_LOCATOR);
        String statusMessageText = driver.findElement(profilePageElements.STATUS_LINE_LOCATOR).getText();
        return statusMessageText;
    }

    public LogInPageActions logOff() throws InterruptedException {
        waitForElementPresent(profilePageElements.LOG_OFF_LINK_LOCATOR);
        driver.findElement(profilePageElements.LOG_OFF_LINK_LOCATOR).click();
        return new LogInPageActions();
    }

    public HomePageActions openHomePage() {
        waitForElementEnabled(profilePageElements.HOME_LINK_LOCATOR);
        driver.findElement(profilePageElements.HOME_LINK_LOCATOR).click();
        return new HomePageActions();
    }

}
