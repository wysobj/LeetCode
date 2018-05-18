package wysobj;

public class SortColors
{
    private static final int RED = 0;
    private static final int WHITE = 1;
    private static final int BLUE = 2;
    public void sortColors(int[] nums)
    {
        if (nums == null || nums.length == 0)
        {
            return;
        }
        int redLastIdx = -1;
        int whiteLastIdx = -1;
        for (int i = 0; i < nums.length; i++)
        {
            int color = nums[i];
            if (color == RED)
            {
                swap(nums, redLastIdx + 1, i);
                if (nums[i] == WHITE)
                {
                    swap(nums, whiteLastIdx + 1, i);
                }
                ++redLastIdx;
                ++whiteLastIdx;
            }
            else if (color == WHITE)
            {
                swap(nums, whiteLastIdx + 1, i);
                ++whiteLastIdx;
            }
        }
    }

    private void swap(int[] nums, int idx1, int idx2)
    {
        int tmp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = tmp;
    }
}
