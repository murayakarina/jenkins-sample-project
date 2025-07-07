package stepdefs;

import general.MainCall;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class dashboardTests {

    @And("user enters their first name")
    public void userEntersTheirFirstName() {
        MainCall.dashboardPage.enterFirstName();
    }

    @And("user selects a favourite team")
    public void userSelectsAFavouriteTeam() throws InterruptedException {
        MainCall.dashboardPage.selectFavouriteTeam();
    }

    @And("user clicks on submit")
    public void userClicksOnSubmit() {
        MainCall.dashboardPage.clickOnSubmit();
    }
    @Then("user sees a certified message")
    public void userSeesACertifiedMessage() {
        MainCall.dashboardPage.verifyFanMessage();
    }

    @And("I click on the dark mode toggle")
    public void iClickOnTheDarkModeToggle() throws InterruptedException {
        MainCall.dashboardPage.toggleDarkMOde();
    }
}
