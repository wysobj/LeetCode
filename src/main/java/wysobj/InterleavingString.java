package wysobj;

public class InterleavingString
{
    public boolean isInterleave(String s1, String s2, String s3)
    {
        if (s1 == null || s2 == null || s3 == null)
        {
            return false;
        }
        int length1 = s1.length();
        int length2 = s2.length();
        int length3 = s3.length();
        if (length1 + length2 != length3)
        {
            return false;
        }
        int[][] matrix = new int[length1+1][length2+1];
        for (int i = 1; i <= length1 && s1.charAt(i-1) == s3.charAt(i-1); i++)
        {
            matrix[i][0] = i;
        }
        for (int j = 1; j <= length2 && s2.charAt(j-1) == s3.charAt(j-1); j++)
        {
            matrix[0][j] = j;
        }
        for (int i = 1; i <= length1; i++)
        {
            for (int j = 1; j <= length2; j++)
            {
                // note the counter of s3 starts from 1, so 0 means none match occurs.
                int leftCellCounter = matrix[i][j - 1];
                int upCellCounter = matrix[i - 1][j];
                if (leftCellCounter == i + j - 1 && s2.charAt(j-1) == s3.charAt(leftCellCounter))
                {
                    matrix[i][j] = leftCellCounter + 1;
                }
                else if (upCellCounter == i + j - 1 && s1.charAt(i-1) == s3.charAt(upCellCounter))
                {
                    matrix[i][j] = upCellCounter + 1;
                }
            }
        }
        return matrix[length1][length2] == length3;
    }
}
