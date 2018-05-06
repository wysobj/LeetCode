package wysobj;

import org.junit.Test;

import java.util.Iterator;

public class SpiralMatrix2Test
{
    @Test
    public void testCase1()
    {
        SpiralMatrix2 sm = new SpiralMatrix2();
        int n = 1;
        int[][] result = sm.generateMatrix(n);
        MatrixIterator mi = new MatrixIterator(result);
        int benchMark = 1;
        while (mi.hasNext())
        {
            assert (mi.next() == benchMark);
            ++benchMark;
        }
    }

    @Test
    public void testCase2()
    {
        SpiralMatrix2 sm = new SpiralMatrix2();
        int n = 2;
        int[][] result = sm.generateMatrix(n);
        MatrixIterator mi = new MatrixIterator(result);
        int benchMark = 1;
        while (mi.hasNext())
        {
            assert (mi.next() == benchMark);
            ++benchMark;
        }
    }

    @Test
    public void testCase3()
    {
        SpiralMatrix2 sm = new SpiralMatrix2();
        int n = 3;
        int[][] result = sm.generateMatrix(n);
        MatrixIterator mi = new MatrixIterator(result);
        int benchMark = 1;
        while (mi.hasNext())
        {
            assert (mi.next() == benchMark);
            ++benchMark;
        }
    }

    @Test
    public void testCase4()
    {
        SpiralMatrix2 sm = new SpiralMatrix2();
        int n = 4;
        int[][] result = sm.generateMatrix(n);
        MatrixIterator mi = new MatrixIterator(result);
        int benchMark = 1;
        while (mi.hasNext())
        {
            assert (mi.next() == benchMark);
            ++benchMark;
        }
    }

    @Test
    public void testCase5()
    {
        SpiralMatrix2 sm = new SpiralMatrix2();
        int n = 5;
        int[][] result = sm.generateMatrix(n);
        MatrixIterator mi = new MatrixIterator(result);
        int benchMark = 1;
        while (mi.hasNext())
        {
            assert (mi.next() == benchMark);
            ++benchMark;
        }
    }

    @Test
    public void testMatrixIterator1()
    {
        int[][] matrix = new int[][] {
                new int[]{1, 2, 3},
                new int[]{8, 9, 4},
                new int[]{7, 6, 5}
        };
        MatrixIterator mi = new MatrixIterator(matrix);
        for (int i = 1; i <= 9; i++)
        {
            assert (mi.hasNext());
            assert (mi.next() == i);
        }
        assert (mi.hasNext() == false);
    }

    @Test
    public void testMatrixIterator2()
    {
        int[][] matrix = new int[][] {
                new int[]{1, 2},
                new int[]{4, 3},
        };
        MatrixIterator mi = new MatrixIterator(matrix);
        for (int i = 1; i <= 4; i++)
        {
            assert (mi.hasNext());
            assert (mi.next() == i);
        }
        assert (mi.hasNext() == false);
    }

    @Test
    public void testMatrixIterator3()
    {
        int[][] matrix = new int[][] {
                new int[]{1},
        };
        MatrixIterator mi = new MatrixIterator(matrix);
        for (int i = 1; i <= 1; i++)
        {
            assert (mi.hasNext());
            assert (mi.next() == i);
        }
        assert (mi.hasNext() == false);
    }

    private static class MatrixIterator implements Iterator<Integer>
    {
        private int[][] matrix;
        private int rowCursor;
        private int colCursor;
        private Direction direction = Direction.RIGHT;
        private int layer;
        private int n;
        private int visited;

        public MatrixIterator(int[][] matrix)
        {
            this.matrix = matrix;
            if (this.matrix != null)
            {
                this.n = this.matrix.length;
            }
        }

        public boolean hasNext()
        {
            if (this.matrix == null)
            {
                return false;
            }
            return this.visited < n * n;
        }

        public Integer next()
        {
            int result = matrix[this.rowCursor][this.colCursor];
            ++this.visited;
            switch (this.direction)
            {
                case RIGHT :
                    if (this.colCursor == n - 1 - this.layer)
                    {
                        this.direction = Direction.DOWN;
                        ++this.rowCursor;
                    }
                    else
                    {
                        ++this.colCursor;
                    }
                break;
                case DOWN :
                    if (this.rowCursor == n - 1 - this.layer)
                    {
                        this.direction = Direction.LEFT;
                        --this.colCursor;
                    }
                    else
                    {
                        ++this.rowCursor;
                    }
                break;
                case LEFT :
                    if (this.colCursor == this.layer)
                    {
                        this.direction = Direction.UP;
                        --this.rowCursor;
                    }
                    else
                    {
                        --this.colCursor;
                    }
                break;
                case UP :
                    if (this.rowCursor == layer + 1)
                    {
                        this.direction = Direction.RIGHT;
                        ++this.colCursor;
                        ++this.layer;
                    }
                    else
                    {
                        --this.rowCursor;
                    }
            }
            return result;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private enum Direction
        {
            RIGHT, LEFT, DOWN, UP;
        }
    }
}
