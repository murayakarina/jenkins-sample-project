package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
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

    @Then("I verify the default project")
    public void iVerifyTheDefaultProject() throws InterruptedException {
        MainCall.loginPage.verifyDefaultProject(username1+"'s Project");
        Thread.sleep(1000);
    }

    @When("I search the default Project")
    public void iSearchTheDefaultProject() {
        MainCall.loginPage.searchProject(username1);
    }
}