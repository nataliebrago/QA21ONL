package baseEntities;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public abstract class BasePageHW {
    public BasePageHW() {
    }

    protected abstract By getPageIdentifier();

    public void isPageOpened() {
        $(getPageIdentifier()).shouldBe(visible);
    }
}