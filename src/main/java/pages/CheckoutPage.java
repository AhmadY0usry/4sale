package pages;

import Page_Utils.PageElementHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckoutPage extends PageElementHandler {

    private final WebDriver driver;
    private final By firstName = By.id("first-name");
    private final By lastName = By.id("last-name");
    private final By zipCode = By.id("postal-code");
    private final By continueButton = By.id("continue");
    private final By finish = By.id("finish");

    public CheckoutPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterBuyerInformation(String name, String last, String zipCode) {
        clearAndSendText(this.firstName, name);
        clearAndSendText(this.lastName, last);
        clearAndSendText(this.zipCode, zipCode);
    }

    public void clkOnContinueBtn() {
        click(this.continueButton);
    }

    public Completion clickOnFinishBtn() {
        click(this.finish);
        return new Completion(driver);
    }
}
