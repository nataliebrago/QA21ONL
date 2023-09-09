package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutProcessStepOnePageHW extends BasePageHW {

    @FindBy(id = "first-name")
    public WebElement firstNameInput;
    @FindBy(id = "last-name")
    public WebElement lastNameInput;
    @FindBy(id = "postal-code")
    public WebElement zipOrPostalCodeInput;
    @FindBy(id = "continue")
    public static WebElement continueButton;

    public CheckoutProcessStepOnePageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.xpath("//span[contains(@class, 'title') and contains(text(), 'Checkout: Your Information')]");
    }

    public void setFirstName(String value) {
        firstNameInput.sendKeys(value);
    }

    public void setLastName(String value) {
        lastNameInput.sendKeys(value);
    }

    public void setPostalCode(String value) {
        zipOrPostalCodeInput.sendKeys(value);
    }

    public static void setInformationAboutPerson() {
        setFirstName("Nataly");
        setLastName("Brago");
        setPostalCode("224024");
    }
}