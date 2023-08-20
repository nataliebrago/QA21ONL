package helper;

import models.User;
import utils.configuration.ReadProperties;

public class DataHelper {
    public static User getUser() {
        return new User.Builder()
                .withUserName(ReadProperties.getNameUser())
                .withPassword((ReadProperties.getPasswordUser()))
                .build();
    }
}
