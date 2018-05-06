package wysobj;

public class SearchForRange
{
    public int[] searchRange(int[] nums, int target)
    {
        int[] range = new int[]{-1, -1};
        if (nums == null || nums.length == 0)
        {
            return range;
        }
        int left = findLeftBoundry(nums, target);
        int right = findRightBoundry(nums, target);
        range[0] = left;
        range[1] = right;
        return range;
    }

    private int findLeftBoundry(int[] nums, int target)
    {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right)
        {
            int mid = (left + right) / 2;
            if (nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return left < nums.length && nums[left] == target ? left : -1;
    }

    private int findRightBoundry(int[] nums, int target)
    {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right)
        {
            mid = (left + right) / 2;
            if (nums[mid] > target)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return right >= 0 && nums[right] == target ? right : -1;
    }
}
