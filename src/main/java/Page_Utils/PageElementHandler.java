package Page_Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PageElementHandler {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public PageElementHandler(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void click(By byElement) {
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(byElement));
        element.click();
    }
    public void clearAndSendText(By byElement, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(byElement)); // Waiting for visibility.
        element.clear();
        element.sendKeys(text);
    }

    public String getText(By byElement) {
        return driver.findElement(byElement).getText();
    }

    public void selectFromListByValue(By byElement, String value)
    {
        Select select = new Select(driver.findElement(byElement));
        select.selectByValue(value);
    }


}