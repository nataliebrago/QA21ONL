import data.DataProviderForCalcDouble;
import data.DataProviderForCalcInt;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorTestHW extends BaseTest{
    private int attempt =  2;

    @Test(groups = "positive")
    public void test1_int() {
        int expectedValue = 2;
        int actualValue = calculator.div(4,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test(groups = {"smoke","positive"})
    public void test1_double() {
        double expectedValue = 5;
        double actualValue = calculator.div(5.5,1.1);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(enabled = false,groups = "smoke")
    public void test2_int() {
        int expectedValue = 2;
        int actualValue = calculator.div(4,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test(enabled = false,groups = "smoke")
    public void test2_double() {
        double expectedValue = 5;
        double actualValue = calculator.div(5.5,1.1);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(description = "описание теста",groups = "smoke")
    public void test3_int() {
        int expectedValue = 2;
        int actualValue = calculator.div(4,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test(description = "описание теста",groups = {"smoke","positive"})
    public void test3_double() {
        double expectedValue = 5;
        double actualValue = calculator.div(5.5,1.1);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(testName = "деление целочисленных чисел",groups = {"smoke","positive"})
    public void test4_int() {
        int expectedValue = 2;
        int actualValue = calculator.div(4,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test(testName = "деление дроблых чисел")
    public void test4_double() {
        double expectedValue = 5;
        double actualValue = calculator.div(5.5,1.1);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(timeOut = 1000,groups = "regression")
    public void test5_int() {
        int expectedValue = 2;
        int actualValue = calculator.div(4,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(timeOut = 1500,groups = "negative")
    public void test5_doubleNeg() throws InterruptedException {
        Thread.sleep(1600);
        double expectedValue = 5;
        double actualValue = calculator.div(5.5,1.1);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(invocationCount = 4)
    public void test6_int() {
        int expectedValue = 2;
        int actualValue = calculator.div(4,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test(invocationCount = 2)
    public void test6_double() {
        double expectedValue = 5;
        double actualValue = calculator.div(5.5,1.1);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }


    @Test(invocationCount = 4,invocationTimeOut = 2000 ,threadPoolSize = 5)
    public void test7_int() throws InterruptedException {
        Thread.sleep(1000);
        int expectedValue = 2;
        int actualValue = calculator.div(4,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(invocationCount = 4,invocationTimeOut = 2000,groups = "negative")
    public void test7_intNeg() throws InterruptedException {
        Thread.sleep(1000);
        int expectedValue = 2;
        int actualValue = calculator.div(4,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(invocationCount = 4,invocationTimeOut = 2000)
    public void test7_double() throws InterruptedException {
        Thread.sleep(200);
        double expectedValue = 5;
        double actualValue = calculator.div(5.5,1.1);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }


    @Test(priority = 1)
    public void test1_intPrior() {
        int expectedValue = 2;
        int actualValue = calculator.div(4,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test(priority = 2)
    public void test1_doublePrior() {
        double expectedValue = 5;
        double actualValue = calculator.div(5.5,1.1);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test()
    public void test8_intDep() {
        int expectedValue = 2;
        int actualValue = calculator.div(4,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test(dependsOnMethods = {"test8_intDep","test9_doubleDep"})
    public void test8_doubleDep() {
        double expectedValue = 5;
        double actualValue = calculator.div(5.5,1.1);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(dependsOnMethods = "test8_intDep")
    public void test9_doubleDep() {
        double expectedValue = 5;
        double actualValue = calculator.div(5.5,1.1);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(invocationTimeOut = 1000,dependsOnMethods = "test8_intDep",groups = "negative")
    public void test8_doubleDepNeg() throws InterruptedException {
        Thread.sleep(1500);
        double expectedValue = 5;
        double actualValue = calculator.div(5.5,1.1);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(dependsOnMethods = "test8_doubleDepNeg")
    public void test8_doubleDepNegDep() {
        double expectedValue = 5;
        double actualValue = calculator.div(5.5,1.1);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(dependsOnMethods = "test8_doubleDepNeg",alwaysRun = true)
    public void test8_doubleDepNegDepRun() {
        double expectedValue = 5;
        double actualValue = calculator.div(5.5,1.1);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }


    @Parameters({"value-a","value-b"})
    @Test(groups = "positive")
    public void test10_int(@Optional("4") String a,@Optional("2") String b) {
        int expectedValue = 2;
        int actualValue = calculator.div(Integer.parseInt(a),Integer.parseInt(b));
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Parameters({"value-a-double","value-b-double"})
    @Test(groups = {"smoke","positive"})
    public void test10_double(@Optional("5.5") String a,@Optional("1.1") String b) {
        double expectedValue = 5;
        double actualValue = calculator.div(Double.parseDouble(a),Double.parseDouble(b));
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(dataProvider = "integer data for calculator", dataProviderClass = DataProviderForCalcInt.class,threadPoolSize = 2)
    public void test11_int(int a, int b, int expectedValue) {
        int actualValue = calculator.div(a,b);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(dataProvider = "double data for calculator", dataProviderClass = DataProviderForCalcDouble.class)
    public void test11_double(double a, double b, int expectedValue) {
        double actualValue = calculator.div(a,b);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void expectedExceptionsTest_1() {
        calculator.div(2, 0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void expectedExceptionsTest_2() {
       calculator.div(0, 0);
    }

    @Test
    public void expectedExceptionsTest_3() {
        double result = calculator.div(111.1, 0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    public void expectedExceptionsTest_4() {
        double result = calculator.div(-111.1, 0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, result);
    }

    @Test
    public void expectedExceptionsTest_5() {
        double result = calculator.div(0.0, 0);
        Assert.assertEquals(Double.NaN, result);
    }

    @Test(retryAnalyzer = Retry.class)
    public void retryTest() {
        if (attempt == 3) {
            System.out.println("Attempt is: " + attempt);
            Assert.assertTrue(true);
        } else {
            attempt++;
            System.out.println("Attempt is: " + attempt);
            throw new NullPointerException();
        }
    }
}
