package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {
    private static final String mUrlContextMenuTest = "http://the-internet.herokuapp.com/context_menu";
    private static final String mExpectedText = "You selected a context menu";
    private static final String mContextId = "hot-spot";

    @Test
    public void alertContextMenuTest() {
        mWebDriver.get(mUrlContextMenuTest);

        Actions actions = new Actions(mWebDriver);
        actions.contextClick(mWebDriver.findElement(By.id(mContextId)));
        actions.perform();

        Alert alert = mWebDriver.switchTo().alert();
        Assert.assertEquals(alert.getText(), mExpectedText);
        alert.accept();
    }
}