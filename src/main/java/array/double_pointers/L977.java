package array.double_pointers;

public class L977 {

    public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1;
        int[] result = new int[nums.length];
        int i = r;
        while (l <= r) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                result[i--] = nums[l] * nums[l];
                l++;
            } else {
                result[i--] = nums[r] * nums[r];
                r--;
            }
        }
        return result;
    }
}
