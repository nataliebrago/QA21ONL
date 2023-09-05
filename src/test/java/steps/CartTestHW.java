package steps;

import baseEntities.BaseStepHW;
import pages.CheckoutProcessStepOnePageHW;

public class CartTestHW extends BaseStepHW {
    public CartTestHW() {
        super();
    }

    public CheckoutProcessStepOnePageHW navigateCheckoutHW() {
        mCartPageHW.getCheckoutButton().click();
        return mCheckoutProcessStepOnePageHW;
    }
}