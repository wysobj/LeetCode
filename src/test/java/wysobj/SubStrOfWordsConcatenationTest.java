package wysobj;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SubStrOfWordsConcatenationTest
{
    @Test
    public void testCase1()
    {
        List<Integer> benchMark = Arrays.asList(0, 9);
        String s = "barfoothefoobarman";
        String[] words = new String[]{"foo","bar"};
        SubStrOfWordsConcatenation sswc = new SubStrOfWordsConcatenation();
        List<Integer> result = sswc.findSubstring(s, words);
        assert (benchMark.equals(result));
    }

    @Test
    public void testCase2()
    {
        List<Integer> benchMark = Arrays.asList(6, 9, 12);
        String s = "barfoofoobarthefoobarman";
        String[] words = new String[]{"bar", "foo","the"};
        SubStrOfWordsConcatenation sswc = new SubStrOfWordsConcatenation();
        List<Integer> result = sswc.findSubstring(s, words);
        assert (benchMark.equals(result));
    }

    @Test
    public void testCase3()
    {
        List<Integer> benchMark = Arrays.asList(0, 1, 2);
        String s = "aaaaaaaa";
        String[] words = new String[]{"aa", "aa","aa"};
        SubStrOfWordsConcatenation sswc = new SubStrOfWordsConcatenation();
        List<Integer> result = sswc.findSubstring(s, words);
        assert (benchMark.equals(result));
    }

    @Test
    public void testCase4()
    {
        List<Integer> benchMark = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7);
        String s = "aaaaaaaa";
        String[] words = new String[]{""};
        SubStrOfWordsConcatenation sswc = new SubStrOfWordsConcatenation();
        List<Integer> result = sswc.findSubstring(s, words);
        assert (benchMark.equals(result));
    }

    @Test
    public void testCase5()
    {
        List<Integer> benchMark = Arrays.asList();
        String s = "";
        String[] words = new String[]{"aa"};
        SubStrOfWordsConcatenation sswc = new SubStrOfWordsConcatenation();
        List<Integer> result = sswc.findSubstring(s, words);
        assert (benchMark.equals(result));
    }

    @Test
    public void testCase6()
    {
        List<Integer> benchMark = Arrays.asList();
        String s = null;
        String[] words = new String[]{"aa"};
        SubStrOfWordsConcatenation sswc = new SubStrOfWordsConcatenation();
        List<Integer> result = sswc.findSubstring(s, words);
        assert (benchMark.equals(result));
    }

    @Test
    public void testCase7()
    {
        List<Integer> benchMark = Arrays.asList();
        String s = null;
        String[] words = null;
        SubStrOfWordsConcatenation sswc = new SubStrOfWordsConcatenation();
        List<Integer> result = sswc.findSubstring(s, words);
        assert (benchMark.equals(result));
    }
}
