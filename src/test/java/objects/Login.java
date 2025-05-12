package objects;

import com.mysql.cj.exceptions.AssertionFailedException;
import general.CommonAssertions;
import general.MainCall;
import org.openqa.selenium.By;

public class Login {

    public Login() {}

    public static By login_btn = By.xpath("//button[@type='submit']");
    public static By login_UserName = By.xpath("//input[@name='username']");
    public static By login_password = By.xpath("//input[@name='password']");
    public static By loginVerification = By.xpath("//div[@class='welcome-container']");
    public static By errorMsg = By.xpath("//p[@class='error-message']");


    public static void arriveToLogin()
    {
        try {
            MainCall.webDriverFactory.getInstance();
        } catch (Exception exception) {
            throw new AssertionFailedException(exception.getMessage());
        }
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