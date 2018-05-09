package wysobj;

import org.junit.Test;

public class MinimumSumPathsTest
{
    @Test
    public void testCase1()
    {
        int[][] grid = new int[][]{
            new int[]{1, 3, 1},
            new int[]{1, 5, 1},
            new int[]{4, 2, 1},
        };
        MinimumSumPaths msp = new MinimumSumPaths();
        int result = msp.minPathSum(grid);
        assert (result == 7);
    }
}
