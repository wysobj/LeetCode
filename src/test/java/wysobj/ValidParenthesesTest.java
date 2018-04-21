package wysobj;

import org.junit.Test;
import wysobj.ValidParentheses;

public class ValidParenthesesTest
{
    @Test
    public void testValidCase1()
    {
        String str = "()";
        ValidParentheses vp = new ValidParentheses();
        boolean result = vp.isValid(str);
        assert (result == true);
    }

    @Test
    public void testValidCase2()
    {
        String str = "()[]{}";
        ValidParentheses vp = new ValidParentheses();
        boolean result = vp.isValid(str);
        assert (result == true);
    }

    @Test
    public void testValidCase3()
    {
        String str = "{[()]}";
        ValidParentheses vp = new ValidParentheses();
        boolean result = vp.isValid(str);
        assert (result == true);
    }

    @Test
    public void testInValidCase1()
    {
        String str = "(]";
        ValidParentheses vp = new ValidParentheses();
        boolean result = vp.isValid(str);
        assert (result == false);
    }

    @Test
    public void testInValidCase2()
    {
        String str = "[(}]";
        ValidParentheses vp = new ValidParentheses();
        boolean result = vp.isValid(str);
        assert (result == false);
    }

    @Test
    public void testEmpty()
    {
        String str = "";
        ValidParentheses vp = new ValidParentheses();
        boolean result = vp.isValid(str);
        assert (result == true);
    }

    @Test
    public void testNull()
    {
        String str = null;
        ValidParentheses vp = new ValidParentheses();
        boolean result = vp.isValid(str);
        assert (result == false);
    }
}
