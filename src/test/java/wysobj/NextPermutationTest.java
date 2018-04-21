package wysobj;

import org.junit.Test;

import java.util.Arrays;

public class NextPermutationTest
{
    @Test
    public void testCase1()
    {
        int[] nums = new int[]{1, 2, 3};
        NextPermutation np = new NextPermutation();
        np.nextPermutation(nums);
        int[] benchMark = new int[]{1, 3, 2};
        assert (isArraySame(nums, benchMark));
    }

    @Test
    public void testCase2()
    {
        int[] nums = new int[]{3, 4, 2, 1};
        NextPermutation np = new NextPermutation();
        np.nextPermutation(nums);
        int[] benchMark = new int[]{4, 1, 2, 3};
        assert (isArraySame(nums, benchMark));
    }

    @Test
    public void testCase3()
    {
        int[] nums = new int[]{1, 3, 2};
        NextPermutation np = new NextPermutation();
        np.nextPermutation(nums);
        int[] benchMark = new int[]{2, 1, 3};
        assert (isArraySame(nums, benchMark));
    }

    @Test
    public void testCase4()
    {
        int[] nums = new int[]{1};
        NextPermutation np = new NextPermutation();
        np.nextPermutation(nums);
        int[] benchMark = new int[]{1};
        assert (isArraySame(nums, benchMark));
    }

    @Test
    public void testCase5()
    {
        int[] nums = new int[]{3, 2, 1};
        NextPermutation np = new NextPermutation();
        np.nextPermutation(nums);
        int[] benchMark = new int[]{1, 2, 3};
        assert (isArraySame(nums, benchMark));
    }

    @Test
    public void testCase6()
    {
        int[] nums = new int[]{1, 5, 1};
        NextPermutation np = new NextPermutation();
        np.nextPermutation(nums);
        int[] benchMark = new int[]{5, 1, 1};
        assert (isArraySame(nums, benchMark));
    }

    private boolean isArraySame(int[] arr1, int[] arr2)
    {
        if (arr1 == null || arr2 == null)
        {
            return arr1 == null && arr2 == null;
        }
        if (arr1.length != arr2.length)
        {
            return false;
        }
        for (int i = 0; i < arr1.length; i++)
        {
            if (arr1[i] != arr2[i])
            {
                return false;
            }
        }
        return true;
    }
}
