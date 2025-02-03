package greedy;

import java.util.Arrays;

public class L1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int result = 0;
        while (i < nums.length - 1 && k > 0) {
            if (nums[i] >= 0 || (nums[i + 1] > 0 && -nums[i] < nums[i + 1])) {
                break;
            }
            k--;
            result += -nums[i++];
        }
        if ((k & 1) == 1) {
            nums[i] = -nums[i];
        }
        while (i < nums.length) {
            result += nums[i++];
        }
        return result;
    }
}
