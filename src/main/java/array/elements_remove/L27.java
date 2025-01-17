package array.elements_remove;

public class L27 {
    public int removeElement(int[] nums, int val) {     //ERROR 暴力解法
        int next = 0;
        int forward = 0;
        while (forward < nums.length) {
            if (nums[forward] == val) {
                forward++;
                continue;
            }
            nums[next++] = nums[forward++];
        }
        return next;
    }
}
