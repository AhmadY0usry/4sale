package Pages;

import Page_Utils.Page_Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Home_Page extends Page_Utils {

    private final WebDriver driver;

    private final By sortList = By.className("product_sort_container");
    private final By productList = By.cssSelector(".btn.btn_primary.btn_small.btn_inventory");
    private final By cartBtn = By.className("shopping_cart_link");

    public Home_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void selectSort(String Value) {
        selectFromList(sortList, Value);
    }

    public void addProductCart(int chooseProduct) {
        List<WebElement> elements = driver.findElements(productList);
        elements.get(chooseProduct).click();
    }

    public WebDriver clickOnCartBtn() {
        click(cartBtn);
        return driver;
    }

}
