package wysobj;

public class FirstMissingPostive
{
    // solution references https://leetcode.com/problems/first-missing-positive/discuss/17073/Share-my-O(n)-time-O(1)-space-solution
    public int firstMissingPositive(int[] nums)
    {
        if (nums == null)
        {
            return 1;
        }
        int k = partition(nums);
        if (k == -1)
        {
            return 1;
        }
        for (int i = 0; i <= k; i++)
        {
            int eleI = Math.abs(nums[i]);
            if (eleI - 1 <= k)
            {
                nums[eleI - 1] = -Math.abs(nums[eleI - 1]);
            }
        }
        int firstPostiveIndex = 0;
        for (; firstPostiveIndex <= k; firstPostiveIndex++)
        {
            if (nums[firstPostiveIndex] > 0)
            {
                break;
            }
        }
        return firstPostiveIndex + 1;
    }

    private int partition(int[] nums)
    {
        int k = -1;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] > 0)
            {
                swap(nums, k + 1, i);
                k++;
            }
        }
        return k;
    }

    private void swap(int[] nums, int a, int b)
    {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
