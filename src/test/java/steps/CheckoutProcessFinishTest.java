package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutProcessStepFinishPageHW;

public class CheckoutProcessFinishTest extends BaseStepHW {
    public CheckoutProcessFinishTest(WebDriver driver) {
        super(driver);
    }

    public CheckoutProcessStepFinishPageHW completeHeaderIsDisplayed() {
        mCheckoutProcessStepFinishPageHW.completeHeader.isDisplayed();
        return mCheckoutProcessStepFinishPageHW;
    }
}