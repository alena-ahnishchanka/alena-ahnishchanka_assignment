package pages.po.elements;

import org.openqa.selenium.By;
import pages.po.actions.AbstractPageActions;

public class ProfilePageElements extends AbstractPageElements {

    public ProfilePageElements() { super(); }

    public By HOME_LINK_LOCATOR = By.id("home_link");

    public By STATUS_LINE_LOCATOR = By.id("status");

    public By PROFILE_LINK_LOCATOR = By.id("profile_link");

    public By DETAILS_LINK_LOCATOR = By.id("details_link");

    public By LOG_OFF_LINK_LOCATOR = By.linkText("log out");

    public By PROFILE_PAGE_LABEL_LOCATOR = By.xpath("//*[@class='view-module--view--3wzVy']/h1[text()='Your Profile']");

    public By PROFILE_PAGE_WELCOME_MESSAGE_LOCATOR = By.xpath("//*[@class='view-module--view--3wzVy']/p[1]");

    public By PROFILE_PAGE_SUPER_POWER_MESSAGE_LOCATOR = By.xpath("//*[@class='view-module--view--3wzVy']/p[2]");

    public By PROFILE_PAGE_LIST_OF_USERS_MESSAGE_LOCATOR = By.xpath("//*[@class='view-module--view--3wzVy']/div/p");

    public By PROFILE_PAGE_LIST_OF_USERS_TABLE_LOCATOR = By.cssSelector("#users_list_table");

    public By PROFILE_PAGE_USER1_IN_LIST_LOCATOR = By.xpath("//*[@id='users_list_table']//tr[2]/td[1]");

    public By PROFILE_PAGE_USER2_IN_LIST_LOCATOR = By.xpath("//*[@id='users_list_table']//tr[3]/td[1]");

    public By PROFILE_PAGE_USER3_IN_LIST_LOCATOR = By.xpath("//*[@id='users_list_table']//tr[4]/td[1]");

    public By PROFILE_PAGE_EMAIL1_IN_LIST_LOCATOR = By.xpath("//*[@id='users_list_table']//tr[2]/td[2]");

    public By PROFILE_PAGE_EMAIL2_IN_LIST_LOCATOR = By.xpath("//*[@id='users_list_table']//tr[3]/td[2]");

    public By PROFILE_PAGE_EMAIL3_IN_LIST_LOCATOR = By.xpath("//*[@id='users_list_table']//tr[4]/td[2]");
}
