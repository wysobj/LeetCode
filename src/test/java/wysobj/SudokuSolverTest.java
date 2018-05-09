package wysobj;

import org.junit.Test;

public class SudokuSolverTest
{
    @Test
    public void testCase1()
    {
        ValidSudoku vs = new ValidSudoku();
        char[][] board = new char[][]{
                new char[]{'.', '.', '.', '.', '7', '.', '.', '.', '.'},
                new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        SudokuSolver ss = new SudokuSolver();
        ss.solveSudoku(board);
        boolean valid = vs.isValidSudoku(board);
        assert (valid);
        assertAllFilled(board);
    }

    @Test
    public void testCase2()
    {
        ValidSudoku vs = new ValidSudoku();
        char[][] board = new char[][]{
                new char[]{'.', '.', '9', '7', '4', '8', '.', '.', '.'},
                new char[]{'7', '.', '.', '.', '.', '.', '.', '.', '.'},
                new char[]{'.', '2', '.', '1', '.', '9', '.', '.', '.'},
                new char[]{'.', '.', '7', '.', '.', '.', '2', '4', '.'},
                new char[]{'.', '6', '4', '.', '1', '.', '5', '9', '.'},
                new char[]{'.', '9', '8', '.', '.', '.', '3', '.', '.'},
                new char[]{'.', '.', '.', '8', '.', '3', '.', '2', '.'},
                new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '6'},
                new char[]{'.', '.', '.', '2', '7', '5', '9', '.', '.'}
        };
        SudokuSolver ss = new SudokuSolver();
        ss.solveSudoku(board);
        boolean valid = vs.isValidSudoku(board);
        assert (valid);
        assertAllFilled(board);
    }

    private static final int ROWS = 9;
    private static final int COLS = 9;
    private void assertAllFilled(char[][] board)
    {
        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLS; j++)
            {
                assert (board[i][j] != '.');
            }
        }
    }
}
