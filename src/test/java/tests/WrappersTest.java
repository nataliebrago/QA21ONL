package tests;

import baseEntities.BaseTest;
import elements.CheckBox;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CheckBoxPage;
import pages.RadioButtonPage;
import utils.configuration.ReadProperties;

public class WrappersTest extends BaseTest {

    @Test
    public void checkBoxPageTest() throws InterruptedException {
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password());
        CheckBoxPage mCheckBoxPage = new CheckBoxPage(driver);
        mCheckBoxPage.openPageByUrl();

        CheckBox checkBox = mCheckBoxPage.getProjectCheckBox();
        checkBox.setFlagCheckBox(true);

        Thread.sleep(3000);
        checkBox.setFlagCheckBox(false);
    }

    @Test
    public void radioButtonPageTest() throws InterruptedException {
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password());
        RadioButtonPage mRadioButtonPage = new RadioButtonPage(driver);
        mRadioButtonPage.openPageByUrl();

        RadioButton mRadioButton = mRadioButtonPage.getRadioButtonElements(By.name("suite_mode"));
        mRadioButton.selectByIndex(0);
        Thread.sleep(2000);
        mRadioButton.selectByValue("2");
        Thread.sleep(2000);
        mRadioButton.selectByText("Use multiple test suites to manage cases");
    }

    @Test
    public void radioButtonPageTwoTest() throws InterruptedException {
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password());
        RadioButtonPage mRadioButtonPage = new RadioButtonPage(driver);
        mRadioButtonPage.openPageBySecondUrl();

        RadioButton mRadioButton = mRadioButtonPage.getRadioButtonElements(By.name("invite"));
        mRadioButton.selectByText("Manually specify password (no invitation is sent)");
        Thread.sleep(2000);
        mRadioButton.selectByValue("1");
    }
}