package steps;

import baseEntities.BaseStepHW;
import pages.CheckoutProcessStepFinishPageHW;

public class CheckoutProcessStepTwoTest extends BaseStepHW {
    public CheckoutProcessStepTwoTest() {
        super();
    }

    public CheckoutProcessStepFinishPageHW finishCheckoutProcess() {
        mCheckoutProcessStepTwoPageHW.getFinishButton().click();
        return mCheckoutProcessStepFinishPageHW;
    }
}