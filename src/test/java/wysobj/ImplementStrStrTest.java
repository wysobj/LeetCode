package wysobj;

import org.junit.Test;

public class ImplementStrStrTest
{
    @Test
    public void testCase1()
    {
        String haystack = "hello";
        String needle = "ll";
        ImplementStrStr iss = new ImplementStrStr();
        int index = iss.strStr(haystack, needle);
        assert (index == 2);
    }

    @Test
    public void testCase2()
    {
        String haystack = "hello world world";
        String needle = "world";
        ImplementStrStr iss = new ImplementStrStr();
        int index = iss.strStr(haystack, needle);
        assert (index == 6);
    }

    @Test
    public void testCase3()
    {
        String haystack = "aaaaa";
        String needle = "bba";
        ImplementStrStr iss = new ImplementStrStr();
        int index = iss.strStr(haystack, needle);
        assert (index == -1);
    }

    @Test
    public void testCase4()
    {
        String haystack = "";
        String needle = "bba";
        ImplementStrStr iss = new ImplementStrStr();
        int index = iss.strStr(haystack, needle);
        assert (index == -1);
    }

    @Test
    public void testCase5()
    {
        String haystack = "b";
        String needle = "bba";
        ImplementStrStr iss = new ImplementStrStr();
        int index = iss.strStr(haystack, needle);
        assert (index == -1);
    }

    @Test
    public void testCase6()
    {
        String haystack = null;
        String needle = "bba";
        ImplementStrStr iss = new ImplementStrStr();
        int index = iss.strStr(haystack, needle);
        assert (index == -1);
    }

    @Test
    public void testCase7()
    {
        String haystack = "aaa";
        String needle = null;
        ImplementStrStr iss = new ImplementStrStr();
        int index = iss.strStr(haystack, needle);
        assert (index == -1);
    }

    @Test
    public void testCase8()
    {
        String haystack = null;
        String needle = null;
        ImplementStrStr iss = new ImplementStrStr();
        int index = iss.strStr(haystack, needle);
        assert (index == -1);
    }

    @Test
    public void testCase9()
    {
        String haystack = "abc";
        String needle = "";
        ImplementStrStr iss = new ImplementStrStr();
        int index = iss.strStr(haystack, needle);
        assert (index == 0);
    }

    @Test
    public void testCase10()
    {
        String haystack = "a";
        String needle = "a";
        ImplementStrStr iss = new ImplementStrStr();
        int index = iss.strStr(haystack, needle);
        assert (index == 0);
    }

    @Test
    public void testCase11()
    {
        String haystack = "mississippi";
        String needle = "issip";
        ImplementStrStr iss = new ImplementStrStr();
        int index = iss.strStr(haystack, needle);
        assert (index == 4);
    }

    @Test
    public void testCase12()
    {
        String haystack = "aabaaabaaac";
        String needle =  "aabaaac";
        ImplementStrStr iss = new ImplementStrStr();
        int index = iss.strStr(haystack, needle);
        assert (index == 4);
    }
}
