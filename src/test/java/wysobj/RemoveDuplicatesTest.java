package wysobj;

import org.junit.Test;

public class RemoveDuplicatesTest
{
    @Test
    public void testCase1()
    {
        int[] nums = new int[]{0, 0, 1, 1, 2, 3};
        RemoveDuplicates rd = new RemoveDuplicates();
        int length = rd.removeDuplicates(nums);
        assertSubArrayEquals(nums, new int[]{0, 1, 2, 3}, 4);
        assert (length == 4);
    }

    @Test
    public void testCase2()
    {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 3};
        RemoveDuplicates rd = new RemoveDuplicates();
        int length = rd.removeDuplicates(nums);
        assertSubArrayEquals(nums, new int[]{0, 1, 2, 3}, 4);
        assert (length == 4);
    }

    @Test
    public void testCase3()
    {
        int[] nums = new int[]{0};
        RemoveDuplicates rd = new RemoveDuplicates();
        int length = rd.removeDuplicates(nums);
        assertSubArrayEquals(nums, new int[]{0}, 1);
        assert (length == 1);
    }

    @Test
    public void testCase4()
    {
        int[] nums = null;
        RemoveDuplicates rd = new RemoveDuplicates();
        int length = rd.removeDuplicates(nums);
        assert (nums == null);
        assert (length == 0);
    }

    private void assertSubArrayEquals(int[] arr1, int[] arr2, int length)
    {
        assert (arr1.length >= length);
        assert (arr2.length >= length);
        for (int i = 0; i < length; i++)
        {
            assert (arr1[i] == arr2[i]);
        }
    }
}
