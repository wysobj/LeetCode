package wysobj;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumTest
{
    @Test
    public void testCase1()
    {
        int[] candidates = new int[]{2, 3, 6, 7};
        int target = 7;
        CombinationSum cs = new CombinationSum();
        List<List<Integer>> benchMark = new LinkedList<List<Integer>>();
        List<List<Integer>> combinations = cs.combinationSum(candidates, target);
        assert (combinations.contains(Arrays.asList(7)));
        assert (combinations.contains(Arrays.asList(2, 2, 3)));
    }

    @Test
    public void testCase2()
    {
        int[] candidates = new int[]{2, 3, 5};
        int target = 8;
        CombinationSum cs = new CombinationSum();
        List<List<Integer>> combinations = cs.combinationSum(candidates, target);
        assert (combinations.contains(Arrays.asList(3, 5)));
        assert (combinations.contains(Arrays.asList(2, 2, 2, 2)));
        assert (combinations.contains(Arrays.asList(2, 3, 3)));
    }

    @Test
    public void testCase3()
    {
        int[] candidates = new int[]{2, 3, 5};
        int target = 7;
        CombinationSum cs = new CombinationSum();
        List<List<Integer>> combinations = cs.combinationSum(candidates, target);
        assert (combinations.contains(Arrays.asList(2, 5)));
        assert (combinations.contains(Arrays.asList(2, 2, 3)));
    }
}
