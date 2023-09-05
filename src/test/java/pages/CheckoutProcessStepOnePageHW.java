package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutProcessStepOnePageHW extends BasePageHW {
    private final By headerTitleLocatorCheckoutProcessStepOnePageHW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Checkout: Your Information')]");
    private final By firstNameInputLocator = By.id("first-name");
    private final By lastNameInputLocator = By.id("last-name");
    private final By zipOrPostalCodeInputLocator = By.id("postal-code");
    private final By continueButtonLocator = By.id("continue");

    public CheckoutProcessStepOnePageHW() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocatorCheckoutProcessStepOnePageHW;
    }

    public WebElement getFirstNameInputField() {
        return $(firstNameInputLocator);
    }

    public WebElement getLastNameInputField() {
        return $(lastNameInputLocator);
    }

    public WebElement getPostalCodeInputField() {
        return $(zipOrPostalCodeInputLocator);
    }

    public WebElement getContinueButton() {
        return $(continueButtonLocator);
    }

    public void setFirstName(String value) {
        getFirstNameInputField().sendKeys(value);
    }

    public void setLastName(String value) {
        getLastNameInputField().sendKeys(value);
    }

    public void setPostalCode(String value) {
        getPostalCodeInputField().sendKeys(value);
    }

    public void setInformationAboutPerson() {
        setFirstName("Nataly");
        setLastName("Brago");
        setPostalCode("224024");
    }
}