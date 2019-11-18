package pages.po.actions;

import business_objects.PageAddress;
import pages.po.elements.AbstractPageElements;
import pages.po.elements.DetailsPageElements;

import java.util.concurrent.TimeUnit;

public class DetailsPageActions extends AbstractPageActions {

    private DetailsPageElements detailsPageElements = new DetailsPageElements();

    public DetailsPageActions() {
        super();
    }

    public DetailsPageActions open(PageAddress pageAddress) {
        driver.navigate().to(pageAddress.getDetailsPageUrl());
        return this;
    }

    public ProfilePageActions openProfilePage() {
        waitForElementEnabled(detailsPageElements.PROFILE_LINK_LOCATOR);
        driver.findElement(detailsPageElements.PROFILE_LINK_LOCATOR).click();
        return new ProfilePageActions();
    }

    public Boolean detailsPageEnabled() throws InterruptedException {
        waitForElementEnabled(detailsPageElements.DETAILS_PAGE_LABEL_LOCATOR);
        Boolean detailsPageEnabled = driver.findElement(detailsPageElements.DETAILS_PAGE_LABEL_LOCATOR).isEnabled();
        //Thread.sleep(2000);
        return detailsPageEnabled;
    }

    public String verifyStatusMessageText() throws InterruptedException {
        waitForElementEnabled(detailsPageElements.STATUS_LINE_LOCATOR);
        String statusMessageText = driver.findElement(detailsPageElements.STATUS_LINE_LOCATOR).getText();
        return statusMessageText;
    }

    public String verifyNameDetailsText() throws InterruptedException {
        waitForElementEnabled(detailsPageElements.NAME_DETAILS_LOCATOR);
        String nameDetailsText = driver.findElement(detailsPageElements.NAME_DETAILS_LOCATOR).getText();
        return nameDetailsText;
    }

    public String verifyEmailDetailsText() throws InterruptedException {
        waitForElementEnabled(detailsPageElements.EMAIL_DETAILS_LOCATOR);
        String emailDetailsText = driver.findElement(detailsPageElements.EMAIL_DETAILS_LOCATOR).getText();
        return emailDetailsText;
    }

    public LogInPageActions logOff() throws InterruptedException {
        waitForElementPresent(detailsPageElements.LOG_OFF_LINK_LOCATOR);
        driver.findElement(detailsPageElements.LOG_OFF_LINK_LOCATOR).click();
        return new LogInPageActions();
    }

    public HomePageActions openHomePage() {
        waitForElementEnabled(detailsPageElements.HOME_LINK_LOCATOR);
        driver.findElement(detailsPageElements.HOME_LINK_LOCATOR).click();
        return new HomePageActions();
    }
}
