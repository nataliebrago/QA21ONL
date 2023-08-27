package baseEntities;

import helper.DataHelper;
import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import services.WaitService;

@Data
public abstract class BasePageHW {

    protected WebDriver driver;
    protected WaitService waitService;
    protected static Logger logger = LogManager.getLogger(BasePageHW.class);

    public BasePageHW(WebDriver driver) {
        this.driver = driver;
        this.waitService = new WaitService(driver);

        PageFactory.initElements(driver, this);
    }
    protected abstract By getPageIdentifier();

    public boolean isPageOpened() {
        return driver.findElement(getPageIdentifier()).isDisplayed();
    }
}