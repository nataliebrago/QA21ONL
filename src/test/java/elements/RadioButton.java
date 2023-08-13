package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RadioButton {
    private List<UIElement> mUIElements;
    private List<String> mValues;
    private List<String> mStrongTextList;

    public RadioButton(WebDriver driver, By by) {
        this.mUIElements = new ArrayList<>();
        this.mValues = new ArrayList<>();
        this.mStrongTextList = new ArrayList<>();
        initListValue(driver,by);
    }

    public void  initListValue(WebDriver driver, By by){
        for (WebElement webElement : driver.findElements((by))) {
            UIElement element = new UIElement(driver, webElement);
            String strongTextFromUIElement = element.findUIElement(By.xpath("parent::*/strong")).getText().trim();
            mStrongTextList.add(strongTextFromUIElement);
            mValues.add(element.getAttribute("value"));
            mUIElements.add(element);
        }
    }

    public void selectByIndex(int index) {
        mUIElements.get(index).click();
    }

    public void selectByValue(String value) {
        mUIElements.get(mValues.indexOf(value)).click();
    }

    public void selectByText(String text) {
        mUIElements.get(mStrongTextList.indexOf(text)).click();
    }
}
