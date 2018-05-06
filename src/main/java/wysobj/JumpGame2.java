package wysobj;

public class JumpGame2
{
    public int jump(int[] nums)
    {
        if (nums == null || nums.length < 2)
        {
            return 0;
        }
        int jumps = 0;
        int farthest = 0;
        int curFarthest = 0;
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (i + nums[i] >= nums.length - 1)
            {
                break;
            }
            if (i + nums[i] > curFarthest)
            {
                curFarthest = i + nums[i];
            }
            if (i == farthest)
            {
                ++jumps;
                farthest = curFarthest;
            }
        }
        return jumps + 1;
    }
}
