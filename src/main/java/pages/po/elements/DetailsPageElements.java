package pages.po.elements;

import org.openqa.selenium.By;

public class DetailsPageElements extends AbstractPageElements {

    public DetailsPageElements() {
        super();
    }

    public By HOME_LINK_LOCATOR = By.id("home_link");

    public By STATUS_LINE_LOCATOR = By.id("status");

    public By PROFILE_LINK_LOCATOR = By.id("profile_link");

    public By DETAILS_LINK_LOCATOR = By.id("details_link");

    public By LOG_OFF_LINK_LOCATOR = By.linkText("log out");

    public By DETAILS_PAGE_LABEL_LOCATOR = By.xpath("//*[@class='view-module--view--3wzVy']/h1[text()='Your Details']");

    public By NAME_DETAILS_LOCATOR = By.xpath("//*[@class='view-module--view--3wzVy']//li[1]");

    public By EMAIL_DETAILS_LOCATOR = By.xpath("//*[@class='view-module--view--3wzVy']//li[2]");

}
