package objects;

import com.mysql.cj.exceptions.AssertionFailedException;
import general.MainCall;
import org.openqa.selenium.By;

public class Login {

    public Login() {}

    public static By login_btn = By.xpath("//button[@type='submit']");
    public static By login_UserName = By.xpath("//input[@name='username']");
    public static By login_password = By.xpath("//input[@name='password']");
    public static By loginVerification = By.xpath("//div[@class='welcome-container']");
    public static By errorMsg = By.xpath("//p[@class='error-message']");
    public static By firstNameField = By.xpath("//input[@id='firstName']");
    public static By favTeam = By.xpath("//option[@value='Napoli']");
    public static By submitButton = By.xpath("//button[text()='Submit']");
    public static By badgeConfirmation = By.xpath("//span[@id='teamMessage']");
    public static By logoutButton = By.xpath("//form[@action='/logout']/button");
    public static By loginPage = By.xpath("//div[@class='login-container']");





    public static void arriveToLogin()
    {
        try {
            MainCall.webDriverFactory.getInstance();
        } catch (Exception exception) {
            throw new AssertionFailedException(exception.getMessage());
        }
    }
    public static void verifyUserIsLoggedOut () {
        MainCall.seleniumFunctions.isExist(loginPage);
    }
    public static void clickOnLogoutBtn () {
        MainCall.seleniumFunctions.ClickingOn(logoutButton);
    }
    public static void verifyFanMessage() {
        MainCall.seleniumFunctions.isExist(badgeConfirmation);
    }
    public static void clickOnSubmit() {
        MainCall.seleniumFunctions.ClickingOn(submitButton);
    }
    public static void selectFavouriteTeam () throws InterruptedException {
        MainCall.seleniumFunctions.scrollToElement(favTeam);
        Thread.sleep(3000);
        MainCall.seleniumFunctions.ClickingOn(favTeam);
    }
    public  static void enterFirstName() {
        MainCall.seleniumFunctions.IhaveGivenInput(firstNameField, "Brian");
    }
    public static void enterUserName(String userName)
    {
        MainCall.seleniumFunctions.IhaveGivenInput(login_UserName, userName);

    }
    public static void enterPassword(String password) {
        MainCall.seleniumFunctions.IhaveGivenInput(login_password, password);
    }

    public static void clickLogin() {
        MainCall.seleniumFunctions.PressButton(login_btn);
    }

    public static void verifyLogin() {
        MainCall.seleniumFunctions.isExist(loginVerification);
    }
    public static void verifyErrorMsg() {
        MainCall.seleniumFunctions.isExist(errorMsg);
    }

}