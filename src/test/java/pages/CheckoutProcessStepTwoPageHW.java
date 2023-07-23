package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutProcessStepTwoPageHW  extends BasePageHW {
    private final By headerTitleLocatorCheckoutTwoPageHW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Checkout: Overview')]");
    private final By finishButtonLocator = By.id("finish");
    public CheckoutProcessStepTwoPageHW(WebDriver driver) {
        super(driver);
    }
    @Override
    protected By getPageIdentifier() {
        return headerTitleLocatorCheckoutTwoPageHW;
    }
    public WebElement getFinishButton() {
        return driver.findElement(finishButtonLocator);
    }
}