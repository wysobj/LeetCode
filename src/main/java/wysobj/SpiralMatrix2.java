package wysobj;

public class SpiralMatrix2
{
    public int[][] generateMatrix(int n)
    {
        if (n < 1)
        {
            return null;
        }
        int[][] result = new int[n][n];
        for (int layer = 0; layer <= n / 2; layer++)
        {
            fillSpiralLayer(result, layer);
        }
        return result;
    }

    private void fillSpiralLayer(int[][] matrix, int layer)
    {
        int n = matrix.length;
        int startIdx = layer;
        int endIdx = n - 1 - layer;
        int num = (2 * n - 2 * layer) * layer * 2 + 1;
        if (startIdx == endIdx)
        {
            matrix[startIdx][startIdx] = num;
        }
        else
        {
            int step = n - 1 - 2 * layer;
            for (int i = startIdx; i < endIdx; i++)
            {
                matrix[startIdx][i] = num;
                matrix[i][endIdx] = num + step;
                matrix[endIdx][n - 1 - i] = num + 2 * step;
                matrix[n - 1 - i][startIdx] = num + 3 * step;
                num++;
            }
        }
    }
}
