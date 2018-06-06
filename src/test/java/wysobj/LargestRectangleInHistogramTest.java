package wysobj;

import org.junit.Test;

public class LargestRectangleInHistogramTest
{
    @Test
    public void testCase1()
    {
        int[] heights = new int[]{2, 1, 5, 6, 2, 3};
        LargestRectangleInHistogram lrih = new LargestRectangleInHistogram();
        int result = lrih.largestRectangleArea(heights);
        assert (result == 10);
    }

    @Test
    public void testCase2()
    {
        int[] heights = new int[]{4, 2, 0, 3, 2, 4, 3, 4};
        LargestRectangleInHistogram lrih = new LargestRectangleInHistogram();
        int result = lrih.largestRectangleArea(heights);
        assert (result == 10);
    }
}
