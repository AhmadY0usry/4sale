package Pages;

import Page_Utils.Page_Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout_Page extends Page_Utils {

    private final WebDriver driver;
    private final By firstName = By.id("first-name");
    private final By lastName = By.id("last-name");
    private final By zipCode = By.id("postal-code");
    private final By Continue = By.id("continue");
    private final By finish = By.id("finish");

    public Checkout_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterBuyerInformation(String Name, String Last, String zipCode) {
        clearAndSendText(firstName, Name);
        clearAndSendText(lastName, Last);
        clearAndSendText(this.zipCode, zipCode);
    }

    public void clkOnContinueBtn() {
        click(Continue);
    }

    public WebDriver clickOnFinishBtn() {
        click(finish);
        return driver;
    }
}
