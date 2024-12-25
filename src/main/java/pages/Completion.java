package pages;

import Page_Utils.PageElementHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Completion extends PageElementHandler {

    private final By orderStatus = By.className("complete-header");

    public Completion(WebDriver driver) {
        super(driver);
    }

    public String getOrderStatus() {
        return getText(this.orderStatus);
    }
}
