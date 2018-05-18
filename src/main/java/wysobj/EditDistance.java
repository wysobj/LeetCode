package wysobj;

import java.util.LinkedList;

public class EditDistance
{
    public int minDistance(String word1, String word2)
    {
        // if word1 or word2 is null, just throw NullPointerException instead of
        // quietly ignore those exceptional case.
        int length1 = word1.length();
        int length2 = word2.length();
        int[][] matrix = new int[length1+1][length2+1];
        for (int i = 1; i <= length1; i++)
        {
            matrix[i][0] = i;
        }
        for (int i = 1; i <= length2; i++)
        {
            matrix[0][i] = i;
        }
        for (int i = 1; i <= length1; i++)
        {
            for (int j = 1; j <= length2; j++)
            {
                int min = matrix[i-1][j-1];
                min = word1.charAt(i-1) == word2.charAt(j-1) ? min : min + 1;
                if (matrix[i][j-1] + 1 < min)
                {
                    min = matrix[i][j-1] + 1;
                }
                if (matrix[i-1][j] + 1 < min)
                {
                    min = matrix[i-1][j] + 1;
                }
                matrix[i][j] = min;
            }
        }
        return matrix[length1][length2];
    }

    // reconstruct version, for fun.
    public void sayHowToChangeS1ToS2InMinEditDistance(String word1, String word2)
    {
        int length1 = word1.length();
        int length2 = word2.length();
        int[][] matrix = new int[length1+1][length2+1];
        int[][] directions = new int[length1+1][length2+1];
        for (int i = 1; i <= length1; i++)
        {
            matrix[i][0] = i;
            directions[i][0] = -1;
        }
        for (int i = 1; i <= length2; i++)
        {
            matrix[0][i] = i;
            directions[0][i] = 1;
        }
        for (int i = 1; i <= length1; i++)
        {
            for (int j = 1; j <= length2; j++)
            {
                int min = matrix[i-1][j-1];
                if (word1.charAt(i-1) != word2.charAt(j-1))
                {
                    min = min + 1;
                    directions[i][j] = 2;
                }
                if (matrix[i][j-1] + 1 < min)
                {
                    min = matrix[i][j-1] + 1;
                    directions[i][j] = 1;
                }
                if (matrix[i-1][j] + 1 < min)
                {
                    min = matrix[i-1][j] + 1;
                    directions[i][j] = -1;
                }
                matrix[i][j] = min;
            }
        }
        LinkedList<String> operations = new LinkedList<String>();
        int row = length1;
        int col = length2;
        while (row != 0 || col != 0)
        {
            int direction = directions[row][col];
            String operation;
            if (direction == 0)
            {
                operation = String.format("char '%c' matches.", word1.charAt(row-1));
                row -= 1;
                col -= 1;
            }
            else if (direction == 2)
            {
                operation = String.format("replace char '%c' to char '%c'.", word1.charAt(row-1), word2.charAt(col-1));
                row -= 1;
                col -= 1;
            }
            else if (direction == -1)
            {
                operation = String.format("delte char '%c'.", word1.charAt(row-1));
                row -= 1;
            }
            else
            {
                operation = String.format("add char '%c'.", word2.charAt(col-1));
                col -= 1;
            }
            operations.add(operation);
        }
        while (!operations.isEmpty())
        {
            System.out.println(operations.removeLast());
        }
    }
}
