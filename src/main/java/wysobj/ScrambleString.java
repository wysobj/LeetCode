package wysobj;

import java.util.HashMap;
import java.util.Map;

public class ScrambleString
{
    Map<Tuple, Boolean> cache = new HashMap<Tuple, Boolean>();

    public boolean isScramble(String s1, String s2)
    {
        if (s1 == null || s2 == null)
        {
            return false;
        }
        Tuple tuple = new Tuple(s1, s2);
        if (cache.containsKey(tuple))
        {
            return cache.get(tuple);
        }
        if (s1.length() == 1 || s2.length() == 1)
        {
            boolean isScramble = s1.equals(s2);
            cache.put(tuple, isScramble);
            return isScramble;
        }
        assert (s1.length() == s2.length());
        int length = s1.length();
        for (int i = 1; i < length; i++)
        {
            String s1Partition1 = s1.substring(0, i);
            String s1Partition2 = s1.substring(i, length);
            int[] s2PartitionIdx = new int[]{i, length - i};
            boolean[] switchOrder = new boolean[]{false, true};
            boolean match = false;
            for (int j = 0; j < s2PartitionIdx.length; j++)
            {
                int partitionIdx = s2PartitionIdx[j];
                String s2Partition1 = s2.substring(0, partitionIdx);
                String s2Partition2 = s2.substring(partitionIdx, length);
                if (switchOrder[j])
                {
                    String tmp = s2Partition1;
                    s2Partition1 = s2Partition2;
                    s2Partition2 = tmp;
                }
                match = match || (isScramble(s1Partition1, s2Partition1) && isScramble(s1Partition2, s2Partition2));
                if (match)
                {
                    cache.put(tuple, match);
                    return true;
                }
            }

        }
        cache.put(tuple, false);
        return false;
    }

    private static class Tuple
    {
        String s1;
        String s2;

        public Tuple(String s1, String s2)
        {
            this.s1 = s1;
            this.s2 = s2;
        }

        public int hashCode()
        {
            return 10073 * this.s1.hashCode() + this.s2.hashCode();
        }

        public boolean equals(Object o)
        {
            if (o == null || !(o instanceof Tuple))
            {
                return false;
            }
            Tuple other = (Tuple) o;
            boolean condition1 = this.s1.equals(other.s1) && this.s2.equals(other.s2);
            boolean condition2 = this.s1.equals(other.s2) && this.s2.equals(other.s1);
            return condition1 || condition2;
        }
    }
}
