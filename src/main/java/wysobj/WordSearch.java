package wysobj;

public class WordSearch
{
    public boolean exist(char[][] board, String word)
    {
        if (board == null || board.length < 1 || board[0].length < 1)
        {
            return false;
        }
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                boolean exists = existsFromPosition(board, visited, i, j, 0, word);
                if (exists)
                {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean existsFromPosition(char[][] board, boolean[][] visited, int row, int col, int idx, String word)
    {
        if (idx == word.length())
        {
            return true;
        }
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length)
        {
            return false;
        }
        if (visited[row][col])
        {
            return false;
        }
        if (board[row][col] != word.charAt(idx))
        {
            return false;
        }
        visited[row][col] = true;
        boolean find = false;
        find = find || existsFromPosition(board, visited, row+1, col, idx+1, word);
        if (find)
        {
            return true;
        }
        find = find || existsFromPosition(board, visited, row-1, col, idx+1, word);
        if (find)
        {
            return true;
        }
        find = find || existsFromPosition(board, visited, row, col+1, idx+1, word);
        if (find)
        {
            return true;
        }
        find = find || existsFromPosition(board, visited, row, col-1, idx+1, word);
        visited[row][col] = false;
        return find;
    }
}
