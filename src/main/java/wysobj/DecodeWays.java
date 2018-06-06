package wysobj;

public class DecodeWays
{
    public int numDecodings(String s)
    {
        if (s == null || s.length() == 0)
        {
            return 0;
        }
        int[] nums = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--)
        {
            if (s.charAt(i) == '0')
            {
                continue;
            }
            int num = 0;
            num += i + 1 < s.length() ? nums[i+1] : 1;
            if (i + 1 < s.length() && Integer.parseInt(s.substring(i, i + 2)) <= 26)
            {
                num += i + 2 < s.length() ? nums[i+2] : 1;
            }
            nums[i] = num;
        }
        return nums[0];
    }
}
