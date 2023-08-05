package tests;

import baseEntities.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitService;

public class ScreenShotErrorTestHW extends BaseTest {

    @Test
    @Story("QA21ONL-4")
    @Description("Use WaitService and Error xpath for screenshot")
    @Severity(SeverityLevel.BLOCKER)
    public void infoAlertTest() {
        WaitService mWaitService = new WaitService(driver);
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        WebElement webElement = mWaitService.waitForVisibilityLocatedBy(By.xpath("//button[. = 'Error Click for JS Alert']"));
        Assert.assertTrue(webElement.isDisplayed());
        driver.findElement(By.xpath("//button[. = 'Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Alert");
        alert.accept();
    }
}