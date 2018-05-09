package wysobj;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku
{
    private static final int ROW_MAX = 9;
    private static final int COL_MAX = 9;
    private static final int STEP = 3;
    public boolean isValidSudoku(char[][] board)
    {
        if (board == null)
        {
            return false;
        }
        boolean result = true;
        for (int row = 0; row < ROW_MAX; row++)
        {
            Coord leftTop = new Coord(row, 0);
            Coord rightBottom = new Coord(row, COL_MAX - 1);
            result = result && isValidSodokuInRectangleRange(board, leftTop, rightBottom);
        }

        for (int col = 0; col < COL_MAX; col++)
        {
            Coord leftTop = new Coord(0, col);
            Coord rightBottom = new Coord(ROW_MAX - 1, col);
            result = result && isValidSodokuInRectangleRange(board, leftTop, rightBottom);
        }

        for (int row = 0; row < ROW_MAX; row += STEP)
        {
            for (int col = 0; col < COL_MAX; col += STEP)
            {
                Coord leftTop = new Coord(row, col);
                Coord rightBottom = new Coord(row + STEP - 1, col + STEP - 1);
                result = result && isValidSodokuInRectangleRange(board, leftTop, rightBottom);
            }
        }
        return result;
    }

    private boolean isValidSodokuInRectangleRange(char[][] board, Coord leftTop, Coord rightBottom)
    {
        int leftTopRow = leftTop.row;
        int leftTopCol = leftTop.col;
        int rightBottomRow = rightBottom.row;
        int rightBottomCol = rightBottom.col;
        int boxHeight = rightBottomRow - leftTopRow + 1;
        int boxWidth = rightBottomCol - leftTopCol + 1;
        assert (boxWidth > 0 && boxWidth > 0);
        assert (boxWidth * boxHeight == 9);
        Set<Character> set = new HashSet<Character>();
        for (int i = leftTopRow; i <= rightBottomRow; i++)
        {
            for (int j = leftTopCol; j <= rightBottomCol; j++)
            {
                char c = board[i][j];
                if (c == '.')
                {
                    continue;
                }
                if (set.contains(c))
                {
                    return false;
                }
                set.add(c);
            }
        }
        return true;
    }

    private static class Coord
    {
        private int row;
        private int col;

        public Coord(int row, int col)
        {
            this.row = row;
            this.col = col;
        }
    }
}
