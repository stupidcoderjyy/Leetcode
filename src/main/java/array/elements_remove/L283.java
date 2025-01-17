package array.elements_remove;

public class L283 {
    public void moveZeroes(int[] nums) {
        int next = 0;
        int forward = 0;
        final int N = nums.length;
        while (forward < N) {
            if (nums[forward] == 0) {
                forward++;
                continue;
            }
            nums[next++] = nums[forward++];
        }
        while (next < N) {
            nums[next++] = 0;
        }
    }
}
