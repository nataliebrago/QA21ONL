package data;

import org.testng.annotations.DataProvider;

public class DataProviderForCalcInt {
    @DataProvider(name = "integer data for calculator",parallel = true)
    public static Object[][] dataForSumTest(){
        return new Object[][]{
                {4, 2, 2},
                {0,0,0},
                {2,3,5}
        };
    }
}
