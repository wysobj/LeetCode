package wysobj;

import org.junit.Test;

public class MinimumWindowSubstringTest
{
    @Test
    public void testCase1()
    {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        MinimumWindowSubstring mws = new MinimumWindowSubstring();
        String result = mws.minWindow(s, t);
        assert ("BANC".equals(result));
    }
}
