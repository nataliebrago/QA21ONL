package tests;

import baseEntities.BaseTestHW;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutProcessStepFinishPageHW;
import pages.LoginPageHW;
import utils.configuration.ReadProperties;

public class ResultTestHW extends BaseTestHW {
    @Test
    public void resultTestHW() {
        new LoginPageHW(mWebDriver)
                .loginAction(ReadProperties.username(), ReadProperties.password())
                .addToCartAction()
                .openCartAction()
                .checkoutAction()
                .fillingInWithValidDataAction()
                .continueCheckout()
                .finishCheckoutProcess();

        Assert.assertTrue(new CheckoutProcessStepFinishPageHW(mWebDriver).isPageOpened());
    }
}
