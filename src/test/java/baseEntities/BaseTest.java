package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.WaitService;
import steps.LoginStep;


public class BaseTest {
    protected WebDriver mWebDriver;
    protected LoginStep mLoginStep;
    protected WaitService mWaitService;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        mWebDriver = browserFactory.getDriver();
        mWaitService = new WaitService(mWebDriver);
        mLoginStep = new LoginStep(mWebDriver);
    }

    @AfterMethod
    public void tearDown() {
        mWebDriver.quit();
    }
}

