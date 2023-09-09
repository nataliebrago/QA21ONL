package steps;

import baseEntities.BaseTestHW;
import io.cucumber.java.en.When;
import pages.CartPageHW;

public class CartTestHW extends BaseTestHW {

    private BaseTestHW baseTest;
    private CartPageHW cartPagehw;

    public CartTestHW(BaseTestHW baseTest) {
        this.baseTest = baseTest;
        cartPagehw = new CartPageHW(driver);
    }

    @When("user clicks checkout button")
    public void navigateCheckoutHW() {
        CartPageHW.checkoutButtonLocator.click();
    }
}