package AutomateScenario;

import Pages.Cart_Page;
import Pages.Checkout_Page;
import Pages.Completion;
import Pages.Home_Page;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class checkoutScenario extends Base {
    private final SoftAssert softAssert = new SoftAssert();
    private Home_Page homePage;
    private  Cart_Page cartPage;
    private Checkout_Page checkoutPage;
    private Completion completion;

    @Test
    public void Checkout_Scenario() {
        // 1-Login with credentials provided by website
        loginPage.Enter_email_and_password("standard_user", "secret_sauce");
        homePage = new Home_Page(loginPage.clickOnLoginBtn());
        // 2-Select the lowest price item and add it to cart
        homePage.selectSort("lohi");
        homePage.addProductCart(0);
        // 3-Proceed to check out
        cartPage = new Cart_Page(homePage.clickOnCartBtn());
        checkoutPage = new Checkout_Page(cartPage.clickOnCheckoutTBtn());
        // 4-Add required data in your information screen
        checkoutPage.enterBuyerInformation("FirstName1", "LastName2", "123548"); // Can Java faker class and data Provider to provide to generate fake data
        checkoutPage.clkOnContinueBtn();
        // 5-Complete checkout process
        completion = new Completion(checkoutPage.clickOnFinishBtn());
        // 6-Assert on completion of order
        String orderStatus = completion.getOrderStatus();
        softAssert.assertEquals(orderStatus, "Thank you for your order!"); // Compare the expected with actual result
        softAssert.assertAll();
    }
}