package steps;

import baseEntities.BaseTestHW;
import io.cucumber.java.en.When;
import pages.CheckoutProcessStepOnePageHW;

public class CheckoutProcessStepOneTest extends BaseTestHW {

    private BaseTestHW baseTest;
    private CheckoutProcessStepOnePageHW checkoutProcessStepOnePageHW;

    public CheckoutProcessStepOneTest(BaseTestHW baseTest) {
        this.baseTest = baseTest;
        checkoutProcessStepOnePageHW = new CheckoutProcessStepOnePageHW(driver);
    }

    @When("user fills in first name {} last name {} and postal code {}")
    public void fillingInWithValidDataHW(String firstName, String lastName, String postalCode) {
        checkoutProcessStepOnePageHW.setInformationAboutPerson(firstName, lastName, postalCode);
    }

    @When("user clicks continue button")
    public void continueCheckout() {
        checkoutProcessStepOnePageHW.continueButton.click();
    }
}