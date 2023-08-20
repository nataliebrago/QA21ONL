package tests;

import helper.DataHelper;
import models.Project;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.LoginStep;
import utils.configuration.ReadProperties;

public class LoginTest extends BaseTest  {

    @Test
    public void successLoginTest() {
        Assert.assertTrue(
                new LoginStep().successLogin(DataHelper.getAdminUser()).isPageOpened()
        );
    }
}