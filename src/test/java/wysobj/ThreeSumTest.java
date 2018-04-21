package wysobj;

import org.junit.Test;
import wysobj.ThreeSum;

import java.util.Arrays;
import java.util.List;

public class ThreeSumTest
{
    @Test
    public void testThreeSum()
    {
        ThreeSum ts = new ThreeSum();

        int[] nums = new int[]{-1,0,1,3,-1,-4};
        List<Integer> triple1 = Arrays.asList(1, 3, -4);
        List<Integer> triple2 = Arrays.asList(0, 1, -1);
        int size = 2;
        List<List<Integer>> result = ts.threeSum(nums);
        assert (result.contains(triple1));
        assert (result.contains(triple2));
        assert (result.size() == size);
    }
}
