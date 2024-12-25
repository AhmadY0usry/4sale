package pages;

import Page_Utils.PageElementHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends PageElementHandler {
    private final WebDriver driver;
    private final By checkoutBtn = By.cssSelector(".btn.btn_action.btn_medium.checkout_button");

    public CartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public CheckoutPage clickOnCheckoutTBtn() {
        click(this.checkoutBtn);
        return new CheckoutPage(driver);
    }

}
