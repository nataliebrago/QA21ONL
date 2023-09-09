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

        @Then("the message is displayed after checkout \"Thank you for your order!\"")
        public void completeHeaderIsDisplayed() {
            CheckoutProcessStepFinishPageHW.completeHeader.isDisplayed();
        }
    }