package wysobj;

import org.junit.Test;

public class SetMatrixZerosTest
{
    @Test
    public void testCase1()
    {
        int[][] matrix = new int[][]{
                new int[]{1, 1, 1},
                new int[]{1, 0, 1},
                new int[]{1, 1, 1}
        };
        SetMatrixZeros smz = new SetMatrixZeros();
        smz.setZeroes(matrix);
        int[][] benchmark = new int[][]{
                new int[]{1, 0, 1},
                new int[]{0, 0, 0},
                new int[]{1, 0, 1}
        };
        assertMatrxEqual(matrix, benchmark);
    }

    @Test
    public void testCase2()
    {
        int[][] matrix = new int[][]{
                new int[]{0, 1, 2, 0},
                new int[]{3, 4, 5, 2},
                new int[]{1, 3, 1, 5}
        };
        SetMatrixZeros smz = new SetMatrixZeros();
        smz.setZeroes(matrix);
        int[][] benchmark = new int[][]{
                new int[]{0, 0, 0, 0},
                new int[]{0, 4, 5, 0},
                new int[]{0, 3, 1, 0}
        };
        assertMatrxEqual(matrix, benchmark);
    }

    private void assertMatrxEqual(int[][] matrix1, int[][] matrix2)
    {
        assert (matrix1 != null && matrix2 != null);
        assert (matrix1.length == matrix2.length);
        assert (matrix1[0].length == matrix2[0].length);
        int rows = matrix1.length;
        int cols = matrix2.length;
        for (int row = 0; row < rows; row++)
        {
            for (int col = 0; col < cols; col++)
            {
                assert (matrix1[row][col] == matrix2[row][col]);
            }
        }
    }
}
