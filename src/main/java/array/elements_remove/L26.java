package array.elements_remove;

public class L26 {
    public int removeDuplicates(int[] nums) {     //ERROR 暴力解法
        int next = 0;
        int forward = 0;
        final int n = nums.length;
        while (forward < n) {
            int val = nums[forward++];
            nums[next++] = val;
            while (forward < n && nums[forward] == val) {
                forward++;
            }
        }
        return next;
    }
}
