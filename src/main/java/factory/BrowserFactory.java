package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.configuration.ReadProperties;

public class BrowserFactory {
    private WebDriver driver = null;
    private DriverManagerType driverManagerType = null;

    public BrowserFactory() {
        switch (ReadProperties.browserName().toLowerCase()) {
            case "chrome":
                driverManagerType = DriverManagerType.CHROME;
                WebDriverManager.getInstance(driverManagerType).setup();

                driver = new ChromeDriver(getOptions());
                break;
            case "firefox":
                driverManagerType = DriverManagerType.FIREFOX;
                WebDriverManager.getInstance(driverManagerType).setup();
                driver = new FirefoxDriver(getFirefoxOptions());
                break;
            default:
                System.out.println("Browser" + ReadProperties.browserName() + "is not supported");
                break;
        }
    }

    public WebDriver getDriver() {
        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();
        return this.driver;
    }


    public ChromeOptions getOptions() {
        ChromeOptions chromeoptions = new ChromeOptions();

        chromeoptions.setHeadless(false);
        chromeoptions.addArguments("--disable-gpu");
        chromeoptions.addArguments("--ignore-certificate-errors");
        chromeoptions.addArguments("--silent");
        chromeoptions.addArguments("--start-maximized");
        chromeoptions.addArguments("--incognito");
        return chromeoptions;

    }

    public FirefoxOptions getFirefoxOptions() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();

        firefoxOptions.setHeadless(false);
        firefoxOptions.addArguments("--disable-gpu");
        firefoxOptions.addArguments("--ignore-certificate-errors");
        firefoxOptions.addArguments("--silent");
        firefoxOptions.addArguments("--start-maximized");
        firefoxOptions.addArguments("--incognito");
        return firefoxOptions;

    }
}
