package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import general.MainCall;


import static config.ConfigProperties.*;

public class loginSteps {
    @And("User arrives to Login Page")
    public void userArrivesToLoginPage() {
        MainCall.loginPage.arriveToLogin();
    }

    @Given("^I login into Application$")
    public void login() {
        MainCall.loginPage.arriveToLogin();
        MainCall.loginPage.clickLogin();
        MainCall.loginPage.enterUserName(username);
        MainCall.loginPage.enterPassword(password);
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        MainCall.loginPage.clickLogin();
    }
    @Given("^I am Testing Case : \"([^\"]*)\"$")
    public void iAmTestingCase(String id) throws Throwable {
        MainCall.caseID = id;
    }

    @And("I enter a valid username")
    public void iHaveEnterValidUsernameEmail() {
        MainCall.loginPage.enterUserName(username);
    }


    @And("I enter a valid password")
    public void iEnterAValidPassword() {
        MainCall.loginPage.enterPassword(password);
    }


    @Then("I verify login")
    public void iVerifyLogin() throws InterruptedException {
        MainCall.loginPage.verifyLogin();
        Thread.sleep(2000);
    }

    @And("I enter an invalid password")
    public void iHaveEnterInvalidPassword() {
        MainCall.loginPage.enterPassword("test");

    }

    @Then("I verify the Error message")
    public void iVerifyTheErrorMessage() {
        MainCall.loginPage.verifyErrorMsg();
    }


    @And("user enters their first name")
    public void userEntersTheirFirstName() {
        MainCall.loginPage.enterFirstName();
    }

    @And("user selects a favourite team")
    public void userSelectsAFavouriteTeam() throws InterruptedException {
        MainCall.loginPage.selectFavouriteTeam();
    }

    @And("user clicks on submit")
    public void userClicksOnSubmit() {
        MainCall.loginPage.clickOnSubmit();
    }

    @Then("user sees a certified message")
    public void userSeesACertifiedMessage() {
        MainCall.loginPage.verifyFanMessage();
    }

    @And("user clicks on the logout button")
    public void userClicksOnTheLogoutButton() {
        MainCall.loginPage.clickOnLogoutBtn();
    }

    @Then("user is logged out")
    public void userIsLoggedOut() {
        MainCall.loginPage.verifyUserIsLoggedOut();
    }
}