package baseEntities;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public abstract class BasePageHW {
    public BasePageHW() {
    }

    public void openPageByUrl(String pagePath) {
        open(pagePath);
    }

    protected abstract By getPageIdentifier();

    public void isPageOpened() {
        $(getPageIdentifier()).shouldBe(visible);
    }
}