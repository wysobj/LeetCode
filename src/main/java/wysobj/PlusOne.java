package wysobj;

import java.util.Arrays;
import java.util.LinkedList;

public class PlusOne
{
    public int[] plusOne(int[] digits)
    {
        if (digits == null)
        {
            return null;
        }
        int eleNum = digits.length;
        int[] tmp = new int[eleNum + 2];
        tmp[eleNum + 1] = 9;
        for (int i = 0; i < eleNum; i++)
        {
            tmp[i+1] = digits[i];
        }
        for (int i = tmp.length - 1; i >= 0; i--)
        {
            if (tmp[i] == 9)
            {
                tmp[i] = 0;
            }
            else
            {
                tmp[i] = tmp[i] + 1;
                break;
            }
        }
        if (tmp[0] == 0)
        {
            return Arrays.copyOfRange(tmp, 1, tmp.length - 1);
        }
        else
        {
            return Arrays.copyOfRange(tmp, 0, tmp.length - 1);
        }
    }
}
