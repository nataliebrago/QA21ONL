package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {

    private UIElement mUIElement;
    private WebDriver mWebDriver;

    public CheckBox(WebDriver webDriver, By by) {
        this.mUIElement = new UIElement(webDriver, by);
        this.mWebDriver = webDriver;
    }

    public void setFlagCheckBox(boolean isSelect) {
        if ((isSelect && !mUIElement.isSelected()) || (!isSelect && mUIElement.isSelected())) {
            mUIElement.click();
        }
    }
}
