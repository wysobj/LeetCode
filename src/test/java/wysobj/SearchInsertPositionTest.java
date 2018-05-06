package wysobj;

import org.junit.Test;

public class SearchInsertPositionTest
{
    @Test
    public void testCase1()
    {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;
        SearchInsertPosition sip = new SearchInsertPosition();
        int result = sip.searchInsert(nums, target);
        assert (result == 2);
    }

    @Test
    public void testCase2()
    {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 2;
        SearchInsertPosition sip = new SearchInsertPosition();
        int result = sip.searchInsert(nums, target);
        assert (result == 1);
    }

    @Test
    public void testCase3()
    {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 7;
        SearchInsertPosition sip = new SearchInsertPosition();
        int result = sip.searchInsert(nums, target);
        assert (result == 4);
    }

    @Test
    public void testCase4()
    {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 0;
        SearchInsertPosition sip = new SearchInsertPosition();
        int result = sip.searchInsert(nums, target);
        assert (result == 0);
    }
}
