package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {
    private static final String mUrlFileUploadTest = "http://the-internet.herokuapp.com/upload";
    private static final String mFileUploadButtonId = "file-upload";
    private static final String mFileSubmitButtonId = "file-submit";
    private static final String mUploadFileNameText = "uploaded-files";
    private static final String mFileName = "photo_2023.jpg";

    @Test
    public void fileUploadTest() {
        mWebDriver.get(mUrlFileUploadTest);

        WebElement mFileUploadButtonWebElement = mWaitService.waitForExists(By.id(mFileUploadButtonId));
        String pathToFile = ActionTests.class.getClassLoader().getResource(mFileName).getPath();
        pathToFile = pathToFile.substring(1,pathToFile.length());
        mFileUploadButtonWebElement.sendKeys(pathToFile);

        mWaitService.waitForVisibilityLocatedBy(By.id(mFileSubmitButtonId)).submit();
        Assert.assertEquals(mWaitService.waitForVisibilityLocatedBy(By.id(mUploadFileNameText)).getText(), mFileName);
    }
}