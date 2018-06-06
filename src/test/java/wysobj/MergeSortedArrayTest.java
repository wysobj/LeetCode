package wysobj;

import org.junit.Test;
import wysobj.util.TestUtil;

public class MergeSortedArrayTest
{
    @Test
    public void testCase1()
    {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        MergeSortedArray msa = new MergeSortedArray();
        msa.merge(nums1, m, nums2, n);
        TestUtil.assertArraySame(nums1, new int[]{1, 2, 2, 3, 5, 6});
    }

    @Test
    public void testCase2()
    {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{2};
        int m = 0;
        int n = 1;
        MergeSortedArray msa = new MergeSortedArray();
        msa.merge(nums1, m, nums2, n);
        TestUtil.assertArraySame(nums1, new int[]{2});
    }
}
