package pages;

import baseEntities.BasePageHW;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPageHW extends BasePageHW {
    private final By checkoutButtonLocator = By.id("checkout");
    private final By headerTitleLocatorCartPageHW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Your Cart')]");

    public CartPageHW() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocatorCartPageHW;
    }

    public SelenideElement getCheckoutButton() {
        return $(checkoutButtonLocator);
    }
}