package wysobj;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PermutationsTest
{
    @Test
    public void testCase1()
    {
        int[] nums = new int[]{1, 2, 3};
        Permutations p = new Permutations();
        List<List<Integer>> result = p.permute(nums);
        assert (result.contains(Arrays.asList(1, 2, 3)));
        assert (result.contains(Arrays.asList(1, 3, 2)));
        assert (result.contains(Arrays.asList(2, 1, 3)));
        assert (result.contains(Arrays.asList(2, 3, 1)));
        assert (result.contains(Arrays.asList(3, 2, 1)));
        assert (result.contains(Arrays.asList(3, 1, 2)));
        assert (result.size() == 6);
    }
}
