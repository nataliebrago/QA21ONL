package baseEntities;

import factory.BrowserFactory;
import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.configuration.ReadProperties;

@Data
public class BaseTestHW {
    protected WebDriver mWebDriver;
    protected static Logger logger = LogManager.getLogger(BaseTestHW.class);


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

