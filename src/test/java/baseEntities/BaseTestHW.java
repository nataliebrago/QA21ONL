package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.*;
import utils.configuration.ReadProperties;

public class BaseTestHW {
    protected WebDriver mWebDriver;
    protected LoginStepHW mLoginStepHW;
    protected ProductListStepHW mProductListStepHW;
    protected CartTestHW mCartTestHW;
    protected CheckoutProcessStepOneTest mCheckoutProcessStepOneTest;
    protected CheckoutProcessStepTwoTest mCheckoutProcessStepTwoTest;
    protected CheckoutProcessFinishTest mCheckoutProcessFinishTest;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        mWebDriver = browserFactory.getDriver();
        mLoginStepHW = new LoginStepHW(mWebDriver);
        mProductListStepHW = new ProductListStepHW(mWebDriver);
        mCartTestHW = new CartTestHW(mWebDriver);
        mCheckoutProcessStepOneTest = new CheckoutProcessStepOneTest(mWebDriver);
        mCheckoutProcessStepTwoTest = new CheckoutProcessStepTwoTest(mWebDriver);
        mCheckoutProcessFinishTest = new CheckoutProcessFinishTest(mWebDriver);
        mWebDriver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        mWebDriver.quit();
    }
}

