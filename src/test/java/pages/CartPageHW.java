package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageHW extends BasePageHW {
    @FindBy (id = "checkout")
    public static WebElement checkoutButtonLocator;

    public CartPageHW(WebDriver driver) {
        super(driver);
    }
}