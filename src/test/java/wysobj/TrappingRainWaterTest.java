package wysobj;

import org.junit.Test;

public class TrappingRainWaterTest
{
    @Test
    public void testCase1()
    {
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        TrappingRainWater trw = new TrappingRainWater();
        int water = trw.trap(height);
        assert (water == 6);
    }

    @Test
    public void testCase2()
    {
        int[] height = new int[]{4, 2, 3};
        TrappingRainWater trw = new TrappingRainWater();
        int water = trw.trap(height);
        assert (water == 1);
    }

    @Test
    public void testCase3()
    {
        int[] height = new int[]{1, 1, 1};
        TrappingRainWater trw = new TrappingRainWater();
        int water = trw.trap(height);
        assert (water == 6);
    }

    @Test
    public void testCase4()
    {
        int[] height = new int[]{5, 0, 2, 0, 6};
        TrappingRainWater trw = new TrappingRainWater();
        int water = trw.trap(height);
        assert (water == 13);
    }

    @Test
    public void testCase5()
    {
        int[] height = new int[]{3, 2, 1, 2, 3};
        TrappingRainWater trw = new TrappingRainWater();
        int water = trw.trap(height);
        assert (water == 4);
    }

    @Test
    public void testCase6()
    {
        int[] height = new int[]{9999991, 1, 999999, 1, 9999999};
        TrappingRainWater trw = new TrappingRainWater();
        int water = trw.trap(height);
        assert (water == 28999972);
    }
}
