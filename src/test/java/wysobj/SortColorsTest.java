package wysobj;

import org.junit.Test;
import wysobj.util.TestUtil;

public class SortColorsTest
{
    @Test
    public void testCase1()
    {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        SortColors sc = new SortColors();
        sc.sortColors(nums);
        int[] benchMark = new int[]{0, 0, 1, 1, 2, 2};
        TestUtil.assertArraySame(nums, benchMark);
    }

    @Test
    public void testCase2()
    {
        int[] nums = new int[]{0, 1, 0, 0};
        SortColors sc = new SortColors();
        sc.sortColors(nums);
        int[] benchMark = new int[]{0, 0, 0, 1};
        TestUtil.assertArraySame(nums, benchMark);
    }

    @Test
    public void testCase3()
    {
        int[] nums = new int[]{0, 1, 0, 0, 2, 1, 2, 0, 0, 1, 0, 2};
        SortColors sc = new SortColors();
        sc.sortColors(nums);
        int[] benchMark = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2};
        TestUtil.assertArraySame(nums, benchMark);
    }
}
