package baseEntities;

import pages.*;


public class BaseStepHW {

    protected LoginPageHW mLoginPageHW;
    protected ProductListPageHW mProductListPageHW;
    protected CartPageHW mCartPageHW;
    protected CheckoutProcessStepOnePageHW mCheckoutProcessStepOnePageHW;
    protected CheckoutProcessStepTwoPageHW mCheckoutProcessStepTwoPageHW;
    protected CheckoutProcessStepFinishPageHW mCheckoutProcessStepFinishPageHW;

    public BaseStepHW() {
        mLoginPageHW = new LoginPageHW();
        mProductListPageHW = new ProductListPageHW();
        mCartPageHW = new CartPageHW();
        mCheckoutProcessStepOnePageHW = new CheckoutProcessStepOnePageHW();
        mCheckoutProcessStepTwoPageHW = new CheckoutProcessStepTwoPageHW();
        mCheckoutProcessStepFinishPageHW = new CheckoutProcessStepFinishPageHW();
    }
}