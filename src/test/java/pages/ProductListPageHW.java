package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListPageHW extends BasePageHW {

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    public WebElement addToCartRedShirtButton;

    @FindBy(id = "shopping_cart_container")
    public WebElement openCartButton;

    public ProductListPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return  By.xpath("//span[contains(@class, 'title') and contains(text(), 'Products')]");
    }
}