package wysobj;

public class SearchInRotatedSortedArray
{
    // no duplicate exists in the array.
    public int search(int[] nums, int target)
    {
        if (nums == null || nums.length == 0)
        {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right)
        {
            mid = (left + right) / 2;
            if (nums[mid] < target)
            {
                if (nums[mid] > nums[right])
                {
                    left = mid + 1;
                }
                else
                {
                    if (target <= nums[right])
                    {
                        left = mid + 1;
                    }
                    else
                    {
                        right = mid - 1;
                    }
                }
            }
            else if (nums[mid] > target)
            {
                if (nums[mid] < nums[left])
                {
                    right = mid - 1;
                }
                else
                {
                    if (target >= nums[left])
                    {
                        right = mid - 1;
                    }
                    else
                    {
                        left = mid + 1;
                    }
                }
            }
            else
            {
                break;
            }
        }
        if (nums[mid] == target)
        {
            return mid;
        }
        return -1;
    }

}
