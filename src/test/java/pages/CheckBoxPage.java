package pages;

import baseEntities.BasePage;
import elements.CheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage extends BasePage {
    private final static String pagePath = "/index.php?/admin/projects/edit/2/1";

    // Блок описания локаторов для элементов
    private final By headerTitleLabelLocator = By.className("page_title");
    private final By projectsCheckBoxLocator =  By.id("is_completed");

    // Блок инициализации
    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    public CheckBox getProjectCheckBox() {
        return new CheckBox(driver, projectsCheckBoxLocator);
    }
}