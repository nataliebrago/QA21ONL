package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageHW extends BasePageHW {

    @FindBy (id = "checkout")
    public WebElement checkoutButton;

    public CartPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.xpath("//span[contains(@class, 'title') and contains(text(), 'Your Cart')]");
    }

    public CheckoutProcessStepOnePageHW checkoutAction() {
        checkoutButton.click();
        return new CheckoutProcessStepOnePageHW(driver);
    }
}