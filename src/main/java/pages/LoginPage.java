package pages;

import Page_Utils.PageElementHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageElementHandler {
    private final WebDriver driver;
    private final By emailField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By login = By.id("login-button");
    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterCredentials(String email, String password) {
        clearAndSendText(this.emailField, email);
        clearAndSendText(this.passwordField, password);
    }

    public HomePage clickOnLoginBtn() {
        click(login);
        return new HomePage(driver);
    }
}
