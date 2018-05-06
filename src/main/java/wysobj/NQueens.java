package wysobj;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class NQueens
{
    public List<List<String>> solveNQueens(int n)
    {
        List<List<String>> results = new LinkedList<List<String>>();
        if (n < 1)
        {
            return results;
        }
        BoardRecorder br = new BoardRecorder(n);
        solve(n, 0, br, results);
        return results;
    }

    private void solve(int n, int row, BoardRecorder br, List<List<String>> results)
    {
        for (int column = 0; column < n; column++)
        {
            boolean stepValid = br.step(row, column);
            if (stepValid)
            {
                if (br.solved())
                {
                    results.add(br.dumpBoard());
                }
                else
                {
                    solve(n, row + 1, br, results);
                }
                br.regret();
            }
        }
    }

    private static class BoardRecorder
    {
        private Set<Integer> rowRecords = new HashSet<Integer>();
        private Set<Integer> columnRecords = new HashSet<Integer>();
        private Set<Integer> leftUpToRightDownRecords = new HashSet<Integer>();
        private Set<Integer> rightUpToLeftDownRecords = new HashSet<Integer>();
        private LinkedList<Integer> stepRecords = new LinkedList<Integer>();
        private int n;

        public BoardRecorder(int n)
        {
            this.n = n;
        }

        public boolean step(int row, int column)
        {
            if (this.rowRecords.contains(row) || this.columnRecords.contains(column))
            {
                return false;
            }
            int rowSubCol = row - column;
            int rowAddCol = row + column;
            if (this.leftUpToRightDownRecords.contains(rowSubCol) || this.rightUpToLeftDownRecords.contains(rowAddCol))
            {
                return false;
            }
            this.rowRecords.add(row);
            this.columnRecords.add(column);
            this.leftUpToRightDownRecords.add(rowSubCol);
            this.rightUpToLeftDownRecords.add(rowAddCol);
            this.stepRecords.add(column);
            return true;
        }

        public void regret()
        {
            int column = this.stepRecords.removeLast();
            int row = this.stepRecords.size();
            int rowSubCol = row - column;
            int rowAddCol = row + column;
            this.rowRecords.remove(row);
            this.columnRecords.remove(column);
            this.leftUpToRightDownRecords.remove(rowSubCol);
            this.rightUpToLeftDownRecords.remove(rowAddCol);
        }

        public boolean solved()
        {
            return this.stepRecords.size() == this.n;
        }

        public List<String> dumpBoard()
        {
            List<String> board = new LinkedList<String>();
            for (int i = 0; i < this.n; i++)
            {
                int column = this.stepRecords.get(i);
                String row = drawDots(column) + "Q" + drawDots(this.n - column - 1);
                board.add(row);
            }
            return board;
        }

        private String drawDots(int length)
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++)
            {
                sb.append('.');
            }
            return sb.toString();
        }
    }
}
