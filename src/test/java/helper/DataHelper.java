package helper;

import models.User;
import utils.configuration.ReadProperties;
import org.apache.logging.log4j.*;

public class DataHelper {
    static Logger logger = LogManager.getLogger(DataHelper.class);

    public static User getUser() {
        User mUser = User.builder()
                .userName(ReadProperties.getNameUser())
                .password((ReadProperties.getPasswordUser()))
                .build();
        logger.info(mUser.toString());
        return mUser;
    }
}
