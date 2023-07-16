import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class CssSelectorHW {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void CssSelector() throws InterruptedException {
        driver.get(ReadProperties.getUrl());

        Thread.sleep(2000);
        //Поиск по id
        Assert.assertTrue(driver.findElement(By.cssSelector("#field-title_1661368915226")).isDisplayed());
        //аналог
        Assert.assertTrue(driver.findElement(By.id("field-title_1661368915226")).isDisplayed());

        // Поиск по class name
        Assert.assertTrue(driver.findElement(By.cssSelector(".t-body")).isDisplayed());
        //   аналог
        Assert.assertTrue(driver.findElement(By.className("t-body")).isDisplayed());

        // Поиск по нескольким значения в аттрибуте class
        Assert.assertTrue(driver.findElement(By.cssSelector(".t-rec.r_anim")).isDisplayed());

        // Поиск по tag name
        Assert.assertTrue(driver.findElement(By.cssSelector("h1")).isDisplayed());
        //   аналог
        Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());

        // Поиск по tag и значению из аттрибута class
        Assert.assertTrue(driver.findElement(By.cssSelector("h1.t182__title")).isDisplayed());

        // Поиск по id и значению из аттрибута class
        Assert.assertEquals(1, driver.findElements(By.cssSelector("#input_1495027254430.t-input")).size());

        // Поиск всех элементов с тэгом h1 или body
        Assert.assertEquals(2, driver.findElements(By.cssSelector("h1, body")).size());

        // Поиск всех элементов с тэгом div у которых непосредственный родитель с тэгом h1
        Assert.assertEquals(1, driver.findElements(By.cssSelector("h1 > div")).size());

        // Поиск всех элементов с тэгом noscript которые идут сразу за элементом с тэго script
        Assert.assertEquals(2, driver.findElements(By.cssSelector("script + noscript")).size());

        // Поиск всех элементов с тэгом script которые являются братьями элементу с тэгом div
        Assert.assertEquals(14, driver.findElements(By.cssSelector("div ~ script")).size());

        // Поиск всех элементов у которых присутствует аттрибут title
        Assert.assertEquals(0, driver.findElements(By.cssSelector("[title]")).size());

        // Поиск всех элементов у которых присутствует аттрибут style с конкретным значением
        Assert.assertEquals(3, driver.findElements(By.cssSelector("[style='color:#000000;border:1px solid #000000;']")).size());

        // Поиск всех элементов у которых присутствует аттрибут id со значением заканчивающимся на какое-то value
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[id$='title_1661368915226']")).size());

        // Поиск всех элементов у которых присутствует аттрибут id со значением начинающимся на какое-то value
        Assert.assertEquals(2, driver.findElements(By.cssSelector("[id^=field-title_16613]")).size());

        // Поиск всех элементов у которых присутствует аттрибут id со значением начинающимся на какое-то слово
        Assert.assertEquals(6, driver.findElements(By.cssSelector("[id|=field]")).size());

        // Поиск всех элементов у которых присутствует аттрибут title со значением содержащим слово целиком (не содержится элементов с атрибутом title)
        Assert.assertEquals(0, driver.findElements(By.cssSelector("[title~=field]")).size());

        // Поиск всех элементов у которых присутствует аттрибут title со значением содержащим какой текст (не содержится элементов с атрибутом title)
        Assert.assertEquals(0, driver.findElements(By.cssSelector("[title*=field]")).size());

        // Поиск всех disabled элементов
        Assert.assertEquals(0, driver.findElements(By.cssSelector(":disabled")).size());

        //Поиск всех enabled элементов
        Assert.assertEquals(30, driver.findElements(By.cssSelector(":enabled")).size());

        //Поиск всех выборанных элементов
        Assert.assertEquals(0, driver.findElements(By.cssSelector(":checked")).size());

        //Поиск всех элементов c пустым телом
        Assert.assertEquals(296, driver.findElements(By.cssSelector(":empty")).size());

        // Поиск элемента с тэгом p и которым является первым дочерним элементом
        Assert.assertEquals(348, driver.findElements(By.cssSelector("div:first-child")).size());

        // Поиск элемента с тэгом p и которым является последним дочерним элементом
        Assert.assertEquals(369, driver.findElements(By.cssSelector("div:last-child")).size());

        // Поиск элемента с тэгом p и которым является n-ым дочерним элементом
        Assert.assertEquals(126, driver.findElements(By.cssSelector("div:nth-child(2)")).size());
    }
}
