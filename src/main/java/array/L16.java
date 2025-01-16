package array;

import java.util.Arrays;

public class L16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDelta = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int required = target - nums[i];
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r];
                int delta = Math.abs(sum - required);
                if (sum > required) {    //当前三数之和偏大
                    do {
                        r--;
                    } while (l < r && nums[r] == nums[r + 1]);
                } else {                //当前三数之和偏小
                    do {
                        l++;
                    } while (l < r && nums[l] == nums[l - 1]);
                }

                if (delta < minDelta) {
                    minDelta = delta;
                    result = sum + nums[i];
                }
            }
        }
        return result;
    }
}
