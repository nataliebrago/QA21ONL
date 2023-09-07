package steps;

import baseEntities.BaseStepHW;
import pages.CheckoutProcessStepOnePageHW;
import pages.CheckoutProcessStepTwoPageHW;

public class CheckoutProcessStepOneTest extends BaseStepHW {
    public CheckoutProcessStepOneTest() {
        super();
    }

    public CheckoutProcessStepOnePageHW fillingInWithValidDataHW() {
        mCheckoutProcessStepOnePageHW.setInformationAboutPerson();
        return mCheckoutProcessStepOnePageHW;
    }

    public CheckoutProcessStepTwoPageHW continueCheckout() {
        mCheckoutProcessStepOnePageHW.getContinueButton().click();
        return mCheckoutProcessStepTwoPageHW;
    }
}