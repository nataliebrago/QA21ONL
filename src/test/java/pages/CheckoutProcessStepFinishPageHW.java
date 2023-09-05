package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutProcessStepFinishPageHW extends BasePageHW {
    private final By headerTitleLocatorCheckoutProcessStepFinishPageHW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Checkout: Complete!')]");
    private final By completeHeaderLocator = By.xpath("//h2[contains(@class, 'complete-header') " +
            "and contains(text(), 'Thank you for your order!')]");

    public CheckoutProcessStepFinishPageHW() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocatorCheckoutProcessStepFinishPageHW;
    }

    public WebElement getCompleteHeader() {
        return $(completeHeaderLocator);
    }

}