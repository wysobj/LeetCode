package wysobj;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Permutations2
{
    public List<List<Integer>> permuteUnique(int[] nums)
    {
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        if (nums == null || nums.length < 1)
        {
            return new LinkedList<List<Integer>>(result);
        }
        permuteSubSequence(nums, 0, result);
        return new LinkedList<List<Integer>>(result);
    }

    private void permuteSubSequence(int[] nums, int startIdx, Set<List<Integer>> result)
    {
        if (startIdx == nums.length - 1)
        {
            result.add(arrayToList(nums));
            return;
        }
        for (int i = startIdx; i < nums.length; i++)
        {
            swap(nums, startIdx, i);
            permuteSubSequence(nums, startIdx + 1, result);
            swap(nums, startIdx, i);
        }
    }

    private void swap(int[] nums, int a, int b)
    {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    private List<Integer> arrayToList(int[] nums)
    {
        List<Integer> list = new LinkedList<Integer>();
        for (int num : nums)
        {
            list.add(num);
        }
        return list;
    }
}
