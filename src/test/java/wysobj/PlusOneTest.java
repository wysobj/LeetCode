package wysobj;

import org.junit.Test;

public class PlusOneTest
{
    @Test
    public void testCase1()
    {
        int[] digits = new int[]{1, 2, 3};
        PlusOne po = new PlusOne();
        int[] benchMark = new int[]{1, 2, 4};
        int[] result = po.plusOne(digits);
        assertArraySame(benchMark, result);
    }

    @Test
    public void testCase2()
    {
        int[] digits = new int[]{1, 2, 9};
        PlusOne po = new PlusOne();
        int[] benchMark = new int[]{1, 3, 0};
        int[] result = po.plusOne(digits);
        assertArraySame(benchMark, result);
    }

    @Test
    public void testCase3()
    {
        int[] digits = new int[]{9, 9, 9};
        PlusOne po = new PlusOne();
        int[] benchMark = new int[]{1, 0, 0, 0};
        int[] result = po.plusOne(digits);
        assertArraySame(benchMark, result);
    }

    @Test
    public void testCase4()
    {
        int[] digits = new int[]{};
        PlusOne po = new PlusOne();
        int[] benchMark = new int[]{1};
        int[] result = po.plusOne(digits);
        assertArraySame(benchMark, result);
    }

    private void assertArraySame(int[] arr1, int[] arr2)
    {
        assert (arr1 != null && arr2 != null);
        assert (arr1.length == arr2.length);
        int length = arr1.length;
        for (int i = 0; i < length; i++)
        {
            assert (arr1[i] == arr2[i]);
        }
    }
}
