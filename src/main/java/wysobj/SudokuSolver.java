package wysobj;

import java.util.*;

public class SudokuSolver
{
    private static final int ROW_MAX = 9;
    private static final int COL_MAX = 9;
    private static final int STEP = 3;
    private static final char UNFILLED_CHAR = '.';
    private SudokuBoardWalker walker;
    public void solveSudoku(char[][] board)
    {
        this.walker = new SudokuBoardWalker(board);
        Map<Coord, Set<Character>> validDigitsInCells = new HashMap<Coord, Set<Character>>();
        for (int i = 0; i < ROW_MAX; i++)
        {
            for (int j = 0; j < COL_MAX; j++)
            {
                if (board[i][j] == UNFILLED_CHAR)
                {
                    Coord coordIJ = new Coord(i, j);
                    ValidDigitsInCellCollector collector = new ValidDigitsInCellCollector();
                    this.walker.walk(coordIJ, collector);
                    Set<Character> validDigitsAtCell = collector.getValidDigits();
                    validDigitsInCells.put(coordIJ, validDigitsAtCell);
                }
            }
        }
        fillNextCell(board, validDigitsInCells, validDigitsInCells.size());
    }

    private class ValidDigitsInCellCollector implements CellProcessor
    {
        Set<Character> validDigits = createInitCharSet();

        public void process(char[][] board, Coord coord)
        {
            if (board[coord.row][coord.col] != UNFILLED_CHAR)
            {
                validDigits.remove(board[coord.row][coord.col]);
            }
        }

        public Set<Character> getValidDigits()
        {
            return this.validDigits;
        }

        private Set<Character> createInitCharSet()
        {
            return new HashSet<Character>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
        }
    }

    private boolean fillNextCell(char[][] board, Map<Coord, Set<Character>> valids, int remainSteps)
    {
        if (remainSteps == 0)
        {
            return true;
        }
        Coord nextFilledCoord = findMinEntropyUnfilledCellCoord(board, valids);
        if (nextFilledCoord == null)
        {
            return false;
        }
        Set<Character> validDigits = valids.get(nextFilledCoord);
        for (char vd : validDigits)
        {
            board[nextFilledCoord.row][nextFilledCoord.col] = vd;
            FillDigitProcessor filledProcessor = new FillDigitProcessor(nextFilledCoord, valids);
            this.walker.walk(nextFilledCoord, filledProcessor);
            boolean nextStepSuccess = fillNextCell(board, valids, remainSteps - 1);
            if (nextStepSuccess)
            {
                return true;
            }
            else
            {
                filledProcessor.erase(board, nextFilledCoord);
            }
        }
        return false;
    }

    private static class FillDigitProcessor implements CellProcessor
    {
        private List<Set<Character>> influncedCells = new LinkedList<Set<Character>>();
        private Coord filledCoord;
        private Map<Coord, Set<Character>> validDigitsForCells;

        public FillDigitProcessor(Coord filledCoord, Map<Coord, Set<Character>> validDigitsForCells)
        {
            this.filledCoord = filledCoord;
            this.validDigitsForCells = validDigitsForCells;
        }

        public void process(char[][] board, Coord coord)
        {
            int row = coord.row;
            int col = coord.col;
            char filledChar = board[this.filledCoord.row][this.filledCoord.col];
            if (board[row][col] == UNFILLED_CHAR) {
                Set<Character> validDigitsForCell = this.validDigitsForCells.get(coord);
                if (validDigitsForCell.contains(filledChar))
                {
                    influncedCells.add(validDigitsForCell);
                    validDigitsForCell.remove(filledChar);
                }
            }
        }

        public void erase(char[][] board, Coord coord)
        {
            char digit = board[coord.row][coord.col];
            board[coord.row][coord.col] = UNFILLED_CHAR;
            for (Set<Character> ic : influncedCells)
            {
                ic.add(digit);
            }
        }
    }

    private Coord findMinEntropyUnfilledCellCoord(char[][] board, Map<Coord, Set<Character>> valids)
    {
        Coord minEntropyCoord = null;
        for (Map.Entry<Coord, Set<Character>> entry : valids.entrySet())
        {
            Coord coord = entry.getKey();
            boolean isCellFilled = board[coord.row][coord.col] != UNFILLED_CHAR;
            if (isCellFilled)
            {
                continue;
            }
            Set<Character> validDigits = entry.getValue();
            if (validDigits.size() == 0)
            {
                continue;
            }
            if (minEntropyCoord == null || validDigits.size() < valids.get(minEntropyCoord).size())
            {
                minEntropyCoord = coord;
            }
        }
        return minEntropyCoord;
    }

    private static class SudokuBoardWalker
    {
        private char[][] sudokuBoard;

        public SudokuBoardWalker(char[][] sudokuBoard)
        {
            this.sudokuBoard = sudokuBoard;
        }

        public void walk(Coord coord, CellProcessor processor)
        {
            int row = coord.row;
            int col = coord.col;
            Coord curRowLeftTop = new Coord(row, 0);
            Coord curRowRightBottom = new Coord(row, COL_MAX - 1);
            walkInRectangle(curRowLeftTop, curRowRightBottom, processor);

            Coord curColLeftTop = new Coord(0, col);
            Coord curColRightBottom = new Coord(ROW_MAX - 1, col);
            walkInRectangle(curColLeftTop, curColRightBottom, processor);

            Coord curBoxLeftTop = new Coord(row / STEP * STEP, col / STEP * STEP);
            Coord curBoxRightBottom = new Coord(row / STEP * STEP + STEP - 1, col / STEP * STEP + STEP - 1);
            walkInRectangle(curBoxLeftTop, curBoxRightBottom, processor);
        }

        private void walkInRectangle(Coord leftTop, Coord rightBottom, CellProcessor processor)
        {
            int leftTopRow = leftTop.row;
            int leftTopCol = leftTop.col;
            int rightBottomRow = rightBottom.row;
            int rightBottomCol = rightBottom.col;
            for (int i = leftTopRow; i <= rightBottomRow; i++)
            {
                for (int j = leftTopCol; j <= rightBottomCol; j++)
                {
                    Coord coordIJ = new Coord(i, j);
                    processor.process(this.sudokuBoard, coordIJ);
                }
            }
        }
    }

    private interface CellProcessor
    {
        void process(char[][] board, Coord coord);
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

        public boolean equals(Object o)
        {
            if (o == null || !(o instanceof Coord))
            {
                return false;
            }
            Coord other = (Coord)o;
            return this.row == other.row && this.col == other.col;
        }

        @Override
        public int hashCode()
        {
            return 200001 * this.row + col;
        }
    }
}
