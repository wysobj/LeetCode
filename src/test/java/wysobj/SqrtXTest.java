package wysobj;

import org.junit.Test;

public class SqrtXTest
{
    @Test
    public void testCase1()
    {
        int x = 4;
        SqrtX sx = new SqrtX();
        int result = sx.mySqrt(x);
        assert (result == 2);
    }

    @Test
    public void testCase2()
    {
        int x = 8;
        SqrtX sx = new SqrtX();
        int result = sx.mySqrt(x);
        assert (result == 2);
    }

    @Test
    public void testCase3()
    {
        int x = 9;
        SqrtX sx = new SqrtX();
        int result = sx.mySqrt(x);
        assert (result == 3);
    }

    @Test
    public void testCase4()
    {
        int x = 1;
        SqrtX sx = new SqrtX();
        int result = sx.mySqrt(x);
        assert (result == 1);
    }

    @Test
    public void testCase5()
    {
        int x = 2;
        SqrtX sx = new SqrtX();
        int result = sx.mySqrt(x);
        assert (result == 1);
    }

    @Test
    public void testCase6()
    {
        int x = 2500;
        SqrtX sx = new SqrtX();
        int result = sx.mySqrt(x);
        assert (result == 50);
    }

    @Test
    public void testCase7()
    {
        int x = 2147395599;
        SqrtX sx = new SqrtX();
        int result = sx.mySqrt(x);
        assert (result == 46339);
    }
}
