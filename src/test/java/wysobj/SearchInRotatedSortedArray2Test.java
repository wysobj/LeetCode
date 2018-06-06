package wysobj;

import org.junit.Test;

public class SearchInRotatedSortedArray2Test
{
    @Test
    public void testCase1()
    {
        int[] nums = new int[]{2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        SearchInRotatedSortedArray2 sirsa2 = new SearchInRotatedSortedArray2();
        boolean result = sirsa2.search(nums, target);
        assert (result == true);
    }

    @Test
    public void testCase2()
    {
        int[] nums = new int[]{2, 5, 6, 0, 0, 1, 2};
        int target = 3;
        SearchInRotatedSortedArray2 sirsa2 = new SearchInRotatedSortedArray2();
        boolean result = sirsa2.search(nums, target);
        assert (result == false);
    }

    @Test
    public void testCase3()
    {
        int[] nums = new int[]{2, 2, 2, 2, 2, 2, 2};
        int target = 1;
        SearchInRotatedSortedArray2 sirsa2 = new SearchInRotatedSortedArray2();
        boolean result = sirsa2.search(nums, target);
        assert (result == false);
    }

    @Test
    public void testCase4()
    {
        int[] nums = new int[]{2, 2, 2, 2, 2, 2, 2};
        int target = 3;
        SearchInRotatedSortedArray2 sirsa2 = new SearchInRotatedSortedArray2();
        boolean result = sirsa2.search(nums, target);
        assert (result == false);
    }

    @Test
    public void testCase5()
    {
        int[] nums = new int[]{2, 2, 2, 2, 2, 2, 2};
        int target = 2;
        SearchInRotatedSortedArray2 sirsa2 = new SearchInRotatedSortedArray2();
        boolean result = sirsa2.search(nums, target);
        assert (result == true);
    }

    @Test
    public void testCase6()
    {
        int[] nums = new int[]{2, 1, 2, 2, 2, 2, 2};
        int target = 1;
        SearchInRotatedSortedArray2 sirsa2 = new SearchInRotatedSortedArray2();
        boolean result = sirsa2.search(nums, target);
        assert (result == true);
    }

    @Test
    public void testCase7()
    {
        int[] nums = new int[]{2};
        int target = 2;
        SearchInRotatedSortedArray2 sirsa2 = new SearchInRotatedSortedArray2();
        boolean result = sirsa2.search(nums, target);
        assert (result == true);
    }

    @Test
    public void testCase8()
    {
        int[] nums = new int[]{2};
        int target = 3;
        SearchInRotatedSortedArray2 sirsa2 = new SearchInRotatedSortedArray2();
        boolean result = sirsa2.search(nums, target);
        assert (result == false);
    }

    @Test
    public void testCase9()
    {
        int[] nums = new int[]{1, 3, 1, 1, 1};
        int target = 3;
        SearchInRotatedSortedArray2 sirsa2 = new SearchInRotatedSortedArray2();
        boolean result = sirsa2.search(nums, target);
        assert (result == true);
    }

    @Test
    public void testCase10()
    {
        int[] nums = new int[]{3, 1, 2, 2, 2};
        int target = 1;
        SearchInRotatedSortedArray2 sirsa2 = new SearchInRotatedSortedArray2();
        boolean result = sirsa2.search(nums, target);
        assert (result == true);
    }
}
