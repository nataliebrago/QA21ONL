package helper;

import models.User;
import utils.configuration.ReadProperties;

public class DataHelper {
    public static User getUser() {
        User user = new User();
        user.setUserName(ReadProperties.getNameUser());
        user.setPassword(ReadProperties.getPasswordUser());
        return user;
    }
    }
