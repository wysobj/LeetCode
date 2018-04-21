package wysobj;

import java.util.Arrays;

public class NextPermutation
{
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0)
        {
            return;
        }
        int i = nums.length - 1;
        for (; i >= 0; i--)
        {
            if (i == 0 || nums[i] > nums[i-1])
            {
                break;
            }
        }
        if (i > 0)
        {
            int j = i;
            for (; j < nums.length; j++)
            {
                if (nums[j] <= nums[i-1])
                {
                    break;
                }
            }
            swap(nums, i - 1, j - 1);
        }
        Arrays.sort(nums, i, nums.length);
    }

    private void swap(int[] nums, int a, int b)
    {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
