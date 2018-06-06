package wysobj;

import org.junit.Test;

public class ScrambleStringTest
{
    @Test
    public void testCase1()
    {
        String s1 = "great";
        String s2 = "rgeat";
        ScrambleString ss = new ScrambleString();
        boolean result = ss.isScramble(s1, s2);
        assert (result == true);
    }

    @Test
    public void testCase2()
    {
        String s1 = "abcde";
        String s2 = "caebd";
        ScrambleString ss = new ScrambleString();
        boolean result = ss.isScramble(s1, s2);
        assert (result == false);
    }

    @Test
    public void testCase3()
    {
        String s1 = "abcdefghijklmnopq";
        String s2 = "efghijklmnopqcadb";
        ScrambleString ss = new ScrambleString();
        boolean result = ss.isScramble(s1, s2);
        assert (result == false);
    }
}
