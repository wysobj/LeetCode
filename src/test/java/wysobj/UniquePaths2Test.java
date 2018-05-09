package wysobj;

import org.junit.Test;

public class UniquePaths2Test
{
    @Test
    public void testCase1()
    {
        int[][] obstacles = new int[][]{
                new int[]{0, 0, 0},
                new int[]{0, 1, 0},
                new int[]{0, 0, 0}
        };
        UniquePaths2 np = new UniquePaths2();
        int result = np.uniquePathsWithObstacles(obstacles);
        assert (result == 2);
    }
}
