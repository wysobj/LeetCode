package wysobj;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CombinationSum2Test
{
    @Test
    public void testCase1()
    {
        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        CombinationSum2 cs = new CombinationSum2();
        List<List<Integer>> result = cs.combinationSum2(candidates, target);
        assert (result.contains(Arrays.asList(1, 7)));
        assert (result.contains(Arrays.asList(1, 2, 5)));
        assert (result.contains(Arrays.asList(2, 6)));
        assert (result.contains(Arrays.asList(1, 1, 6)));
    }

    @Test
    public void testCase2()
    {
        int[] candidates = new int[]{2, 5, 2, 1, 2};
        int target = 5;
        CombinationSum2 cs = new CombinationSum2();
        List<List<Integer>> result = cs.combinationSum2(candidates, target);
        assert (result.contains(Arrays.asList(1, 2, 2)));
        assert (result.contains(Arrays.asList(5)));
    }

    @Test
    public void testCase3()
    {
        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        CombinationSum2 cs = new CombinationSum2();
        List<List<Integer>> result = cs.combinationSum2(candidates, target);
        assert (result.contains(Arrays.asList(1, 2, 5)));
        assert (result.contains(Arrays.asList(1, 1, 6)));
        assert (result.contains(Arrays.asList(1, 7)));
        assert (result.contains(Arrays.asList(2, 6)));
    }
}
