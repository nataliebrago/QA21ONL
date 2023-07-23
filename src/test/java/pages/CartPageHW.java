package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPageHW extends BasePageHW {
    private final By checkoutButtonLocator = By.id("checkout");
    private final By headerTitleLocatorCartPageHW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Your Cart')]");

    public CartPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocatorCartPageHW;
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(checkoutButtonLocator);
    }
}