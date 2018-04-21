package wysobj;

import org.junit.Test;
import wysobj.LongestCommonPrefix;

public class LongestCommonPrefixTest {

    @Test
    public void testCase1()
    {
        LongestCommonPrefix lcp = new LongestCommonPrefix();

        String[] testStrs = new String[]{"abcd", "ab", "a"};
        String result = lcp.longestCommonPrefix(testStrs);
        assert ("a".equals(result));
    }

    @Test
    public void testCase2()
    {
        LongestCommonPrefix lcp = new LongestCommonPrefix();

        String[] testStrs = new String[]{"abcd", "bcd", "abc"};
        String result = lcp.longestCommonPrefix(testStrs);
        assert ("".equals(result));
    }

    @Test
    public void testCase3()
    {
        LongestCommonPrefix lcp = new LongestCommonPrefix();

        String[] testStrs = new String[]{"abcd", "bcd", ""};
        String result = lcp.longestCommonPrefix(testStrs);
        assert ("".equals(result));
    }

    @Test
    public void testCase4()
    {
        LongestCommonPrefix lcp = new LongestCommonPrefix();

        String[] testStrs = new String[]{};
        String result = lcp.longestCommonPrefix(testStrs);
        assert ("".equals(result));
    }

    @Test(expected = LongestCommonPrefix.InvalidArgumentException.class)
    public void testCase5()
    {
        LongestCommonPrefix lcp = new LongestCommonPrefix();

        String[] testStrs = new String[]{"abcd", "bcd", null};
        String result = lcp.longestCommonPrefix(testStrs);
    }
}
