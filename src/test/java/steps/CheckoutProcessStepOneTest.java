package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutProcessStepOnePageHW;
import pages.CheckoutProcessStepTwoPageHW;

public class CheckoutProcessStepOneTest  extends BaseStepHW {
    public CheckoutProcessStepOneTest(WebDriver driver) {
        super(driver);
    }
    public CheckoutProcessStepOnePageHW fillingInWithValidDataHW() {
        mCheckoutProcessStepOnePageHW.setInformationAboutPerson();
        return mCheckoutProcessStepOnePageHW;
    }
    public CheckoutProcessStepTwoPageHW continueCheckout(){
        mCheckoutProcessStepOnePageHW.getContinueButton().click();
        return mCheckoutProcessStepTwoPageHW;
    }
}