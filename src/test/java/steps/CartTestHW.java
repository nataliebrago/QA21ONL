package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutProcessStepOnePageHW;

public class CartTestHW extends BaseStepHW {
    public CartTestHW(WebDriver driver) {
        super(driver);
    }

    public CheckoutProcessStepOnePageHW navigateCheckoutHW() {
        mCartPageHW.checkoutButtonLocator.click();
        return mCheckoutProcessStepOnePageHW;
    }
}