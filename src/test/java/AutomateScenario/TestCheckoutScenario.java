package AutomateScenario;

import pages.CartPage;
import pages.CheckoutPage;
import pages.Completion;
import pages.HomePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestCheckoutScenario extends Base {
    private final SoftAssert softAssert = new SoftAssert();
    private HomePage homePage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private Completion completion;
    private static final Logger logger = LoggerFactory.getLogger(TestCheckoutScenario.class);

    @Test
    public void Checkout_Scenario() {
        logger.info("Test case: Checkout_Scenario started");
        // 1-Login with credentials provided by website
        loginPage.enterCredentials("standard_user", "secret_sauce");
        logger.info("Credentials entered successfully");
        homePage = loginPage.clickOnLoginBtn();
        // 2-Select the lowest price item and add it to cart
        homePage.selectLowestPriceItem();
        // 3-Proceed to check out
        cartPage = homePage.clickOnCartBtn();
        checkoutPage = cartPage.clickOnCheckoutTBtn();
        // 4-Add required data in your information screen
        checkoutPage.enterBuyerInformation("FirstName1", "LastName2", "123548"); // Can Java faker class and data Provider to provide to generate fake data
        checkoutPage.clkOnContinueBtn();
        // 5-Complete checkout process
        completion = checkoutPage.clickOnFinishBtn();
        // 6-Assert on completion of order
        String orderStatus = completion.getOrderStatus();
        softAssert.assertEquals(orderStatus, "Thank you for your order!"); // Compare the expected with actual result
        softAssert.assertAll();
    }
}