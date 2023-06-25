import org.testng.annotations.*;
@Listeners(Listener.class)
public class BaseTest {
    protected Calculator calculator = new Calculator();

    @BeforeClass
    public void beforeClass() {
    }

    @BeforeGroups
    public void beforeGroups() {

    }

    @BeforeTest
    public void beforeTest() {

    }

    @BeforeMethod
    public void beforeMethod() {
    }

    @BeforeSuite
    public void beforeSuite() {

    }

    @AfterClass
    public void AfterClass() {

    }

    @AfterGroups
    public void AfterGroups(){
    }

    @AfterTest
    public void AfterTest() {

    }

    @AfterMethod
    public void AfterMethod() {

    }

    @AfterSuite
    public void AfterSuite(){};
}

