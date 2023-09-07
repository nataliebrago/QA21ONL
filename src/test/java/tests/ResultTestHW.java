package tests;

import baseEntities.BaseTestHW;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class ResultTestHW extends BaseTestHW {
    @Test
    public void resultTestHW() {
        mLoginStepHW.loginHW(ReadProperties.username(), ReadProperties.password()).isPageOpened();
        mProductListStepHW.addToCartHW().isPageOpened();
        mProductListStepHW.navigateToCartHW().isPageOpened();
        mCartTestHW.navigateCheckoutHW().isPageOpened();
        mCheckoutProcessStepOneTest.fillingInWithValidDataHW().isPageOpened();
        mCheckoutProcessStepOneTest.continueCheckout().isPageOpened();
        mCheckoutProcessStepTwoTest.finishCheckoutProcess().isPageOpened();
        mCheckoutProcessFinishTest.completeHeaderIsDisplayed().isPageOpened();
    }
}
