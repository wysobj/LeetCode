package wysobj;

import org.junit.Test;

public class UniquePathsTest
{
    @Test
    public void testCase1()
    {
        int m = 3;
        int n = 2;
        UniquePaths up = new UniquePaths();
        int result = up.uniquePaths(m, n);
        assert (result == 3);
    }

    @Test
    public void testCase2()
    {
        int m = 7;
        int n = 3;
        UniquePaths up = new UniquePaths();
        int result = up.uniquePaths(m, n);
        assert (result == 28);
    }
}
