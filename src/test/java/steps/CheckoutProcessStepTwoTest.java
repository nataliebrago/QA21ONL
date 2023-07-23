package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutProcessStepFinishPageHW;

public class CheckoutProcessStepTwoTest extends BaseStepHW {
    public CheckoutProcessStepTwoTest(WebDriver driver) {
        super(driver);
    }
    public CheckoutProcessStepFinishPageHW finishCheckoutProcess() {
        mCheckoutProcessStepTwoPageHW.getFinishButton().click();
        return mCheckoutProcessStepFinishPageHW;
    }
}