package steps;

import baseEntities.BaseTestHW;
import io.cucumber.java.en.Then;
import pages.CheckoutProcessStepFinishPageHW;

public class CheckoutProcessFinishTest extends BaseTestHW {
    private BaseTestHW baseTest;
    private CheckoutProcessStepFinishPageHW checkoutProcessStepFinishPageHW;

    public CheckoutProcessFinishTest(BaseTestHW baseTest) {
        this.baseTest = baseTest;
        checkoutProcessStepFinishPageHW = new CheckoutProcessStepFinishPageHW(driver);
    }

        @Then("user completes the checkout clicking on the Finish button")
        public void completeHeaderIsDisplayed() {
            CheckoutProcessStepFinishPageHW.completeHeader.isDisplayed();
        }
    }