package steps;

import baseEntities.BaseTestHW;
import io.cucumber.java.en.Then;
import pages.CheckoutProcessStepTwoPageHW;

public class CheckoutProcessStepTwoTest extends BaseTestHW {
    private BaseTestHW baseTest;
    private CheckoutProcessStepTwoPageHW checkoutProcessStepTwoPageHW;

    public CheckoutProcessStepTwoTest (BaseTestHW baseTest) {
        this.baseTest = baseTest;
        checkoutProcessStepTwoPageHW = new CheckoutProcessStepTwoPageHW(driver);
    }

    @Then("user clicks the finish button")
    public void finishCheckoutProcess() {
        checkoutProcessStepTwoPageHW.finishButtonLocator.click();
    }
}