import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

import java.util.List;

public class BasicLocatorsTest {
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
    public void basicLocatorsTest() throws InterruptedException {
        driver.get(ReadProperties.getUrl());

        //клик на гиперссылку вход
        List<WebElement> liChilds = driver.findElement(By.id("nav156026854")).findElements(By.tagName("li"));
        liChilds.get(5).click();

        Thread.sleep(3000);
        //клик на гиперссылку "зарегестрироваться"
        driver.findElement(By.partialLinkText("Зарегист")).click();

        Thread.sleep(3000);
        //клик на гиперссылку "Уже зарегестрированы"
        driver.findElement(By.partialLinkText("Войти тут")).click();

        Thread.sleep(3000);
        //клик на гиперссылку "Восстановить пароль"
        driver.findElement(By.linkText("Восстановить пароль")).click();

        Thread.sleep(3000);
        //переход обратно
        driver.navigate().back();

        //ввод email
        driver.findElement(By.name("login")).sendKeys(ReadProperties.username());

        //ввод пароля
        driver.findElement(By.name("password")).sendKeys(ReadProperties.password());

        // Find webElement by Tag
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(2000);
        //клик на гиперссылку Курс "Углубленное тестирование ПО"
        List<WebElement> aChilds = driver.findElement(By.className("t-records")).findElements(By.tagName("a"));
        aChilds.get(0).click();
    }
}
