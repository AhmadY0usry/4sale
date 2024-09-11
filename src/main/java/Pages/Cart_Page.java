package Pages;

import Page_Utils.Page_Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart_Page extends Page_Utils {
    private final WebDriver driver;
    private final By checkoutBtn = By.cssSelector(".btn.btn_action.btn_medium.checkout_button");

    public Cart_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public WebDriver clickOnCheckoutTBtn() {
        click(checkoutBtn);
        return driver;
    }

}
