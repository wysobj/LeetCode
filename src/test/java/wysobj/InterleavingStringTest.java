package wysobj;

import org.junit.Test;

public class InterleavingStringTest
{
    @Test
    public void testCase1()
    {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        InterleavingString is = new InterleavingString();
        boolean result = is.isInterleave(s1, s2, s3);
        assert (result == true);
    }

    @Test
    public void testCase2()
    {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        InterleavingString is = new InterleavingString();
        boolean result = is.isInterleave(s1, s2, s3);
        assert (result == false);
    }

    @Test
    public void testCase3()
    {
        String s1 = "a";
        String s2 = "";
        String s3 = "a";
        InterleavingString is = new InterleavingString();
        boolean result = is.isInterleave(s1, s2, s3);
        assert (result == true);
    }
}
