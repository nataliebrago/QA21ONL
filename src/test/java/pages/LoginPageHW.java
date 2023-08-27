package pages;

import baseEntities.BasePageHW;
import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.configuration.ReadProperties;

public class LoginPageHW extends BasePageHW {
    @FindBy(id = "user-name")
    public WebElement userNameButton;
    @FindBy(id = "password")
    public WebElement passwordButton;
    @FindBy(id = "login-button")
    public WebElement loginButton;

    public LoginPageHW(WebDriver driver) {
        super(driver);
        logger.info("Success open url - " + ReadProperties.getUrl());
    }

    @Override
    protected By getPageIdentifier() {
        return By.id("login-button");
    }

    public ProductListPageHW loginAction(User user) {
        userNameButton.sendKeys(user.getUserName());
        passwordButton.sendKeys(user.getPassword());
        loginButton.click();
        logger.info("Success login user - " + user);
        return new ProductListPageHW(driver);
    }
}