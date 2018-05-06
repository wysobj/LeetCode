package wysobj;

import org.junit.Test;

import java.util.Arrays;

public class SearchForRangeTest
{
    @Test
    public void testCase1()
    {
        SearchForRange sfr = new SearchForRange();
        int[] nums = new int[]{0, 1, 2, 3, 3, 3, 3, 4};
        int target1 = 3;
        int[] result1 = sfr.searchRange(nums, target1);
        int[] benchmark1 = new int[]{3, 6};
        assertArrayEqual(result1, benchmark1);

        int target2 = 1;
        int[] result2 = sfr.searchRange(nums, target2);
        int[] benchmark2 = new int[]{1, 1};
        assertArrayEqual(result2, benchmark2);
    }

    @Test
    public void testCase2()
    {
        SearchForRange sfr = new SearchForRange();
        int[] nums = new int[]{0, 1, 2, 3, 3, 3, 3, 4};
        int target = 5;
        int[] result = sfr.searchRange(nums, target);
        int[] benchmark = new int[]{-1, -1};
        assertArrayEqual(result, benchmark);
    }

    @Test
    public void testCase3()
    {
        SearchForRange sfr = new SearchForRange();
        int[] nums = new int[]{0};
        int target = 0;
        int[] result = sfr.searchRange(nums, target);
        int[] benchmark = new int[]{0, 0};
        assertArrayEqual(result, benchmark);
    }

    @Test
    public void testCase4()
    {
        SearchForRange sfr = new SearchForRange();
        int[] nums = new int[]{};
        int target = 0;
        int[] result = sfr.searchRange(nums, target);
        int[] benchmark = new int[]{-1, -1};
        assertArrayEqual(result, benchmark);
    }

    @Test
    public void testCase5()
    {
        SearchForRange sfr = new SearchForRange();
        int[] nums = null;
        int target = 0;
        int[] result = sfr.searchRange(nums, target);
        int[] benchmark = new int[]{-1, -1};
        assertArrayEqual(result, benchmark);
    }

    private void assertArrayEqual(int[] arr1, int[] arr2)
    {
        assert(arr1 != null && arr2 != null);
        assert (arr1.length == arr2.length);
        for (int i = 0; i < arr2.length; i++)
        {
            assert (arr1[i] == arr2[i]);
        }
    }

}
