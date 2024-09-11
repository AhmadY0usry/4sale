package AutomateScenario;

import Pages.Cart_Page;
import Pages.Checkout_Page;
import Pages.Completion;
import Pages.Home_Page;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class checkoutScenario extends Base {
    SoftAssert softAssert = new SoftAssert();
    Home_Page homePage;
    Cart_Page cartPage;
    Checkout_Page checkoutPage;
    Completion completion;

    @Test
    public void Login_With_Valid_Data() {
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
        checkoutPage.enterBuyerInformation("FirstName1", "LastName2", "123548");
        checkoutPage.clkOnContinueBtn();
        // 5-Complete checkout process
        completion = new Completion(checkoutPage.clickOnFinishBtn());
        // 6-Assert on completion of order
        String orderStatus = completion.getOrderStatus();
        softAssert.assertEquals(orderStatus, "Thank you for your order!");
        softAssert.assertAll();
    }
}