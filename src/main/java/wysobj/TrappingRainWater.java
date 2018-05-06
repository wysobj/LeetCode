package wysobj;

public class TrappingRainWater
{
    public int trap(int[] height)
    {
        if (height == null || height.length < 3)
        {
            return 0;
        }
        int water = 0;
        int highestFromLeft = findHighestIdx(height, 0, height.length - 1, 1);
        int highestFromRight = findHighestIdx(height, height.length - 1, 0, -1);

        water += collectWater(height, 0, highestFromLeft, 1);
        water += collectWater(height, height.length - 1, highestFromRight, -1);

        for (int i = highestFromLeft + 1; i < highestFromRight; i++)
        {
            water += height[highestFromLeft] - height[i];
        }
        return water;
    }

    private int findHighestIdx(int[] height, int startIdx, int endIndex, int direction)
    {
        int highestIdx = startIdx;
        int p = startIdx;
        while ((endIndex - p) * direction >= 0)
        {
            if (height[p] > height[highestIdx])
            {
                highestIdx = p;
            }
            p += direction;
        }
        return highestIdx;
    }

    private int collectWater(int[] height, int startIdx, int endIndex, int direction)
    {
        int water = 0;
        int curMaxHeightIdx = startIdx;
        int p = startIdx + direction;
        while ((endIndex - p) * direction >= 0)
        {
            if (height[p] <= height[curMaxHeightIdx])
            {
                water += height[curMaxHeightIdx] - height[p];
            }
            else
            {
                curMaxHeightIdx = p;
            }
            p += direction;
        }
        return water;
    }
}
