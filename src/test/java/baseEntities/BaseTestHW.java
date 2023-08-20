package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.configuration.ReadProperties;

public class BaseTestHW {
    protected WebDriver mWebDriver;


    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        mWebDriver = browserFactory.getDriver();
        mWebDriver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() {
      //  mWebDriver.quit();
    }
}

