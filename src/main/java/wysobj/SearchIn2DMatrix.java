package wysobj;

public class SearchIn2DMatrix
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return false;
        }
        int[] firstCol = extractFirstCol(matrix);
        int rowIdx = binarySearch(firstCol, target);
        int colIdx = binarySearch(matrix[rowIdx], target);
        return matrix[rowIdx][colIdx] == target;
    }

    private int[] extractFirstCol(int[][] matrix)
    {
        int length = matrix.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++)
        {
            result[i] = matrix[i][0];
        }
        return result;
    }

    private int binarySearch(int[] array, int target)
    {
        int start = 0;
        int end = array.length;
        while (start < (end - 1))
        {
            int middle = (start + end) / 2;
            if (array[middle] == target)
            {
                return middle;
            }
            else if (array[middle] < target)
            {
                start = middle;
            }
            else
            {
                end = middle;
            }
        }
        return start;
    }
}
