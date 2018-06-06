package wysobj;

import java.util.Arrays;

public class SearchInRotatedSortedArray2
{
    public boolean search(int[] nums, int target)
    {
        if (nums == null || nums.length < 1)
        {
            return false;
        }
        int start = 0;
        int end = nums.length - 1;
        int middle = (start + end) / 2;
        while (start <= end)
        {
            middle = (start + end) / 2;
            if (nums[start] < nums[end])
            {
                if (nums[middle] < target)
                {
                    start = middle + 1;
                }
                else if (nums[middle] > target)
                {
                    end = middle - 1;
                }
                else
                {
                    break;
                }
            }
            else if (nums[start] > nums[end])
            {
                if (nums[middle] < target)
                {
                    if (nums[middle] < nums[start] && target >= nums[start])
                    {
                        end = middle - 1;
                    }
                    else
                    {
                        start = middle + 1;
                    }
                }
                else if (nums[middle] > target)
                {
                    if (nums[middle] > nums[end] && target <= nums[end])
                    {
                        start = middle + 1;
                    }
                    else
                    {
                        end = middle - 1;
                    }
                }
                else
                {
                    break;
                }
            }
            else
            {
                if (nums[middle] == target)
                {
                    break;
                }
                else
                {
                    boolean existInLeft = search(Arrays.copyOfRange(nums, start, middle), target);
                    boolean existInRight = search(Arrays.copyOfRange(nums, middle + 1, end + 1), target);
                    return existInLeft || existInRight;
                }
            }
        }
        return nums[middle] == target;
    }
}
