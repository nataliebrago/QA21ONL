package steps;

import baseEntities.BaseStepHW;
import pages.ProductListPageHW;


public class LoginStepHW extends BaseStepHW {
    public LoginStepHW() {
        super();
    }

    public ProductListPageHW loginHW(String username, String psw) {
        mLoginPageHW.login(username, psw);
        return mProductListPageHW;
    }
}

