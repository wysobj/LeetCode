package wysobj;

import org.junit.Test;

public class SearchIn2DMatrixTest
{
    @Test
    public void testCase1()
    {
        int[][] matrix = new int[][]{
                new int[]{1, 3, 5, 7},
                new int[]{10, 11, 16, 20},
                new int[]{23, 30, 34, 50}
        };
        int target = 3;
        SearchIn2DMatrix sim = new SearchIn2DMatrix();
        boolean result = sim.searchMatrix(matrix ,target);
        assert (result == true);
    }

    @Test
    public void testCase2()
    {
        int[][] matrix = new int[][]{
                new int[]{1, 3, 5, 7},
                new int[]{10, 11, 16, 20},
                new int[]{23, 30, 34, 50}
        };
        int target = 13;
        SearchIn2DMatrix sim = new SearchIn2DMatrix();
        boolean result = sim.searchMatrix(matrix ,target);
        assert (result == false);
    }

    @Test
    public void testCase3()
    {
        int[][] matrix = new int[][]{
                new int[]{1, 1}
        };
        int target = 2;
        SearchIn2DMatrix sim = new SearchIn2DMatrix();
        boolean result = sim.searchMatrix(matrix ,target);
        assert (result == false);
    }
}
