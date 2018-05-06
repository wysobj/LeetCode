package wysobj;

import org.junit.Test;

import java.util.List;

public class NQueensTest
{
    @Test
    public void testCase1()
    {
        int n = 1;
        NQueens nq = new NQueens();
        List<List<String>> result = nq.solveNQueens(n);
        System.out.println(result);
    }
}
