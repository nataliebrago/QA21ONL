import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokeTestHW {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @Test
    public void ElectWarmFloorCalculator() {
        initDriverUrl();
        initFloorParam();
        initExpandLists();

        WebElement calculateButton = driver.findElement(By.name("button"));
        calculateButton.click();
        checkTestEquals();
    }

    private void initDriverUrl() {
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

    private void initFloorParam() {
        WebElement widthInput = driver.findElement(By.id("el_f_width"));
        WebElement lengthInput = driver.findElement(By.id("el_f_lenght"));
        WebElement heatLossesInput = driver.findElement(By.id("el_f_losses"));

        widthInput.sendKeys("10");
        lengthInput.sendKeys("10");
        heatLossesInput.sendKeys("300");
    }

    private void initExpandLists() {
        WebElement expandListOne = driver.findElement(By.id("room_type"));
        Select selectRoomType = new Select(expandListOne);
        WebElement expandListTwo = driver.findElement(By.id("heating_type"));
        Select selectHeatingType = new Select(expandListTwo);

        selectRoomType.selectByVisibleText("Кухня или спальня");
        selectHeatingType.selectByValue("3");
    }

    private void checkTestEquals() {
        WebElement valueOne = driver.findElement(By.id("floor_cable_power"));
        WebElement valueTwo = driver.findElement(By.id("spec_floor_cable_power"));

        Assert.assertEquals(valueOne.getAttribute("value"), "167");
        Assert.assertEquals(valueTwo.getAttribute("value"), "2");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
