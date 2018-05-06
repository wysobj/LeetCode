package wysobj;

import org.junit.Test;

public class MaximumSubarrayTest
{
    @Test
    public void testCase1()
    {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaximumSubarray ms = new MaximumSubarray();
        int result = ms.maxSubArray(nums);
        System.out.println(result);
    }
}
