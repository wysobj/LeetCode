package wysobj;

import org.junit.Test;

public class ValidNumberTest
{
    @Test
    public void testCase1()
    {
        String s = "0";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == true);
    }

    @Test
    public void testCase2()
    {
        String s = "0.1231";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == true);
    }

    @Test
    public void testCase3()
    {
        String s = "2e3";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == true);
    }

    @Test
    public void testCase4()
    {
        String s = "035";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == true);
    }

    @Test
    public void testCase5()
    {
        String s = "abc";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == false);
    }

    @Test
    public void testCase6()
    {
        String s = "1e";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == false);
    }

    @Test
    public void testCase7()
    {
        String s = "e";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == false);
    }

    @Test
    public void testCase8()
    {
        String s = "1e005";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == true);
    }

    @Test
    public void testCase9()
    {
        String s = "1e-5";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == true);
    }

    @Test
    public void testCase10()
    {
        String s = "-5";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == true);
    }

    @Test
    public void testCase11()
    {
        String s = "-0.5";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == true);
    }

    @Test
    public void testCase12()
    {
        String s = "-1e-0.5";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == false);
    }

    @Test
    public void testCase13()
    {
        String s = "1e2e";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == false);
    }

    @Test
    public void testCase14()
    {
        String s = "0.55.5";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == false);
    }

    @Test
    public void testCase15()
    {
        String s = "0.5e5";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == true);
    }

    @Test
    public void testCase16()
    {
        String s = "1.";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == true);
    }

    @Test
    public void testCase17()
    {
        String s = ".1";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == true);
    }

    @Test
    public void testCase18()
    {
        String s = ".e1";
        ValidNumber vn = new ValidNumber();
        boolean result = vn.isNumber(s);
        assert (result == true);
    }
}
