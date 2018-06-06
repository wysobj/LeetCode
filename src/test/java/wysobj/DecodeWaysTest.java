package wysobj;

import org.junit.Test;

public class DecodeWaysTest
{
    @Test
    public void testCase1()
    {
        String code = "12";
        DecodeWays dw = new DecodeWays();
        int num = dw.numDecodings(code);
        assert (num == 2);
    }

    @Test
    public void testCase2()
    {
        String code = "226";
        DecodeWays dw = new DecodeWays();
        int num = dw.numDecodings(code);
        assert (num == 3);
    }

    @Test
    public void testCase3()
    {
        String code = "228371823771238127";
        DecodeWays dw = new DecodeWays();
        int num = dw.numDecodings(code);
        assert (num == 48);
    }

    @Test
    public void testCase4()
    {
        String code = "0123";
        DecodeWays dw = new DecodeWays();
        int num = dw.numDecodings(code);
        assert (num == 0);
    }
}
