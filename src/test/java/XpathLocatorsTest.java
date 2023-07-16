import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class XpathLocatorsTest {
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
    public void basicXpathLocatorsTest() throws InterruptedException {
        driver.get(ReadProperties.getUrl());

        Thread.sleep(2000);

        // Все элементы на странице начина с HTML
        driver.findElements(By.xpath("//*"));

        // Аналог поиска по tagName
        Assert.assertTrue(driver.findElement(By.xpath("//h1")).isDisplayed());

        // Аналог родительского div и на один уровень ниже р1
        Assert.assertTrue(driver.findElement(By.xpath("//div/h1")).isDisplayed());

        // Аналог родительского div и на любом уровене ниже div
        Assert.assertTrue(driver.findElement(By.xpath("//div//div")).isDisplayed());

        // Поиск элемента с тэгом div у которого есть атрибут id
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id]")).isDisplayed());

        // Поиск элемента у которого есть атрибут id cо значением top-logo
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id = 'input_1661368933955']")).isDisplayed());

        // Поиск элемента у которого есть атрибут class cо значением и атрибут autocomplete со значением
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='t-input js-tilda-rule ' and @autocomplete='email']")).isDisplayed());

        // Поиск элемента у которого значение атрибута autocomplete начинается с ema
        Assert.assertTrue(driver.findElement(By.xpath("//*[starts-with(@autocomplete, 'ema')]")).isDisplayed());

        // Поиск элемента у которого значение атрибута class содержит подстроку animate_started
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class, 't-animate_started')]")).isDisplayed());

        // Поиск элемента у которого текстовое значение содержит Онлайн школа тестирования QaLearning
        Assert.assertTrue(driver.findElement(By.xpath("//div[text() = 'Онлайн школа тестирования QaLearning']")).isDisplayed());

        // Поиск элемента у которого текстовое значение содержит подстроку куда податься и с чего начать?
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'куда податься и с чего начать?')]")).isDisplayed());

        // Поиск элемента по индексу
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class = 't-form__inputsbox']/div[8]")).isDisplayed());
    }

    @Test
    public void axesXPathTest() throws InterruptedException {
        driver.get(ReadProperties.getUrl());

        Thread.sleep(2000);

        // Поиск родителя у элемента с тэгом noindex
        Assert.assertTrue(driver.findElement(By.xpath("//noindex/..")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//noindex/parent::div")).isDisplayed());

        // Поиск всех предков с тэгом div у элемента с тэгом noindex
        Assert.assertTrue(driver.findElement(By.xpath("//noindex/ancestor::div")).isDisplayed());

        // Использование child - все дочерние элементы с тэго div от body
        Assert.assertTrue(driver.findElement(By.xpath("//body/child::div")).isDisplayed());

        // Использование child - все дочерние элементы с тэго div от body
        Assert.assertTrue(driver.findElement(By.xpath("//body/descendant::div")).isDisplayed());

        //Использование following - Выбирает всё в документе после закрытия тэга текущего узла
        Assert.assertEquals(3, driver.findElements(By.xpath("//*[@class='t-cover__wrapper t-valign_middle']/following::form")).size());

        //Использование following-sibling - Выбирает все узлы одного уровня после текущего узла
        Assert.assertEquals(1, driver.findElements(By.xpath("//*[@id='input_1495027254430']/following-sibling::div")).size());

        //Использование preceding- Выбирает все узлы, которые появляются перед текущим узлом в документе
        Assert.assertEquals(4, driver.findElements(By.xpath("//*[@id='nav156026854']/preceding::div")).size());

        //Использование preceding-sibling - Выбирает все узлы одного уровня до текущего узла
        Assert.assertEquals(2, driver.findElements(By.xpath("//*[@id='nav156026854']/preceding-sibling::div")).size());
    }
}