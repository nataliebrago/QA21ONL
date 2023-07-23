package tests;

import baseEntities.BaseTestHW;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class ResultTestHW extends BaseTestHW {
    @Test
    public void resultTestHW() {
        Assert.assertTrue(mLoginStepHW.loginHW(ReadProperties.username(), ReadProperties.password()).isPageOpened());
        Assert.assertTrue(mProductListStepHW.addToCartHW().isPageOpened());
        Assert.assertTrue(mProductListStepHW.navigateToCartHW().isPageOpened());
        Assert.assertTrue(mCartTestHW.navigateCheckoutHW().isPageOpened());
        Assert.assertTrue(mCheckoutProcessStepOneTest.fillingInWithValidDataHW().isPageOpened());
        Assert.assertTrue(mCheckoutProcessStepOneTest.continueCheckout().isPageOpened());
        Assert.assertTrue(mCheckoutProcessStepTwoTest.finishCheckoutProcess().isPageOpened());
        Assert.assertTrue(mCheckoutProcessFinishTest.completeHeaderIsDisplayed().isPageOpened());
    }
}
