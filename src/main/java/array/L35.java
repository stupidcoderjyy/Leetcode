package array;

public class L35 {
    public int searchInsert(int[] nums, int target) {
        // [l,r]
        int l = 0, r = nums.length - 1;
        int m;
        while (l <= r) {
            m = l + ((r - l) >> 1);
            if (nums[m] < target) {
                l = m + 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                return m;
            }
        }
        return l;          //ERROR: return l < 0 ? 0 : m + 1;
    }
}
