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
        mProductListPageHW.getAddToCartButton().click();
        return mProductListPageHW;
    }

    public CartPageHW navigateToCartHW() {
        mProductListPageHW.getOpenCartButton().click();
        return mCartPageHW;
    }
}