package wysobj;

public class RemoveElements
{
    public int removeElement(int[] nums, int val)
    {
        if (nums == null)
        {
            return 0;
        }
        int p = -1;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
                nums[p+1] = nums[i];
                p++;
            }
        }
        return p+1;
    }
}
