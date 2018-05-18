package wysobj;

import org.junit.Test;

public class ClimbingStairsTest
{
    @Test
    public void testCase1()
    {
        int n = 2;
        ClimbingStairs cs = new ClimbingStairs();
        int result = cs.climbStairs(n);
        assert (result == 2);
    }

    @Test
    public void testCase2()
    {
        int n = 3;
        ClimbingStairs cs = new ClimbingStairs();
        int result = cs.climbStairs(n);
        assert (result == 3);
    }

    @Test
    public void testCase3()
    {
        int n = 10;
        ClimbingStairs cs = new ClimbingStairs();
        int result = cs.climbStairs(n);
        assert (result == 89);
    }
}
