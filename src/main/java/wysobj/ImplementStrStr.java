package wysobj;

public class ImplementStrStr
{
    public int strStr(String haystack, String needle)
    {
        if (haystack == null || needle == null)
        {
            return -1;
        }
        if (needle.length() == 0)
        {
            return 0;
        }
        return kmp(haystack, needle);
    }

    private int kmp(String haystack, String needle)
    {
        int p = -1;
        int[] backTrackIndex = buildBackTrackArr(needle);
        for (int i = -1; i < haystack.length() - 1; i++)
        {
            if (haystack.charAt(i+1) == needle.charAt(p+1))
            {
                p++;
            }
            else
            {
                while (p != -1 && haystack.charAt(i+1) != needle.charAt(p+1))
                {
                    p = backTrackIndex[p];
                }
                if (haystack.charAt(i+1) == needle.charAt(p+1))
                {
                    p++;
                }
            }
            if (p + 1 == needle.length())
            {
                return i - needle.length() + 2;
            }
        }
        return -1;
    }

    private int[] buildBackTrackArr(String needle)
    {
        int p = -1;
        int[] indexes = new int[needle.length()];
        indexes[0] = -1;
        for (int i = 0; i < needle.length() - 1; i++)
        {
            if (needle.charAt(i+1) == needle.charAt(p+1))
            {
                p++;
                indexes[i+1] = p;
            }
            else
            {
                while (p != -1 && needle.charAt(i+1) != needle.charAt(p+1))
                {
                    p = indexes[p];
                }
                if (needle.charAt(i+1) == needle.charAt(p+1))
                {
                    p++;
                }
                indexes[i+1] = p;
            }
        }
        return indexes;
    }
}
