package array;

public class L704 {
    /*
        假定target在[l, r]中
     */
    public int search1(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {                    //ERROR：l < r
            int m = l + ((r - l) >> 1);     //WARN:  int m = (l + r) >> 1; 可能溢出
            if (nums[m] < target) {
                l = m + 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    /*
        假定target在[l, r)中
     */
    public int search2(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int m = l + ((r - l) >> 1);
            if (nums[m] < target) {
                l = m + 1;
            } else if (nums[m] > target) {
                r = m;
            } else {
                return m;
            }
        }
        return -1;
    }
}
