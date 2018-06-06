package wysobj;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationsTest
{
    @Test
    public void testCase1()
    {
        int n = 4;
        int k = 2;
        Combinations c = new Combinations();
        List<List<Integer>> results = c.combine(n, k);
        assert (results.contains(Arrays.asList(2, 4)));
        assert (results.contains(Arrays.asList(3, 4)));
        assert (results.contains(Arrays.asList(2, 3)));
        assert (results.contains(Arrays.asList(1, 2)));
        assert (results.contains(Arrays.asList(1, 3)));
        assert (results.contains(Arrays.asList(1, 4)));
        assert (results.size() == 6);
    }
}
