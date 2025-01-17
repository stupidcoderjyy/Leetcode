package array.binary_search;

public class L34 {
    public int[] searchRange(int[] nums, int target) {
        int l = findFirst(nums, target);
        if (l < 0) {
            return new int[]{-1, -1};
        }
        return new int[]{l, findLast(nums, target)};
    }

    public int findFirst(int[] nums, int target) {
        // [l,r]
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + ((r - l) >> 1);
            if (nums[m] > target) {
                r = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else if (m == 0 || nums[m - 1] != target) {
                return m;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    public int findLast(int[] nums, int target) {
        // [l,r]
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + ((r - l) >> 1);
            if (nums[m] > target) {
                r = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else if (m == nums.length - 1 || nums[m + 1] != target) {
                return m;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
