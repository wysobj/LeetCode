package wysobj;

public class MinimumSumPaths
{
    public int minPathSum(int[][] grid)
    {
        if (grid == null)
        {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] sums = new int[rows][cols];
        sums[rows - 1][cols - 1] = grid[rows - 1][cols - 1];
        for (int row = rows - 1; row >= 0; row--)
        {
            for (int col = cols - 1; col >= 0; col--)
            {
                if (row == rows - 1 && col == cols - 1)
                {
                    continue;
                }
                int rightPathSum = row + 1 < rows ? sums[row+1][col] : Integer.MAX_VALUE;
                int downPathSum = col + 1 < cols ? sums[row][col+1] : Integer.MAX_VALUE;
                sums[row][col] = grid[row][col] + Math.min(rightPathSum, downPathSum);
            }
        }
        return sums[0][0];
    }
}
