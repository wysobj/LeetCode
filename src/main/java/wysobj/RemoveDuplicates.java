package wysobj;

public class RemoveDuplicates
{
        public int removeDuplicates(int[] nums)
        {
            if (nums == null)
            {
                return 0;
            }
            int p = 0;
            for (int i = 1; i < nums.length; i++)
            {
                if (nums[i] != nums[p])
                {
                    nums[p+1] = nums[i];
                    p++;
                }
            }
            return p+1;
        }
}
