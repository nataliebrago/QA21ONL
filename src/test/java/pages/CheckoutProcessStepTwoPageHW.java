package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutProcessStepTwoPageHW extends BasePageHW {
    private final By headerTitleLocatorCheckoutTwoPageHW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Checkout: Overview')]");
    private final By finishButtonLocator = By.id("finish");

    public CheckoutProcessStepTwoPageHW() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocatorCheckoutTwoPageHW;
    }

    public WebElement getFinishButton() {
        return $(finishButtonLocator);
    }
}