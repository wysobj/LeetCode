package wysobj;

import org.junit.Test;

public class MyPowerTest
{
    @Test
    public void testCase1()
    {
        double x = 2.0000;
        int n = 10;
        MyPower mp = new MyPower();
        double result = mp.myPow(x, n);
        assert (Double.compare(result, 1024.000) == 0);
    }

    @Test
    public void testCase2()
    {
        double x = 2.1;
        int n = 3;
        MyPower mp = new MyPower();
        double result = mp.myPow(x, n);
        assert (Double.compare(result, 9.261) == 0);
    }

    @Test
    public void testCase3()
    {
        double x = 2;
        int n = -2;
        MyPower mp = new MyPower();
        double result = mp.myPow(x, n);
        assert (Double.compare(result, 0.25) == 0);
    }

    @Test
    public void testCase4()
    {
        double x = 0.00001;
        int n = 2147483647;
        MyPower mp = new MyPower();
        double result = mp.myPow(x, n);
        assert (Double.compare(result, 0.25) == 0);
    }
}
