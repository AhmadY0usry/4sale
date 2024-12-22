package Pages;

import Page_Utils.PageElementHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Home_Page extends PageElementHandler {

    private final WebDriver driver;

    private final By sortList = By.className("product_sort_container");
    private final By productList = By.cssSelector(".btn.btn_primary.btn_small.btn_inventory");
    private final By cartBtn = By.className("shopping_cart_link");

    public Home_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }



    public void addProductToCart(int productIndex) {
        WebElement product = getProductByIndex(productIndex);
        if (product != null) {
            product.click();
        } else {
            throw new IllegalArgumentException("Invalid product index: " + productIndex);
        }
    }

    private WebElement getProductByIndex(int index) {
        List<WebElement> products = driver.findElements(this.productList);
        if (index >= 0 && index < products.size()) {
            return products.get(index);
        }
        return null;
    }

    public Cart_Page clickOnCartBtn() {
        click(this.cartBtn);
        return new Cart_Page(driver);
    }

    public void selectLowestPriceItem() {
        selectFromListByValue(sortList, "lohi");
        addProductToCart(0);
    }

}
