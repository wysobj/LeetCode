package wysobj;

import java.util.LinkedList;
import java.util.List;

public class Permutations
{
    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (nums == null || nums.length < 1)
        {
            return result;
        }
        permuteSubSequence(nums, 0, result);
        return result;
    }

    private void permuteSubSequence(int[] nums, int startIdx, List<List<Integer>> result)
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
