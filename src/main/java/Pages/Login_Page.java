package Pages;

import Page_Utils.Page_Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page extends Page_Utils {
    private final WebDriver driver;
    private final By Email_Field = By.id("user-name");
    private final By Password_Field = By.id("password");
    private final By Login = By.id("login-button");
    public Login_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void Enter_email_and_password(String Email, String Password) {
        clearAndSendText(Email_Field, Email);
        clearAndSendText(Password_Field, Password);
    }

    public WebDriver clickOnLoginBtn() {
        click(Login);
        return driver;
    }
}
