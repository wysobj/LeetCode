package wysobj;

import org.junit.Test;

public class JumpGameTest
{
    @Test
    public void testCase1()
    {
        JumpGame jg = new JumpGame();
        int[] nums = new int[]{2, 3, 1, 1, 4};
        boolean result = jg.canJump(nums);
        assert (result == true);
    }

    @Test
    public void testCase2()
    {
        JumpGame jg = new JumpGame();
        int[] nums = new int[]{3, 2, 1, 0, 4};
        boolean result = jg.canJump(nums);
        assert (result == false);
    }
}
