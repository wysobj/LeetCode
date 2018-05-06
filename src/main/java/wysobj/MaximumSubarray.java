package wysobj;

public class MaximumSubarray
{
    public int maxSubArray(int[] nums)
    {
        if (nums == null || nums.length < 1)
        {
            return 0;
        }
        int max = nums[0];
        int accumulate = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            if (accumulate <= 0)
            {
                accumulate = nums[i];
            }
            else
            {
                accumulate += nums[i];
            }
            max = accumulate > max ? accumulate : max;
        }
        return max;
    }
}
