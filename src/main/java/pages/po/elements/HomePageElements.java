package pages.po.elements;

import org.openqa.selenium.By;

public class HomePageElements extends AbstractPageElements {

    public HomePageElements() {
        super();
    }

    public By HOME_LINK_LOCATOR = By.id("home_link");

    public By STATUS_LINE_LOCATOR = By.id("status");

    public By LOGIN_LINK_LOCATOR = By.id("login_link");

    public By SIGNUP_LINK_LOCATOR = By.id("signup_link");

    public By HOME_PAGE_LABEL_LOCATOR = By.xpath("//*[@class='view-module--view--3wzVy']/h1[text()='WAES Tester Assignment']");

}
