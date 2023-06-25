import data.DataProviderForCalcInt;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CalcTest extends BaseTest {
    @Test
    public void sumTest_1() {
        int expectedValue = 5;
        int actualValue = calculator.sum(2, 3);

        Assert.assertEquals(actualValue, expectedValue, "Значение неверное");
    }

    @Test(enabled = false)
    public void sumTest_2() {
        int expectedValue = 5;
        int actualValue = calculator.sum(2, 3);

        Assert.assertEquals(actualValue, expectedValue, "Значение неверное");

    }

    @Test(description = "Тест с описанием")
    public void sumTest_3() {
        int expectedValue = 5;
        int actualValue = calculator.sum(2, 3);

        Assert.assertEquals(actualValue, expectedValue, "Значение неверное");

    }

    @Test(timeOut = 1000)
    public void sumTest_5() throws InterruptedException {
        Thread.sleep(1000);
        int expectedValue = 5;
        int actualValue = calculator.sum(2, 3);

        Assert.assertEquals(actualValue, expectedValue, "Значение неверное");

    }

    @Test(invocationCount = 3, invocationTimeOut = 1000,threadPoolSize =2)
    public void invocationCountTest() throws InterruptedException {
       Thread.sleep(500);
        int expectedValue = 5;
        int actualValue = calculator.sum(2, 3);

        Assert.assertEquals(actualValue, expectedValue, "Значение неверное");

    }
    @Test(expectedExceptions = NullPointerException.class)
    public void exceptionTest() {
        List list =null;
        int size = list.size();

    }
    @Test(dataProvider = "Integer data for div test", dataProviderClass= DataProviderForCalcInt.class, threadPoolSize = 3)
    public void DataProviderTestInt(int a, int b, int expectedValue) {
        Assert.assertEquals(calculator.sum (a,b),expectedValue, "Значение неверное");
    }
}
