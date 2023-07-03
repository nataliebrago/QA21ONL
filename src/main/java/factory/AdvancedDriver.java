package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AdvancedDriver {

    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        return new ChromeDriver(getOptions());
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
        return  firefoxOptions;

    }
}
