package wysobj;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArray2Test
{
    @Test
    public void testCase1()
    {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        RemoveDuplicatesFromSortedArray2 rdfsa2 = new RemoveDuplicatesFromSortedArray2();
        int length = rdfsa2.removeDuplicates(nums);
        int resultLength = 5;
        int[] benchMarkArray = new int[]{1, 1, 2, 2, 3};
        assert (length == resultLength);
        for (int i = 0; i < resultLength; i++)
        {
            assert (nums[i] == benchMarkArray[i]);
        }
    }

    @Test
    public void testCase2()
    {
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        RemoveDuplicatesFromSortedArray2 rdfsa2 = new RemoveDuplicatesFromSortedArray2();
        int length = rdfsa2.removeDuplicates(nums);
        int resultLength = 7;
        int[] benchMarkArray = new int[]{0, 0, 1, 1, 2, 3, 3};
        assert (length == resultLength);
        for (int i = 0; i < resultLength; i++)
        {
            assert (nums[i] == benchMarkArray[i]);
        }
    }
}
