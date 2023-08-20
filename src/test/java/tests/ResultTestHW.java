package tests;

import baseEntities.BaseTestHW;
import helper.DataHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutProcessStepFinishPageHW;
import pages.LoginPageHW;

public class ResultTestHW extends BaseTestHW {
    @Test
    public void resultAdminTestHW() {
        new LoginPageHW(mWebDriver)
                .loginAction(DataHelper.getUser())
                .addToCartAction()
                .openCartAction()
                .checkoutAction()
                .fillingInWithValidDataAction()
                .continueCheckout()
                .finishCheckoutProcess();

        Assert.assertTrue(new CheckoutProcessStepFinishPageHW(mWebDriver).isPageOpened());
    }
}
