package pages.po.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SignUpPageElements extends AbstractPageElements {

    public SignUpPageElements() {
        super();
    }

    public By HOME_LINK_LOCATOR = By.id("home_link");

    public By STATUS_LINE_LOCATOR = By.id("status");

    public By USERNAME_INPUT_LOCATOR = By.id("username_input");

    public By PASSWORD_INPUT_LOCATOR = By.id("password_input");

    public By NAME_INPUT_LOCATOR = By.id("name_input");

    public By EMAIL_INPUT_LOCATOR = By.id("email_input");

    public By DAY_INPUT_LOCATOR = By.id("day_select");

    public By MONTH_INPUT_LOCATOR = By.id("month_select");

    public By YEAR_INPUT_LOCATOR = By.id("year_select");

    public By SUBMIT_BUTTON_LOCATOR = By.id("submit_button");

    public By SIGNUP_PAGE_LABEL_LOCATOR = By.xpath("//*[@class='view-module--view--3wzVy']/h1[text()='Sign Up']");
}
