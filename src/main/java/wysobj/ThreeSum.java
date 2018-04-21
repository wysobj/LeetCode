package wysobj;

import java.util.*;

public class ThreeSum
{
    public List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (nums == null || nums.length < 3)
        {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++)
        {
            int numI = nums[i];
            if (numI > 0)
            {
                break;
            }
            if (i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            int target = -numI;
            List<List<Integer>> twoSums = findTwoSum(nums, i + 1, nums.length - 1, target);
            for (List<Integer> twoSum : twoSums)
            {
                twoSum.add(numI);
                result.add(twoSum);
            }
        }
        return result;
    }

    private List<List<Integer>> findTwoSum(int[] nums, int startIdx, int endIdx, int target)
    {
        List<List<Integer>> twoSums = new LinkedList<List<Integer>>();
        while(startIdx < endIdx)
        {
            int twoSum = nums[startIdx] + nums[endIdx];
            if (twoSum == target)
            {
                LinkedList<Integer> twoSumList = new LinkedList<Integer>();
                twoSumList.add(nums[startIdx]);
                twoSumList.add(nums[endIdx]);
                twoSums.add(twoSumList);
                startIdx++;
                while (startIdx < endIdx && nums[startIdx] == nums[startIdx-1])
                {
                    startIdx++;
                }
                endIdx--;
                while (startIdx < endIdx && nums[endIdx] == nums[endIdx+1])
                {

                    endIdx--;
                }
            }
            else if (twoSum < target)
            {
                startIdx++;
                while (startIdx < endIdx && nums[startIdx] == nums[startIdx-1])
                {
                    startIdx++;
                }
            }
            else
            {
                endIdx--;
                while (startIdx < endIdx && nums[endIdx] == nums[endIdx+1])
                {

                    endIdx--;
                }
            }
        }
        return twoSums;
    }
}
