package array.double_pointers;

public class L209 {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        L1:
        while (true) {
            do {
                if (r == nums.length) {
                    break L1;
                }
                sum += nums[r++];
            } while (sum < target);
            while (true) {
                sum -= nums[l++];//操作态结束
                if (sum < target) {
                    minLen = Math.min(minLen, r - l + 1);
                    break;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
