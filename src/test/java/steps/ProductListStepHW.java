package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CartPageHW;
import pages.ProductListPageHW;

public class ProductListStepHW extends BaseStepHW {

    public ProductListStepHW(WebDriver driver) {
        super(driver);
    }

    public ProductListPageHW addToCartHW() {
        mProductListPageHW.addToCartRedShirtButton.click();
        return mProductListPageHW;
    }

    public CartPageHW navigateToCartHW() {
        mProductListPageHW.openCartButton.click();
        return mCartPageHW;
    }
}