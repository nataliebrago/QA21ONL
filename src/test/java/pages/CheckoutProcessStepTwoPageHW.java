package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutProcessStepTwoPageHW extends BasePageHW {

    @FindBy(id = "finish")
    public WebElement finishButtonLocator;

    public CheckoutProcessStepTwoPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return  By.xpath("//span[contains(@class, 'title') and contains(text(), 'Checkout: Overview')]");
    }
}