package wysobj;

import org.junit.Test;

public class LongestValidParenthesesTest
{
    @Test
    public void testCase1()
    {
        String str = "(()";
        LongestValidParentheses lvp = new LongestValidParentheses();
        int result = lvp.longestValidParentheses(str);
        assert (result == 2);
    }

    @Test
    public void testCase2()
    {
        String str = "())";
        LongestValidParentheses lvp = new LongestValidParentheses();
        int result = lvp.longestValidParentheses(str);
        assert (result == 2);
    }

    @Test
    public void testCase3()
    {
        String str = "(()))()";
        LongestValidParentheses lvp = new LongestValidParentheses();
        int result = lvp.longestValidParentheses(str);
        assert (result == 4);
    }

    @Test
    public void testCase4()
    {
        String str = "(())())()()(())(()()()()()";
        LongestValidParentheses lvp = new LongestValidParentheses();
        int result = lvp.longestValidParentheses(str);
        assert (result == 10);
    }

    @Test
    public void testCase5()
    {
        String str = "(())())()()(())(()()()";
        LongestValidParentheses lvp = new LongestValidParentheses();
        int result = lvp.longestValidParentheses(str);
        assert (result == 8);
    }

    @Test
    public void testCase6()
    {
        String str = "";
        LongestValidParentheses lvp = new LongestValidParentheses();
        int result = lvp.longestValidParentheses(str);
        assert (result == 0);
    }

    @Test
    public void testCase7()
    {
        String str = "(";
        LongestValidParentheses lvp = new LongestValidParentheses();
        int result = lvp.longestValidParentheses(str);
        assert (result == 0);
    }

    @Test
    public void testCase8()
    {
        String str = ")";
        LongestValidParentheses lvp = new LongestValidParentheses();
        int result = lvp.longestValidParentheses(str);
        assert (result == 0);
    }

    @Test
    public void testCase9()
    {
        String str = ")(";
        LongestValidParentheses lvp = new LongestValidParentheses();
        int result = lvp.longestValidParentheses(str);
        assert (result == 0);
    }

    @Test
    public void testCase10()
    {
        String str = null;
        LongestValidParentheses lvp = new LongestValidParentheses();
        int result = lvp.longestValidParentheses(str);
        assert (result == 0);
    }
}
