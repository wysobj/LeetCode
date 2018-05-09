package wysobj;

public class UniquePaths2
{
    public int uniquePathsWithObstacles(int[][] obstacleGrid)
    {
        if (obstacleGrid == null)
        {
            return 0;
        }
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[][] counts = new int[rows][cols];
        if (obstacleGrid[rows-1][cols-1] == 1)
        {
            return 0;
        }
        counts[rows-1][cols-1] = 1;
        for (int row = rows - 1; row >= 0; row--)
        {
            for (int col = cols - 1; col >= 0; col--)
            {
                if (row == rows - 1 && col == cols - 1)
                {
                    continue;
                }
                if (obstacleGrid[row][col] == 1)
                {
                    continue;
                }
                int downPaths = row + 1 < rows ? counts[row+1][col] : 0;
                int rightPaths = col + 1 < cols ? counts[row][col+1] : 0;
                counts[row][col] = downPaths + rightPaths;
            }
        }
        return counts[0][0];
    }
}
