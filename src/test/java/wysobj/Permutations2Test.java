package wysobj;

import org.junit.Test;
import wysobj.Permutations2;

import java.util.Arrays;
import java.util.List;

public class Permutations2Test
{
    @Test
    public void testCase1()
    {
        int[] nums = new int[]{1, 1, 2};
        Permutations2 p = new Permutations2();
        List<List<Integer>> result = p.permuteUnique(nums);
        assert (result.contains(Arrays.asList(1, 1, 2)));
        assert (result.contains(Arrays.asList(1, 2, 1)));
        assert (result.contains(Arrays.asList(2, 1, 1)));
        assert (result.size() == 3);
    }
}
