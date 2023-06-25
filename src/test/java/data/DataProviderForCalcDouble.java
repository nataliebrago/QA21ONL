package data;

import org.testng.annotations.DataProvider;

public class DataProviderForCalcDouble {
    @DataProvider(name = "double data for calculator",parallel = true)
    public static Object[][] dataForSumTest(){
        return new Object[][]{
                {5.5,1.1, 5},
                {4.4, 0.2, 22},
                {4.4, 0, 0},
                {3.3, 2.2,3}
        };
    }
}
