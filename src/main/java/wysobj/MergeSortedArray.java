package wysobj;

public class MergeSortedArray
{
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        if (n < 1)
        {
            return;
        }
        int endIdx = m + n - 1;
        int nums1Idx = m - 1;
        int nums2Idx = n - 1;
        while (endIdx >= 0)
        {
            int filled;
            if (nums2Idx < 0 || (nums1Idx >= 0 && nums1[nums1Idx] > nums2[nums2Idx]))
            {
                filled = nums1[nums1Idx];
                --nums1Idx;
            }
            else
            {
                filled = nums2[nums2Idx];
                --nums2Idx;
            }
            nums1[endIdx] = filled;
            endIdx--;
        }
    }
}
