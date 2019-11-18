package pages.po.elements;

import org.openqa.selenium.By;

public class LogInPageElements extends AbstractPageElements {

    public LogInPageElements() {
        super();
    }

    public By HOME_LINK_LOCATOR = By.id("home_link");

    public By STATUS_LINE_LOCATOR = By.id("status");

    public By USERNAME_INPUT_LOCATOR = By.id("username_input");

    public By PASSWORD_INPUT_LOCATOR = By.id("password_input");

    public By LOGIN_BUTTON_LOCATOR = By.id("login_button");

    public By LOGIN_PAGE_LABEL_LOCATOR = By.xpath("//*[@class='view-module--view--3wzVy']/h1[text()='Log In']");

}
