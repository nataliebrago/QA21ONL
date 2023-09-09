package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutProcessStepTwoPageHW extends BasePageHW {
    @FindBy(id = "finish")
    public static WebElement finishButtonLocator;

    public CheckoutProcessStepTwoPageHW(WebDriver driver) {
        super(driver);
    }

}