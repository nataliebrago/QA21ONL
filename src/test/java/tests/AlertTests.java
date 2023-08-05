package tests;

import baseEntities.BaseTest;
import io.qameta.allure.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitService;

@Epic("AlertTests")
@Feature("Thread sleep")
public class AlertTests extends BaseTest {

    @Test
    @Story("QA21ONL-1")
    @Description("Use WaitService")
    @Severity(SeverityLevel.BLOCKER)
    public void infoAlertTest() {
        WaitService mWaitService = new WaitService(driver);
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        WebElement webElement = mWaitService.waitForVisibilityLocatedBy(By.xpath("//button[. = 'Click for JS Alert']"));
        Assert.assertTrue(webElement.isDisplayed());
        driver.findElement(By.xpath("//button[. = 'Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Alert");
        alert.accept();
    }

    @Test
    @Story("QA21ONL-2")
    @Description("Use Thread sleep")
    @Severity(SeverityLevel.NORMAL)
    public void confirmAlertTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[. = 'Click for JS Confirm']")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Confirm");
        alert.dismiss();
    }

    @Test
    @Story("QA21ONL-3")
    @Description("Use Thread sleep")
    @Severity(SeverityLevel.CRITICAL)
    public void promptAlertTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[. = 'Click for JS Prompt']")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS prompt");
        alert.sendKeys("Everything is OK!");
        alert.accept();
    }
}