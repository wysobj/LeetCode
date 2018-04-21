package wysobj;

public class LongestCommonPrefix
{
    public String longestCommonPrefix(String[] strs)
    {
        if (strs == null)
        {
            throw new InvalidArgumentException();
        }
        String commonPrefix = "";
        int minLength = findMinLengthInStrs(strs);
        if (minLength > 0)
        {
            for (int i = 0; i < minLength; i++)
            {
                char curCommonChar = strs[0].charAt(i);
                int strIndex;
                for (strIndex = 0; strIndex < strs.length; strIndex++)
                {
                    if (strs[strIndex].charAt(i) != curCommonChar)
                    {
                        break;
                    }
                }
                if (strIndex == strs.length)
                {
                    commonPrefix += curCommonChar;
                }
                else
                {
                    break;
                }
            }
        }
        return commonPrefix;
    }

    private int findMinLengthInStrs(String[] strs)
    {
        if (strs.length == 0)
        {
            return 0;
        }
        int minLength = Integer.MAX_VALUE;
        for (int i=0; i<strs.length; i++)
        {
            String str = strs[i];
            int strLength = 0;
            if (str == null)
            {
                throw new InvalidArgumentException();
            }
            strLength = str.length();
            if (strLength < minLength)
            {
                minLength = strLength;
            }
        }
        return minLength;
    }

    static class InvalidArgumentException extends RuntimeException {}
}
