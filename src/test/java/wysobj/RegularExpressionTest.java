package wysobj;

import org.junit.Test;
import wysobj.RegularExpression;

public class RegularExpressionTest
{

    @Test
    public void testMatchCase1()
    {
        RegularExpression re = new RegularExpression();
        String s = "ab";
        String p = "ab";
        boolean isMatch = re.isMatch(s, p);
        assert (isMatch);
    }

    @Test
    public void testMatchCase2()
    {
        RegularExpression re = new RegularExpression();
        String s = "ab";
        String p = "a.";
        boolean isMatch = re.isMatch(s, p);
        assert (isMatch);
    }

    @Test
    public void testMatchCase3()
    {
        RegularExpression re = new RegularExpression();
        String s = "aabbc";
        String p = "c*a*b*c";
        boolean isMatch = re.isMatch(s, p);
        assert (isMatch);
    }

    @Test
    public void testMatchCase4()
    {
        RegularExpression re = new RegularExpression();
        String s = "acc";
        String p = "a.*";
        boolean isMatch = re.isMatch(s, p);
        assert (isMatch);
    }

    @Test
    public void testMatchCase5()
    {
        RegularExpression re = new RegularExpression();
        String s = "a";
        String p = "a.*";
        boolean isMatch = re.isMatch(s, p);
        assert (isMatch);
    }

    @Test
    public void testMatchCase6()
    {
        RegularExpression re = new RegularExpression();
        String s = "abbbb";
        String p = "..*";
        boolean isMatch = re.isMatch(s, p);
        assert (isMatch);
    }

    @Test
    public void testMatchCase7()
    {
        RegularExpression re = new RegularExpression();
        String s = "";
        String p = "";
        boolean isMatch = re.isMatch(s, p);
        assert (isMatch);
    }


    @Test
    public void testMatchCase8()
    {
        RegularExpression re = new RegularExpression();
        String s = "ab";
        String p = ".*";
        boolean isMatch = re.isMatch(s, p);
        assert (isMatch);
    }

    @Test
    public void testMatchCase9()
    {
        RegularExpression re = new RegularExpression();
        String s = "aaa";
        String p = "ab*a*c*a";
        boolean isMatch = re.isMatch(s, p);
        assert (isMatch);
    }

    @Test
    public void testNotMatchCase1()
    {
        RegularExpression re = new RegularExpression();
        String s = "b";
        String p = "a";
        boolean isMatch = re.isMatch(s, p);
        assert (!isMatch);
    }

    @Test
    public void testNotMatchCase2()
    {
        RegularExpression re = new RegularExpression();
        String s = "a";
        String p = "a.";
        boolean isMatch = re.isMatch(s, p);
        assert (!isMatch);
    }

    @Test(expected = RegularExpression.InvalidArgumentException.class)
    public void testInvalidCase1()
    {
        RegularExpression re = new RegularExpression();
        String s = "ab";
        String p = "*ab";
        boolean isMatch = re.isMatch(s, p);
    }

    @Test(expected = RegularExpression.InvalidArgumentException.class)
    public void testInvalidCase2()
    {
        RegularExpression re = new RegularExpression();
        String s = "ab";
        String p = ".**ab";
        boolean isMatch = re.isMatch(s, p);
    }
}
