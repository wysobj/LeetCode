package wysobj;

import org.junit.Test;

public class SimplifiyPathTest
{
    @Test
    public void testCase1()
    {
        String path = "/home/";
        SimplifyPath sp = new SimplifyPath();
        String result = sp.simplifyPath(path);
        assert ("/home".equals(result));
    }

    @Test
    public void testCase2()
    {
        String path = "/a/./b/../../c/";
        SimplifyPath sp = new SimplifyPath();
        String result = sp.simplifyPath(path);
        assert ("/c".equals(result));
    }

    @Test
    public void testCase3()
    {
        String path = "/../";
        SimplifyPath sp = new SimplifyPath();
        String result = sp.simplifyPath(path);
        assert ("/".equals(result));
    }

    @Test
    public void testCase4()
    {
        String path = "/home//foo";
        SimplifyPath sp = new SimplifyPath();
        String result = sp.simplifyPath(path);
        assert ("/home/foo".equals(result));
    }
}
