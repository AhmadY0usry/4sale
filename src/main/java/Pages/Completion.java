package Pages;

import Page_Utils.Page_Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Completion extends Page_Utils {

    private final By orderStatus = By.className("complete-header");

    public Completion(WebDriver driver) {
        super(driver);
    }

    public String getOrderStatus() {
        return getText(orderStatus);
    }
}
