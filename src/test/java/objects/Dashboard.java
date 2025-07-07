package objects;

import general.MainCall;
import org.openqa.selenium.By;

public class Dashboard {

   public Dashboard() {}

    public static By firstNameField = By.xpath("//input[@id='firstName']");
    public static By favTeam = By.xpath("//option[@value='Napoli']");
    public static By submitButton = By.xpath("//button[text()='Submit']");
    public static By badgeConfirmation = By.xpath("//div[@id='teamMessage']");
    public static By darkModeToggle = By.xpath("//span[@class='slider']");




    public  static void enterFirstName() {
        MainCall.seleniumFunctions.IhaveGivenInput(firstNameField, "Brian");
    }

    public static void selectFavouriteTeam () throws InterruptedException {
        MainCall.seleniumFunctions.scrollToElement(favTeam);
        Thread.sleep(3000);
        MainCall.seleniumFunctions.ClickingOn(favTeam);
    }
    public static void clickOnSubmit() {
        MainCall.seleniumFunctions.ClickingOn(submitButton);
    }

    public static void verifyFanMessage() {
        MainCall.seleniumFunctions.isExist(badgeConfirmation);
    }
    public static void toggleDarkMOde ()throws InterruptedException {
        MainCall.seleniumFunctions.ClickingOn(darkModeToggle);
        Thread.sleep(3000);

    }


}
