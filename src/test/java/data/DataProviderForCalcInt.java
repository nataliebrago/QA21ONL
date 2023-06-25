package data;

import org.testng.annotations.DataProvider;

public class DataProviderForCalcInt {
    @DataProvider(name = "Integer data for div test",parallel = true)
    public static Object[][] dataForSumTest(){
        return new Object[][]{
                {-2, -3, -5},
                {0,0,0},
                {2,3,5}
        };
    }
}
