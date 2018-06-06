package wysobj;

import org.junit.Test;

public class WordSearchTest
{
    @Test
    public void testCase1()
    {
        char[][] board = new char[][]{
                new char[]{'A', 'B', 'C', 'E'},
                new char[]{'S', 'F', 'C', 'S'},
                new char[]{'A', 'D', 'E', 'E'}
        };
        WordSearch ws = new WordSearch();
        String word1 = "ABCCED";
        assert (ws.exist(board, word1) == true);
        String word2 = "SEE";
        assert (ws.exist(board, word2) == true);
        String word3 = "ABCB";
        assert (ws.exist(board, word3) == false);
    }
}
