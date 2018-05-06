package wysobj;

public class RotateImage
{
    public void rotate(int[][] matrix)
    {
        if (matrix == null || matrix.length < 2)
        {
            return;
        }
        int imageSize = matrix.length;
        rotate(matrix, 0, imageSize - 1);
    }

    private void rotate(int[][] matrix, int startIdx, int endIdx)
    {
        if (startIdx >= endIdx)
        {
            return;
        }
        for (int i = 0; i < endIdx - startIdx; i++)
        {
            int tmp = matrix[startIdx][startIdx + i];
            matrix[startIdx][startIdx + i] = matrix[endIdx - i][startIdx];
            matrix[endIdx - i][startIdx] = matrix[endIdx][endIdx - i];
            matrix[endIdx][endIdx - i] = matrix[startIdx + i][endIdx];
            matrix[startIdx + i][endIdx] = tmp;
        }
        rotate(matrix, startIdx + 1, endIdx - 1);
    }
}
