package steps;

import baseEntities.BaseTestHW;
import factory.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends BaseTestHW {
    private BaseTestHW baseTest;

    public Hook(BaseTestHW baseTest) {
        this.baseTest = baseTest;
    }
    @Before
    public void initGuiScenario(Scenario scenario) {
        baseTest.driver = new BrowserFactory().getDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Attach screenshot");
        }
        baseTest.driver.quit();
    }
}