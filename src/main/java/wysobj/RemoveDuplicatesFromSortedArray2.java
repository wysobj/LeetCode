package wysobj;

public class RemoveDuplicatesFromSortedArray2
{
    public int removeDuplicates(int[] nums)
    {
        if (nums == null || nums.length < 1)
        {
            return 0;
        }
        int idxOfNewArray = 0;
        for (int i = 1; i < nums.length; i++)
        {
            int eleAtI = nums[i];
            if (idxOfNewArray < 1 || nums[idxOfNewArray] != eleAtI || nums[idxOfNewArray - 1] != eleAtI)
            {
                nums[idxOfNewArray+1] = eleAtI;
                idxOfNewArray++;
            }
        }
        return idxOfNewArray + 1;
    }
}
