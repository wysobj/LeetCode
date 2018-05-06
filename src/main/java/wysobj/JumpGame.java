package wysobj;

public class JumpGame
{
    public boolean canJump(int[] nums)
    {
        if (nums == null || nums.length < 1)
        {
            return false;
        }
        int furthest = nums[0];
        int idx = 1;
        while (idx <= furthest && idx < nums.length)
        {
            if (idx + nums[idx] > furthest)
            {
                furthest = idx + nums[idx];
            }
            idx++;
        }
        return furthest >= nums.length - 1;
    }
}
