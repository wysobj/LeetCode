package wysobj;

import org.junit.Test;

public class WildcardMatchingTest
{
    @Test
    public void testCase1()
    {
        String s = "aa";
        String p = "a";
        WildcardMatching wm = new WildcardMatching();
        boolean result = wm.isMatch(s, p);
        assert (result == false);
    }

    @Test
    public void testCase2()
    {
        String s = "aa";
        String p = "*";
        WildcardMatching wm = new WildcardMatching();
        boolean result = wm.isMatch(s, p);
        assert (result == true);
    }

    @Test
    public void testCase3()
    {
        String s = "cb";
        String p = "?a";
        WildcardMatching wm = new WildcardMatching();
        boolean result = wm.isMatch(s, p);
        assert (result == false);
    }

    @Test
    public void testCase4()
    {
        String s = "adceb";
        String p = "*a*b";
        WildcardMatching wm = new WildcardMatching();
        boolean result = wm.isMatch(s, p);
        assert (result == true);
    }

    @Test
    public void testCase5()
    {
        String s = "acdcb";
        String p = "a*c?b";
        WildcardMatching wm = new WildcardMatching();
        boolean result = wm.isMatch(s, p);
        assert (result == false);
    }

    @Test
    public void testCase6()
    {
        String s = "acdcb";
        String p = "";
        WildcardMatching wm = new WildcardMatching();
        boolean result = wm.isMatch(s, p);
        assert (result == false);
    }

    @Test
    public void testCase7()
    {
        String s = "";
        String p = "*";
        WildcardMatching wm = new WildcardMatching();
        boolean result = wm.isMatch(s, p);
        assert (result == true);
    }

    @Test
    public void testCase8()
    {
        String s = "";
        String p = "";
        WildcardMatching wm = new WildcardMatching();
        boolean result = wm.isMatch(s, p);
        assert (result == true);
    }

    @Test
    public void testCase9()
    {
        String s = "ab";
        String p = "**ab";
        WildcardMatching wm = new WildcardMatching();
        boolean result = wm.isMatch(s, p);
        assert (result == true);
    }

    @Test
    public void testCase10()
    {
        String s = "aab";
        String p = "c*a*b";
        WildcardMatching wm = new WildcardMatching();
        boolean result = wm.isMatch(s, p);
        assert (result == false);
    }
}
