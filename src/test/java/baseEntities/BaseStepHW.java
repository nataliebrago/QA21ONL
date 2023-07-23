package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;


public class BaseStepHW {
    protected WebDriver mWebDriver;
    protected LoginPageHW mLoginPageHW;
    protected ProductListPageHW mProductListPageHW;
    protected CartPageHW mCartPageHW;
    protected CheckoutProcessStepOnePageHW mCheckoutProcessStepOnePageHW;
    protected CheckoutProcessStepTwoPageHW mCheckoutProcessStepTwoPageHW;
    protected CheckoutProcessStepFinishPageHW mCheckoutProcessStepFinishPageHW;

    public BaseStepHW(WebDriver driver) {
        this.mWebDriver = driver;
        mLoginPageHW = new LoginPageHW(driver);
        mProductListPageHW = new ProductListPageHW(driver);
        mCartPageHW = new CartPageHW(driver);
        mCheckoutProcessStepOnePageHW = new CheckoutProcessStepOnePageHW(driver);
        mCheckoutProcessStepTwoPageHW = new CheckoutProcessStepTwoPageHW(driver);
        mCheckoutProcessStepFinishPageHW = new CheckoutProcessStepFinishPageHW(driver);
    }
}