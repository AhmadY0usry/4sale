package Page_Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_Utils {
    WebDriver driver;
    public WebDriverWait wait;
    public Page_Utils(WebDriver driver) {
        this.driver=driver;
    }

    public void click(By byElement)
    {
        driver.findElement(byElement).click();
    }
    public void clearAndSendText(By byElement, String text)
    {
        driver.findElement(byElement).clear();
        driver.findElement(byElement).sendKeys(text);
    }
    public String getText(By byElement)
    {
        return driver.findElement(byElement).getText();
    }
    Select select;
    public void selectFromList(By byElement,String value)
    {
        select = new Select(driver.findElement(byElement));
        select.selectByValue(value);
    }



}