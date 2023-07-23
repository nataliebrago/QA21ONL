package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.ProductListPageHW;


public class LoginStepHW extends BaseStepHW {
    public LoginStepHW(WebDriver driver) {
        super(driver);
    }
    public ProductListPageHW loginHW(String username, String psw) {
        mLoginPageHW.login(username, psw);
        return mProductListPageHW;
    }
}

