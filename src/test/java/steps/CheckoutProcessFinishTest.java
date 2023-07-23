package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutProcessStepFinishPageHW;

public class CheckoutProcessFinishTest extends BaseStepHW {
    public CheckoutProcessFinishTest(WebDriver driver) {
        super(driver);
    }

    public CheckoutProcessStepFinishPageHW completeHeaderIsDisplayed() {
        mCheckoutProcessStepFinishPageHW.getCompleteHeader().isDisplayed();
        return mCheckoutProcessStepFinishPageHW;
    }
}