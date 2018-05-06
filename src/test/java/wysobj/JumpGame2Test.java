package wysobj;

import org.junit.Test;

public class JumpGame2Test
{
    @Test
    public void testCase1()
    {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        JumpGame2 jg = new JumpGame2();
        int result = jg.jump(nums);
        assert (result == 2);
    }

    @Test
    public void testCase2()
    {
        int[] nums = new int[]{1, 1, 1, 1};
        JumpGame2 jg = new JumpGame2();
        int result = jg.jump(nums);
        assert (result == 3);
    }

    @Test
    public void testCase3()
    {
        int[] nums = new int[]{1, 1, 1, 1, 1};
        JumpGame2 jg = new JumpGame2();
        int result = jg.jump(nums);
        assert (result == 4);
    }

    @Test
    public void testCase4()
    {
        int[] nums = new int[]{7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
        JumpGame2 jg = new JumpGame2();
        int result = jg.jump(nums);
        assert (result == 2);
    }
}
