package temperatureconverter;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class tempConvertTestSuite {

    @Parameterized.Parameter(0)
    public double userTemp;
    @Parameterized.Parameter(1)
    public double tempType;
    @Parameterized.Parameter(2)
    public double result;

    //test data for testAdd
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
            {15.99, -53.01, -8.8942}, //test case 1
            {-11.01, 6.99, -23.894}, //test case 2
            {45.99, 65.99, 7.7724}, //test case 3
            {-22.01, -44.01, -30.0056}, //test case 4
            {-99.99, 34.99, -73.3278}, //test case 5
            {99.99, 55.99, 37.7722}, //test case 6
            {27.99, -99.99, -2.227787}, //test case 7
            {68.99, 99.99, 20.54}, //test case 8
            {24.99, 76.99, -3.8944}, //test case 9
            {76.99, 24.99, 24.9944}, //test case 10
            {0, 68.99, -17.777}, //test case 11
            {68.99, 0, 20.549}, //test case 12
            {71, 25.2, 21.66}, //test case 13
            {65.2, 18, 18.44} //test case 14    
        };
        return Arrays.asList(data);
    } //end Collection--data

    @Test
    public void FtoC() {
        System.out.println("FtoC");
        assertEquals(result, TemperatureConverter.FtoC(userTemp), 0.01);
    } //end testFtoC
}
