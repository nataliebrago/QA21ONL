package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageHW extends BasePageHW {
    @FindBy(id = "user-name")
    public WebElement userNameButton;
    @FindBy(id = "password")
    public WebElement passwordButton;
    @FindBy(id = "login-button")
    public WebElement loginButton;

    public LoginPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.id("login-button");
    }

    public void login(String username, String psw) {
        userNameButton.sendKeys(username);
        passwordButton.sendKeys(psw);
        loginButton.click();
    }
}