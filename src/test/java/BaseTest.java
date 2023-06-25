import org.testng.annotations.*;
import test1.Calculator;
public class BaseTest {
    protected test1.Calculator calculator;

    protected test2.Calculator calculator2;


    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass:....");
        calculator = new test1.Calculator();
        calculator.setPackageName(this.getClass().getPackageName().toString());

        calculator2 = new test2.Calculator();
        calculator2.setPackageName(this.getClass().getPackageName().toString());
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("BeforeGroups:....");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest:....");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod:....");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite:....");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("AfterClass:....");
    }

    @AfterGroups
    public void AfterGroups() {
        System.out.println("AfterGroups:....");
    }

    @AfterTest
    public void AfterTest() {
        System.out.println("AfterTest:....");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("AfterMethod:....");
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("AfterSuite:....");
    }


}

