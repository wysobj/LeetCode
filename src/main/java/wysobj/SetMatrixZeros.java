package wysobj;

public class SetMatrixZeros
{
    public void setZeroes(int[][] matrix)
    {
        if (matrix == null)
        {
            return ;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowContainZero = false;
        boolean firstColContainZero = false;
        // label rows and cols containing zeros.
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if (i == 0)
                    {
                        firstRowContainZero = true;
                    }
                    if (j == 0)
                    {
                        firstColContainZero = true;
                    }
                }
            }
        }

        for (int i = 1; i < rows; i++)
        {
            if (matrix[i][0] == 0)
            {
                setRowToZeros(matrix, i);
            }
        }

        for (int j = 1; j < cols; j++)
        {
            if (matrix[0][j] == 0)
            {
                setColToZeros(matrix, j);
            }
        }

        if (firstRowContainZero)
        {
            setRowToZeros(matrix, 0);
        }

        if (firstColContainZero)
        {
            setColToZeros(matrix, 0);
        }
    }

    private void setRowToZeros(int[][] matrix, int rowIdx)
    {
        for (int i = 0; i < matrix[0].length; i++)
        {
            matrix[rowIdx][i] = 0;
        }
    }

    private void setColToZeros(int[][] matrix, int colIdx)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            matrix[i][colIdx] = 0;
        }
    }
}
