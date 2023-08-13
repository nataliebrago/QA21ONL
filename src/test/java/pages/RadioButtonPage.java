package pages;
import baseEntities.BasePage;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RadioButtonPage  extends BasePage {
    private final static String pagePath = "/index.php?/admin/projects/add";

    private final static String pagePathTwo = "/index.php?/admin/users/add";

    private final By headerTitleLabelLocator = By.className("page_title");

    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    public void openPageBySecondUrl() {
        super.openPageByUrl(pagePathTwo);
    }

    public RadioButton getRadioButtonElements(By by){
        return new RadioButton(driver,by);
    }
}
