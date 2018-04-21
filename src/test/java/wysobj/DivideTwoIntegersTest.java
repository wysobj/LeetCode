package wysobj;

import org.junit.Test;

public class DivideTwoIntegersTest
{
    @Test
    public void testCase1()
    {
        int divident = 10;
        int divisor = 3;
        DivideTwoIntegers dt = new DivideTwoIntegers();
        int result = dt.divide(divident, divisor);
        assert (result == 3);
    }

    @Test
    public void testCase2()
    {
        int divident = 7;
        int divisor = -3;
        DivideTwoIntegers dt = new DivideTwoIntegers();
        int result = dt.divide(divident, divisor);
        assert (result == -2);
    }

    @Test
    public void testCase3()
    {
        int divident = 0;
        int divisor = -3;
        DivideTwoIntegers dt = new DivideTwoIntegers();
        int result = dt.divide(divident, divisor);
        assert (result == 0);
    }

    @Test
    public void testCase4()
    {
        int divident = -2147483648;
        int divisor = -1;
        DivideTwoIntegers dt = new DivideTwoIntegers();
        int result = dt.divide(divident, divisor);
        assert (result == 2147483647);
    }

    @Test
    public void testCase5()
    {
        int divident = -2147483646;
        int divisor = 1;
        DivideTwoIntegers dt = new DivideTwoIntegers();
        int result = dt.divide(divident, divisor);
        assert (result == -2147483646);
    }
}
