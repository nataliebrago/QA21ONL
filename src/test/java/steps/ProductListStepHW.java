package steps;

import baseEntities.BaseStepHW;
import pages.CartPageHW;
import pages.ProductListPageHW;

public class ProductListStepHW extends BaseStepHW {

    public ProductListStepHW() {
        super();
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