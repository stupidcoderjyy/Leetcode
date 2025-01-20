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
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + ((r - l) >> 1);
            if (target > nums[m]) {
                l = m + 1;
            } else if (target < nums[m] || (m > 0 && nums[m - 1] == target)) {
                r = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    public int findLast(int[] nums, int target) {
        final int N = nums.length;
        int l = 0, r = N - 1;
        while (l <= r) {
            int m = l + ((r - l) >> 1);
            if (target < nums[m]) {
                r = m - 1;
            } else if (target > nums[m] || (m < N - 1 && nums[m + 1] == target)) {
                l = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
