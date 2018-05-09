package wysobj;

import org.junit.Test;

public class SearchInRotatedSortedArrayTest
{
    @Test
    public void testCase1()
    {
        int[] arr = new int[]{4, 5, 6, 7, 0, 1, 2, 3};
        int target1 = 0;
        SearchInRotatedSortedArray srsa = new SearchInRotatedSortedArray();
        int index1 = srsa.search(arr, target1);
        assert (index1 == 4);
        int target2 = 6;
        int index2 = srsa.search(arr, target2);
        assert (index2 == 2);
    }

    @Test
    public void testCase2()
    {
        int[] arr = new int[]{4};
        int target1 = 4;
        SearchInRotatedSortedArray srsa = new SearchInRotatedSortedArray();
        int index1 = srsa.search(arr, target1);
        assert (index1 == 0);
        int target2 = 6;
        int index2 = srsa.search(arr, target2);
        assert (index2 == -1);
    }

    @Test
    public void testCase3()
    {
        int[] arr = new int[]{0, 1, 2, 3, 4};
        int target1 = 4;
        SearchInRotatedSortedArray srsa = new SearchInRotatedSortedArray();
        int index1 = srsa.search(arr, target1);
        assert (index1 == 4);
        int target2 = 5;
        int index2 = srsa.search(arr, target2);
        assert (index2 == -1);
    }

    @Test
    public void testCase4()
    {
        int[] arr = new int[]{0, 1};
        int target1 = 0;
        SearchInRotatedSortedArray srsa = new SearchInRotatedSortedArray();
        int index1 = srsa.search(arr, target1);
        assert (index1 == 0);
        int target2 = 1;
        int index2 = srsa.search(arr, target2);
        assert (index2 == 1);
    }

    @Test
    public void testCase5()
    {
        int[] arr = new int[]{1, 0};
        int target1 = 0;
        SearchInRotatedSortedArray srsa = new SearchInRotatedSortedArray();
        int index1 = srsa.search(arr, target1);
        assert (index1 == 1);
        int target2 = 1;
        int index2 = srsa.search(arr, target2);
        assert (index2 == 0);
    }
}
