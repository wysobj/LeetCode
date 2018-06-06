package wysobj;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SubsetsTest
{
    @Test
    public void testCase1()
    {
        int[] nums = new int[]{1, 2, 3};
        Subsets subsets = new Subsets();
        List<List<Integer>> results = subsets.subsets(nums);
        assert (results.contains(Arrays.asList()));
        assert (results.contains(Arrays.asList(3)));
        assert (results.contains(Arrays.asList(1)));
        assert (results.contains(Arrays.asList(2)));
        assert (results.contains(Arrays.asList(1, 2, 3)));
        assert (results.contains(Arrays.asList(1, 3)));
        assert (results.contains(Arrays.asList(2, 3)));
        assert (results.contains(Arrays.asList(1, 2)));
        assert (results.size() == 8);
    }
}
