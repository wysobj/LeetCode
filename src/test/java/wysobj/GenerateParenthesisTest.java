package wysobj;

import org.junit.Test;
import wysobj.GenerateParenthesis;

import java.util.List;

public class GenerateParenthesisTest
{
    @Test
    public void testGenerateParenthesisCase1()
    {
        final int n = 3;
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> result = gp.generateParenthesis(n);
        String[] benchMark = new String[]{"((()))", "(()())",
                                          "(())()", "()(())",
                                          "()()()"};
        for (String s : benchMark)
        {
            assert (result.contains(s));
        }
        assert (result.size() == benchMark.length);
    }

    @Test
    public void testGenerateParenthesisCase2()
    {
        final int n = 2;
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> result = gp.generateParenthesis(n);
        String[] benchMark = new String[]{"(())", "()()"};
        for (String s : benchMark)
        {
            assert (result.contains(s));
        }
        assert (result.size() == benchMark.length);
    }

    @Test
    public void testGenerateParenthesisCase3()
    {
        final int n = 1;
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> result = gp.generateParenthesis(n);
        String[] benchMark = new String[]{"()"};
        for (String s : benchMark)
        {
            assert (result.contains(s));
        }
        assert (result.size() == benchMark.length);
    }

    @Test
    public void testGenerateParenthesisCase4()
    {
        final int n = 0;
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> result = gp.generateParenthesis(n);
        String[] benchMark = new String[]{""};
        for (String s : benchMark)
        {
            assert (result.contains(s));
        }
        assert (result.size() == benchMark.length);
    }

    @Test
    public void testGenerateParenthesisCase5()
    {
        final int n = 4;
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> result = gp.generateParenthesis(n);
        String[] benchMark = new String[]{"(((())))", "((()()))", "((())())",
                                          "((()))()", "(()(()))", "(()()())",
                                          "(()())()", "(())(())", "(())()()",
                                          "()((()))", "()(()())", "()(())()",
                                          "()()(())", "()()()()"};
        for (String s : benchMark)
        {
            assert (result.contains(s));
        }
        assert (result.size() == benchMark.length);
    }
}
