package wysobj;

import java.util.LinkedList;
import java.util.List;

public class GrayCode
{
    public List<Integer> grayCode(int n)
    {
        List<Integer> result = new LinkedList<Integer>();
        if (n < 1)
        {
            result.add(0);
            return result;
        }
        int iterationRounds = 1 << n;
        for (int i = 0; i < iterationRounds; i++)
        {
            int elementI = 0;
            for (int j = 0; j < n; j++)
            {
                int bit = 0;
                int cycle = 1 << (j + 2);
                int remain = i % cycle;
                if (remain >= cycle / 4 && remain < cycle / 4 * 3)
                {
                    bit = 1;
                }
                elementI += bit << j;
            }
            result.add(elementI);
        }
        return result;
    }
}
