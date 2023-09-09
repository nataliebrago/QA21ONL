package steps;

import baseEntities.BaseTestHW;
import io.cucumber.java.en.When;
import pages.ProductListPageHW;

public class ProductListStepHW extends BaseTestHW {

    private BaseTestHW baseTest;
    private ProductListPageHW productListPageHW;

    public ProductListStepHW(BaseTestHW baseTest) {
        this.baseTest = baseTest;
        productListPageHW = new ProductListPageHW(driver);
    }

    @When("user adds one item to the cart")
    public void addToCartHW() {
        productListPageHW.addToCartRedShirtButton.click();
    }

    @When("user opens the cart")
    public void navigateToCartHW() {
        productListPageHW.openCartButton.click();
    }
}