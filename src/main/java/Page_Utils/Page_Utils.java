package Page_Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Page_Utils {
    private final WebDriver driver;

    public Page_Utils(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By byElement) {
        driver.findElement(byElement).click();
    }

    public void clearAndSendText(By byElement, String text) {
        driver.findElement(byElement).clear();
        driver.findElement(byElement).sendKeys(text);
    }

    public String getText(By byElement) {
        return driver.findElement(byElement).getText();
    }

    public void selectFromList(By byElement, String value) {
        Select select = new Select(driver.findElement(byElement));
        select.selectByValue(value);
    }


}