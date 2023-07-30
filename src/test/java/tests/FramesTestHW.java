package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTestHW extends BaseTest {
    private static final String mUrlFramesTestHW = "http://the-internet.herokuapp.com/iframe";
    private static final String mInputFrame = "mce_0_ifr";
    private static final String mInputBodyId = "tinymce";
    private static final String mExpectedText = "Your content goes here.";
    private static final String mToxEditorClassName = "tox-editor-container";

    @Test
    public void frameTest() {
        mWebDriver.get(mUrlFramesTestHW);
        mWebDriver.switchTo().frame(mInputFrame);

        Assert.assertEquals(mWaitService.waitForVisibilityLocatedBy(By.id(mInputBodyId)).getText(), mExpectedText);

        mWebDriver.switchTo().parentFrame();
        Assert.assertTrue(mWebDriver.findElement(By.className(mToxEditorClassName)).isDisplayed());
    }
}