package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.*;
import utils.configuration.ReadProperties;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTestHW {
    protected LoginStepHW mLoginStepHW;
    protected ProductListStepHW mProductListStepHW;
    protected CartTestHW mCartTestHW;
    protected CheckoutProcessStepOneTest mCheckoutProcessStepOneTest;
    protected CheckoutProcessStepTwoTest mCheckoutProcessStepTwoTest;
    protected CheckoutProcessFinishTest mCheckoutProcessFinishTest;

    static Logger logger = Logger.getLogger(BaseTestHW.class);

    @BeforeMethod
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        org.apache.log4j.BasicConfigurator.configure();

        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.timeout = 8000;
        //Configuration.browser = Browsers.CHROME;
        Configuration.browserSize = "1920x1080";
        Configuration.fastSetValue = true;
        Configuration.headless = false;
        //Configuration.assertionMode = SOFT;

        mLoginStepHW = new LoginStepHW();
        mProductListStepHW = new ProductListStepHW();
        mCartTestHW = new CartTestHW();
        mCheckoutProcessStepOneTest = new CheckoutProcessStepOneTest();
        mCheckoutProcessStepTwoTest = new CheckoutProcessStepTwoTest();
        mCheckoutProcessFinishTest = new CheckoutProcessFinishTest();

        open("/");

        logger.info("Browser is started");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
