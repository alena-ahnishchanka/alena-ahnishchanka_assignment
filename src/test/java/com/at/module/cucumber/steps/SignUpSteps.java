package com.at.module.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.po.actions.*;

public class SignUpSteps {
    //Class with Steps for sign up functionality implementation

    HomePageActions homePage = new HomePageActions();

    SignUpPageActions signUpPage = new SignUpPageActions();

    ProfilePageActions profilePage = new ProfilePageActions();

    @Given("the user clicks on 'SignUp' link")
    public void open_signUp_page() {
        homePage.openSignUpPage();
    }

    @Then("^SignUp page is opened$")
    public void signup_page_is_opened() throws InterruptedException {
        Boolean signUpPageIsOpened = signUpPage.signUpPageEnabled();
        Assert.assertTrue(signUpPageIsOpened);
    }
    @Then("Profile page is not opened")
    public void profile_page_is_not_opened() throws InterruptedException {
        Boolean profilePageIsOpened = profilePage.profilePageEnabled();
        Assert.assertFalse(profilePageIsOpened);
    }

    // possible mistake in verb form in test description is handled
    @When("the ^User enters? username value in (?:'Username'|'USERNAME') text field of (?:SignUp|Sign Up|Sign up|sign up) page$")
    public void enter_username_value(String username) {
        signUpPage.fillUsernameInput(username);
    }

    // flexibility of page name description is handled
    // possible mistake in verb form in test description is handled
    @When("the ^User enters? password value in (?:'Password'|'PASSWORD') text field of (?:SignUp|Sign Up|Sign up|sign up) page$")
    public void enter_password_value(String password) {
        signUpPage.fillPasswordInput(password);
    }

    // possible mistake in verb form in test description is handled
    @When("the ^User enters? name value in (?:'Name'|'NAME') text field of (?:SignUp|Sign Up|Sign up|sign up) page$")
    public void enter_name_value(String name) {
        signUpPage.fillNameInput(name);
    }

    // flexibility of page name description is handled
    // possible mistake in verb form in test description is handled
    @When("the ^User enters? (?:e-mail|email|Email|E-mail) value in (?:'Email'|'EMAIL') text field of (?:SignUp|Sign Up|Sign up|sign up) page$")
    public void enter_email_value(String email) {
        signUpPage.fillEmailInput(email);
    }

    // flexibility of page name description is handled
    // possible mistake in verb form in test description is handled
    @When("the ^User selects? day value in (?:'Day'|'day') dropdown of (?:SignUp|Sign Up|Sign up|sign up) page$")
    public void select_day_value(String day) {
        signUpPage.selectDay(day);
    }

    // flexibility of page name description is handled
    // possible mistake in verb form in test description is handled
    @When("the ^User selects? month value in (?:'Month'|'month') dropdown of (?:SignUp|Sign Up|Sign up|sign up) page$")
    public void select_month_value(String month) {
        signUpPage.selectMonth(month);
    }

    // flexibility of page name description is handled
    // possible mistake in verb form in test description is handled
    @When("the ^User selects? year value in (?:'Year'|'year') dropdown of (?:SignUp|Sign Up|Sign up|sign up) page$")
    public void select_year_value(String year) {
        signUpPage.selectYear(year);
    }

    // possible mistake and flexibility of verb form in test description is handled
    @When("the ^User clicks? (?:|on) 'Submit' button$")
    public void click_on_submit_button() throws InterruptedException {
        signUpPage.clickSubmitButton();
    }

    @When("the username {string} was registered with password {string}, name {string}, email {string}")
    public void enter_signup_values(String username, String password, String name, String email) throws InterruptedException {
        signUpPage.fillUsernameInput(username);
        signUpPage.fillPasswordInput(password);
        signUpPage.fillNameInput(name);
        signUpPage.fillEmailInput(email);
    }

    @When("the username \"([\"]*)\" was registered with the password \"([\"]*)\", the name \"([\"]*)\", the email \"([\"]*)\"")
    public void enter_signup_various_values(String username, String password, String name, String email) throws InterruptedException {
        signUpPage.fillUsernameInput(username);
        signUpPage.fillPasswordInput(password);
        signUpPage.fillNameInput(name);
        signUpPage.fillEmailInput(email);
    }

    @When("the user selects {string}, {string} and {string} date of birth value")
    public void enter_signup_date_values(String day, String month, String year) throws InterruptedException {
        signUpPage.selectDay(day);
        signUpPage.selectMonth(month);
        signUpPage.selectYear(year);
    }

    @When("the user selects {string} month and {string} year date of birth value")
    public void enter_signup_month_and_year_values(String month, String year) throws InterruptedException {
        signUpPage.selectMonth(month);
        signUpPage.selectYear(year);
    }

    @When("the user selects {string} day and {string} year date of birth value")
    public void enter_signup_day_and_year_values(String day, String year) throws InterruptedException {
        signUpPage.selectDay(day);
        signUpPage.selectYear(year);
    }

    @When("the user selects {string} day and {string} month date of birth value")
    public void enter_signup_day_and_month_values(String day, String month) throws InterruptedException {
        signUpPage.selectDay(day);
        signUpPage.selectMonth(month);
    }

    @When("the user selects \"([\"]*)\", \"([\"]*)\" and \"([\"]*)\" date of birth value")
    public void enter_signup_various_date_values(String day, String month, String year) throws InterruptedException {
        signUpPage.selectDay(day);
        signUpPage.selectMonth(month);
        signUpPage.selectYear(year);
    }

    @When("the user attempts to sign up")
    public void attempt_to_login() throws InterruptedException {
        signUpPage.clickSubmitButton();
    }

    @Then("he should not see a super power message")
    public void not_see_super_power_message() throws InterruptedException {
        Boolean superPowerMessageIsDisplayed = profilePage.verifySuperPowerMessageIsDisplayed();
        Assert.assertFalse(superPowerMessageIsDisplayed);
    }
}
