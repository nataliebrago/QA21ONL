package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static com.codeborne.selenide.Selenide.$;

public class ProductListPageHW extends BasePageHW {
    private final By headerTitleLocatorInventoryPageHW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Products')]");
    private final By addToCartRedShirtButtonLocator = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    private final By openCartButtonLocator = By.id("shopping_cart_container");

    public ProductListPageHW() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocatorInventoryPageHW;
    }

    public WebElement getAddToCartButton() {
        return $(addToCartRedShirtButtonLocator);
    }

    public WebElement getOpenCartButton() {
        return $(openCartButtonLocator);
    }
}