package wysobj;

public class LargestRectangleInHistogram
{
    // solution reference https://leetcode.com/problems/largest-rectangle-in-
    // histogram/discuss/28902/5ms-O(n)-Java-solution-explained-(beats-96)
    public int largestRectangleArea(int[] heights)
    {
        if (heights == null || heights.length < 1)
        {
            return 0;
        }
        int length = heights.length;
        int[] leftBoundries = new int[length];
        int[] rightBoundries = new int[length];
        leftBoundries[0] = -1;
        rightBoundries[length-1] = length;

        for (int i = 1; i < length; i++)
        {
            int heightI = heights[i];
            int leftBoundry = i - 1;
            while (leftBoundry != -1 && heights[leftBoundry] >= heightI)
            {
                leftBoundry = leftBoundries[leftBoundry];
            }
            leftBoundries[i] = leftBoundry;
        }

        for (int i = length - 2; i >= 0; i--)
        {
            int heightI = heights[i];
            int rightBoundry = i + 1;
            while (rightBoundry < length && heights[rightBoundry] >= heightI)
            {
                rightBoundry = rightBoundries[rightBoundry];
            }
            rightBoundries[i] = rightBoundry;
        }

        int maxArea = 0;
        for (int i = 0; i < length; i++)
        {
            int heightI = heights[i];
            int area = heightI * (rightBoundries[i] - leftBoundries[i] - 1);
            maxArea = area > maxArea ? area : maxArea;
        }
        return maxArea;
    }
}
