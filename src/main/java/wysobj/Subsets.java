package wysobj;

import java.util.LinkedList;
import java.util.List;

public class Subsets
{
    public List<List<Integer>> subsets(int[] nums)
    {
        if (nums == null || nums.length < 1)
        {
            return new LinkedList<List<Integer>>();
        }
        List<Integer> bootstrapList = new LinkedList<Integer>();
        return subroutine(nums, 0, bootstrapList);
    }

    private List<List<Integer>> subroutine(int[] nums, int idx, List<Integer> subset)
    {
        List<List<Integer>> results = new LinkedList<List<Integer>>();
        if (idx == nums.length)
        {
            results.add(subset);
            return results;
        }
        List<Integer> subsetWithIdxElement = new LinkedList<Integer>(subset);
        subsetWithIdxElement.add(nums[idx]);
        results.addAll(subroutine(nums, idx+1, subsetWithIdxElement));
        List<Integer> subsetWithoutIdxElement = subset;
        results.addAll(subroutine(nums, idx+1, subsetWithoutIdxElement));
        return results;
    }
}
