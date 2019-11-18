package com.at.module.cucumber.steps;

import business_objects.PageAddress;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.po.actions.*;

public class LoginSteps {

    //Class with Steps for login up functionality implementation

    HomePageActions homePage = new HomePageActions();

    LogInPageActions logInPage = new LogInPageActions();

    ProfilePageActions profilePage = new ProfilePageActions();

    DetailsPageActions detailsPage = new DetailsPageActions();

    @Given("the user navigates to Home page")
    public void open_home_page() {
        homePage.open(new PageAddress());
    }

    @Given("the user clicks on 'LogIn' link")
    public void open_logIn_page() {
        homePage.openLogInPage();
    }

    @Then("LogIn page is opened")
    public void login_page_is_opened() throws InterruptedException {
        Boolean logInPageIsOpened = logInPage.logInPageEnabled();
        Assert.assertTrue(logInPageIsOpened);
    }

    @When("the user enters \"([\"]*)\" value in 'USERNAME' text field of LogIn page")
    public void enter_username_value(String username) {
        logInPage.fillUsernameInput(username);
    }

    @When("the user enters \"([\"]*)\" value in 'PASSWORD' text field of LogIn page")
    public void enter_password_value(String password) {
        logInPage.fillPasswordInput(password);
    }

    @When("the user clicks on 'LogIn' button")
    public void click_on_logIn_button() throws InterruptedException {
        logInPage.clickLogInButton();
    }

    @When("the user clicks on 'Profile' link")
    public void open_profile_page() {
        detailsPage.openProfilePage();
    }

    @Then("Profile page is opened")
    public void profile_page_is_opened() throws InterruptedException {
        Boolean profilePageIsOpened = profilePage.profilePageEnabled();
        Assert.assertTrue(profilePageIsOpened);
    }

    @When("the user clicks on 'Details' link")
    public void open_details_page() {
        profilePage.openDetailsPage();
    }

    @Then("Details page is opened")
    public void details_page_is_opened() throws InterruptedException {
        Boolean detailsPageIsOpened = detailsPage.detailsPageEnabled();
        Assert.assertTrue(detailsPageIsOpened);
    }

    @Then("he should see name details: {string}")
    public void verify_name_details(String nameDetails) throws InterruptedException {
        String actualNameDetails = detailsPage.verifyNameDetailsText();
        Assert.assertEquals(actualNameDetails, nameDetails);
    }

    @Then("he should see email details: {string}")
    public void verify_email_details(String emailDetails) throws InterruptedException {
        String actualEmailDetails = detailsPage.verifyEmailDetailsText();
        Assert.assertEquals(actualEmailDetails, emailDetails);
    }

    @When("the user logs off")
    public void log_off() throws InterruptedException {
        detailsPage.logOff();
    }

    @When("the user clicks on 'Home' link")
    public void click_on_home_link() {
        logInPage.openHomePage();
    }

    @Then("Home page is opened")
    public void home_page_is_opened() throws InterruptedException {
        Boolean homePageIsOpened = homePage.homePageEnabled();
        Assert.assertTrue(homePageIsOpened);
    }

    @When("the username {string} was registered with password {string}")
    public void enter_login_values(String username, String password) throws InterruptedException {
        logInPage.fillUsernameInput(username);
        logInPage.fillPasswordInput(password);
    }

    @When("the user attempts to login")
    public void attempt_to_login() throws InterruptedException {
        logInPage.clickLogInButton();
    }

    @Then("he should see a welcome message: {string}")
    public void verify_welcome_message(String welcomeMessage) throws InterruptedException {
        String actualWelcomeMessageText = profilePage.verifyWelcomeMessageText();
        Assert.assertEquals(actualWelcomeMessageText, welcomeMessage);
    }

    @Then("he should see a super power message: {string}")
    public void verify_super_power_message(String superPowerMessage) throws InterruptedException {
        String actualSuperPowerMessageText = profilePage.verifySuperPowerMessageText();
        Assert.assertEquals(actualSuperPowerMessageText, superPowerMessage);
    }

    @Then("he should see a message: {string}")
    public void verify_list_of_users_message(String listOfusersMessage) throws InterruptedException {
        String actualListOfusersMessageText = profilePage.verifyListOfUsersMessageText();
        Assert.assertEquals(actualListOfusersMessageText, listOfusersMessage);
    }

    @Then("he should not see a message: {string}")
    public void not_see_list_of_users_message(String listOfusersMessage) throws InterruptedException {
        String actualListOfusersMessageText = profilePage.verifyListOfUsersMessageText();
        Assert.assertNotEquals(actualListOfusersMessageText, listOfusersMessage);
    }

    @Then("he should see a list of users table")
    public void see_list_of_users_table() throws InterruptedException {
        Boolean listOfusersTableIsDisplayed = profilePage.listOfUsersTableIsDisplayed();
        Assert.assertTrue(listOfusersTableIsDisplayed);
    }

    @Then("he should not see a list of users table")
    public void not_see_list_of_users_table() throws InterruptedException {
        Boolean listOfusersTableIsNotDisplayed = profilePage.listOfUsersTableIsDisplayed();
        Assert.assertFalse(listOfusersTableIsNotDisplayed);
    }

    @Then("list of users table should contain {int} users")
    public void verify_list_of_users_table_size(int size) throws InterruptedException {
        int actualListOfusersTableSize = profilePage.verifyListOfUsersTableSize();
        Assert.assertEquals(actualListOfusersTableSize, size);
    }

    @Then("list of users table should contain a user with {string} name and {string} e-mail in row 1")
    public void verify_user1_in_list(String name, String email) throws InterruptedException {
        String user1InList = profilePage.verifyUser1InList();
        String email1InList = profilePage.verifyEmail1InList();
        Assert.assertEquals(user1InList, name);
        Assert.assertEquals(email1InList, email);
    }

    @Then("list of users table should contain a user with {string} name and {string} e-mail in row 2")
    public void verify_user2_in_list(String name, String email) throws InterruptedException {
        String user2InList = profilePage.verifyUser2InList();
        String email2InList = profilePage.verifyEmail2InList();
        Assert.assertEquals(user2InList, name);
        Assert.assertEquals(email2InList, email);
    }

    @Then("list of users table should contain a user with {string} name and {string} e-mail in row 3")
    public void verify_user3_in_list(String name, String email) throws InterruptedException {
        String user3InList = profilePage.verifyUser3InList();
        String email3InList = profilePage.verifyEmail3InList();
        Assert.assertEquals(user3InList, name);
        Assert.assertEquals(email3InList, email);
    }

    @Then("he should see a status message: {string}")
    public void verify_status_message(String statusMessage) throws InterruptedException {
        Boolean actualStatusMessageText = profilePage.verifyStatusMessageText().contains(statusMessage);
        Assert.assertTrue(actualStatusMessageText);
    }
}
