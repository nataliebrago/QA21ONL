package steps;

import baseEntities.BaseTestHW;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPageHW;
import utils.configuration.ReadProperties;


public class LoginStepHW extends BaseTestHW {
    private BaseTestHW baseTest;
    private LoginPageHW loginPagehw;

    public LoginStepHW(BaseTestHW baseTest) {
        this.baseTest = baseTest;
    }

    @Given("start browser")
    public void startBrowser() {
    }

    @Given("open login page")
    public void openLoginPage() {
        driver.get(ReadProperties.getUrl());
    }

    @When("user logs in to the site with username {} and password {}")
    public void loginHW(String username, String password) {
        loginPagehw = new LoginPageHW(driver);
        loginPagehw.login(username, password);
    }
}


