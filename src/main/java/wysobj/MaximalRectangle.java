package wysobj;

import java.util.HashSet;
import java.util.Set;

public class MaximalRectangle
{
    // Dynamic programming + HashSet. O(n^3) complexity.
    // There is a more wonderful O(n^2) solution based on problem "Largest Rectangle In Histogram":
    // https://leetcode.com/problems/maximal-rectangle/discuss/29064/A-O(n2)-solution-based-on-Largest-Rectangle-in-Histogram
    public int maximalRectangle(char[][] matrix)
    {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0)
        {
            return 0;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxArea = 0;
        Set<Rectangle>[][] rectangles = new Set[rows][cols];
        int[][] maxRows = new int[rows][cols];
        int[][] maxCols = new int[rows][cols];
        for (int i = rows - 1; i >= 0; i--)
        {
            for (int j = cols - 1; j >= 0; j--)
            {
                if (matrix[i][j] == '0')
                {
                    rectangles[i][j] = new HashSet<Rectangle>();
                    continue;
                }
                Set<Rectangle> rectanglesAtCurPosition = new HashSet<Rectangle>();
                Set<Rectangle> rightRectangles = getRectangleAtPosition(rectangles, i, j+1);
                Set<Rectangle> bottomRectangles = getRectangleAtPosition(rectangles, i+1, j);
                Set<Rectangle> diagnalRectangles = getRectangleAtPosition(rectangles, i+1, j+1);
                int maxRowsFromCur = i + 1 >= rows ? 1 : maxRows[i+1][j] + 1;
                int maxColsFromCur = j + 1 >= cols ? 1 : maxCols[i][j+1] + 1;
                for (Rectangle rectangle : rightRectangles)
                {
                    int rectangleRow = rectangle.getRow();
                    int newRow = Math.min(maxRowsFromCur, rectangleRow);
                    Rectangle newRectangle = new Rectangle(newRow, rectangle.getCol()+1);
                    rectanglesAtCurPosition.add(newRectangle);
                    maxArea = Math.max(maxArea, newRectangle.getArea());
                }
                for (Rectangle rectangle : bottomRectangles)
                {
                    int rectangleCol = rectangle.getCol();
                    int newCol = Math.min(maxColsFromCur, rectangleCol);
                    Rectangle newRectangle = new Rectangle(rectangle.getRow()+1, newCol);
                    rectanglesAtCurPosition.add(newRectangle);
                    maxArea = Math.max(maxArea, newRectangle.getArea());
                }
                for (Rectangle rectangle : diagnalRectangles)
                {
                    int newRow = Math.min(maxRowsFromCur, rectangle.getRow()+1);
                    int newCol = Math.min(maxColsFromCur, rectangle.getCol()+1);
                    Rectangle newRectangle = new Rectangle(newRow, newCol);
                    rectanglesAtCurPosition.add(newRectangle);
                    maxArea = Math.max(maxArea, newRectangle.getArea());
                }
                if (rectanglesAtCurPosition.isEmpty())
                {
                    Rectangle rectangle = new Rectangle(1, 1);
                    rectanglesAtCurPosition.add(rectangle);
                    maxArea = Math.max(maxArea, 1);
                }
                rectangles[i][j] = rectanglesAtCurPosition;
                maxRows[i][j] = maxRowsFromCur;
                maxCols[i][j] = maxColsFromCur;
            }
        }
        return maxArea;
    }

    private Set<Rectangle> getRectangleAtPosition(Set<Rectangle>[][] rectangles, int row, int col)
    {
        if (row >= rectangles.length || col >= rectangles[0].length)
        {
            return new HashSet<Rectangle>();
        }
        return rectangles[row][col];
    }

    private static class Rectangle
    {
        private int row;
        private int col;

        public Rectangle(int row, int col)
        {
            this.row = row;
            this.col = col;
        }

        public int getArea()
        {
            return this.row * this.col;
        }

        public int getRow()
        {
            return this.row;
        }

        public int getCol()
        {
            return this.col;
        }

        @Override
        public int hashCode()
        {
            return this.row * 11307 + this.col;
        }

        @Override
        public boolean equals(Object o)
        {
            if (o == null || !(o instanceof Rectangle))
            {
                return false;
            }
            Rectangle other = (Rectangle) o;
            return this.row == other.row && this.col == other.col;
        }
    }
}
