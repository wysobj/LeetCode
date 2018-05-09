package wysobj;

public class UniquePaths
{
    // dynamic method
    public int uniquePaths(int m, int n)
    {
        int[][] counts = new int[m][n];
        counts[m - 1][n - 1] = 1;
        for (int row = m - 1; row >= 0; row--)
        {
            for (int col = n - 1; col >= 0; col--)
            {
                if (row == m - 1 && col == n - 1)
                {
                    continue;
                }
                int count = 0;
                count = row + 1 < m ? count + counts[row + 1][col] : count;
                count = col + 1 < n ? count + counts[row][col + 1] : count;
                counts[row][col] = count;
            }
        }
        return counts[0][0];
    }

    // recursive method  solve by call uniquePaths(m, n, 1, 1)
    private int uniquePaths(int m, int n, int row, int col)
    {
        if (row > m || col > n)
        {
            return 0;
        }
        if (row == m && col == n)
        {
            return 1;
        }
        return uniquePaths(m, n, row+1, col) + uniquePaths(m, n, row, col+1);
    }
}
