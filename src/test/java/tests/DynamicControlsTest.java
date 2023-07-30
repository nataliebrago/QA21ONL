package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {

    private static final String mUrlDynamicControlsTest = "http://the-internet.herokuapp.com/dynamic_controls";
    private static final String mButtonRemoveXpath = "//*[@id=\"checkbox-example\"]/button";
    private static final String mCheckBoxId = "checkbox";
    private static final String mMessageXpath = "//*[@id=\"message\"]";
    private static final String mButtonEnableXpath ="//*[@id=\"input-example\"]/button";
    private static final String mInputXpath = "//*[@id=\"input-example\"]/input";
    private static final String mDisName ="disabled";

    @Test
    public void dynamicControlsTest() {
        mWebDriver.get(mUrlDynamicControlsTest);

        WebElement checkbox = mWaitService.waitForExists(By.id(mCheckBoxId));

        WebElement mButtonRemoveWebElement = mWaitService.waitForExists(By.xpath(mButtonRemoveXpath));
        mButtonRemoveWebElement.click();

        WebElement text = mWaitService.waitForExists(By.xpath(mMessageXpath));
        text.isDisplayed();

        Assert.assertTrue(mWaitService.waitForElementInvisible(checkbox));

        WebElement input = mWaitService.waitForExists(By.xpath(mInputXpath));
        Assert.assertTrue(Boolean.parseBoolean(input.getAttribute(mDisName)));

        WebElement buttonEnable = mWaitService.waitForExists(By.xpath(mButtonEnableXpath));
        buttonEnable.click();

        WebElement textEnable = mWaitService.waitForExists(By.xpath(mMessageXpath));
        mWaitService.waitForVisibilityLocatedBy(By.xpath(mMessageXpath));
        Assert.assertTrue(textEnable.isDisplayed());
    }
}