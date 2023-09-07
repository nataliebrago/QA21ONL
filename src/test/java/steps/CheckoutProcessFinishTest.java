package steps;

import baseEntities.BaseStepHW;
import pages.CheckoutProcessStepFinishPageHW;

public class CheckoutProcessFinishTest extends BaseStepHW {
    public CheckoutProcessFinishTest() {
        super();
    }

    public CheckoutProcessStepFinishPageHW completeHeaderIsDisplayed() {
        mCheckoutProcessStepFinishPageHW.getCompleteHeader().isDisplayed();
        return mCheckoutProcessStepFinishPageHW;
    }
}