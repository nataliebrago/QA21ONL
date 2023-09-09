package baseEntities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import services.WaitService;

public abstract class BasePageHW {

    protected WebDriver driver;
    protected WaitService waitService;

    public BasePageHW(WebDriver driver) {
        this.driver = driver;
        this.waitService = new WaitService(driver);
        PageFactory.initElements(driver, this);
    }
}