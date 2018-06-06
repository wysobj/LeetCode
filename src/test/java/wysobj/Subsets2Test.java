package wysobj;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Subsets2Test
{
    @Test
    public void testCase1()
    {
        int[] nums = new int[]{1, 2, 2};
        Subsets2 ss2 = new Subsets2();
        List<List<Integer>> result = ss2.subsetsWithDup(nums);
        assert (result.size() == 6);
        assert (result.contains(Arrays.asList(2)));
        assert (result.contains(Arrays.asList(1)));
        assert (result.contains(Arrays.asList(1, 2, 2)));
        assert (result.contains(Arrays.asList(1, 2)));
        assert (result.contains(Arrays.asList(2, 2)));
        assert (result.contains(Arrays.asList()));
    }
}
