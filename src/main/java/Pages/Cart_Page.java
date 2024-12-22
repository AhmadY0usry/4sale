package Pages;

import Page_Utils.PageElementHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart_Page extends PageElementHandler {
    private final WebDriver driver;
    private final By checkoutBtn = By.cssSelector(".btn.btn_action.btn_medium.checkout_button");

    public Cart_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public Checkout_Page clickOnCheckoutTBtn() {
        click(this.checkoutBtn);
        return new Checkout_Page(driver);
    }

}
