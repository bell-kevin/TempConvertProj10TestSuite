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
public class temperatureConvertTestSuite {

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
            {15.99, -53.01, 60.782}, //test case 1
            {-11.01, 6.99, 12.1819}, //test case 2
            {45.99, 65.99, 114.78}, //test case 3
            {-22.01, -44.01, -7.61}, //test case 4
            {-99.99, 34.99, -147.98}, //test case 5
            {99.99, 55.99, 211.98}, //test case 6
            {27.99, -99.99, 82.38}, //test case 7
            {68.99, 99.99, 156.18}, //test case 8
            {24.99, 76.99, 76.98}, //test case 9
            {76.99, 24.99, 170.58}, //test case 10
            {0, 68.99, 32.00}, //test case 11
            {68.99, 0, 156.18}, //test case 12
            {71, 25.2, 159.8}, //test case 13
            {65.2, 18, 149.36} //test case 14    
        };
        return Arrays.asList(data);
    } //end Collection--data

    @Test
    public void CtoF() {
        assertEquals(result, TemperatureConverter.CtoF(userTemp), 0.01); //C boiling temp
    } //end testFtoC
}
