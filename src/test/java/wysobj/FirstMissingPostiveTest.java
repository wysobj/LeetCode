package wysobj;

import org.junit.Test;

public class FirstMissingPostiveTest
{
    @Test
    public void testCase1()
    {
        FirstMissingPostive fmp = new FirstMissingPostive();
        int[] nums = new int[]{1, 2, 0};
        int result = fmp.firstMissingPositive(nums);
        assert (result == 3);
    }

    @Test
    public void testCase2()
    {
        FirstMissingPostive fmp = new FirstMissingPostive();
        int[] nums = new int[]{3, 4, -1, 1};
        int result = fmp.firstMissingPositive(nums);
        assert (result == 2);
    }

    @Test
    public void testCase3()
    {
        FirstMissingPostive fmp = new FirstMissingPostive();
        int[] nums = new int[]{7, 8, 9, 11, 12};
        int result = fmp.firstMissingPositive(nums);
        assert (result == 1);
    }
}
