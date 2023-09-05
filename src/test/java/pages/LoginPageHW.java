package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageHW extends BasePageHW {
    private final By userNameInputLocator = By.id("user-name");
    private final By passwordInputLocator = By.id("password");
    private final By loginButtonLocator = By.id("login-button");

    public LoginPageHW() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return loginButtonLocator;
    }

    public WebElement getUserNameInput() {
        return $(userNameInputLocator);
    }

    public WebElement getPswInput() {
        return $(passwordInputLocator);
    }

    public WebElement getLoginButton() {
        return $(loginButtonLocator);
    }

    public void login(String username, String psw) {
        getUserNameInput().sendKeys(username);
        getPswInput().sendKeys(psw);
        getLoginButton().click();
    }
}