package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            long required = target - nums[i];
            if ((long)nums[i + 1] + nums[i + 2] + nums[i + 3] > required) {
                break;
            }
            if ((long)nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] < required) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                required = (long)target - (nums[i] + nums[j]);
                if ((long)nums[j + 1] + nums[j + 2] > required) {
                    break;
                }
                if ((long)nums[nums.length - 1] + nums[nums.length - 2] < required) {
                    continue;
                }
                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    long sum = nums[l] + nums[r];
                    if (sum == required) {
                        result.add(List.of(nums[i],nums[j],nums[l],nums[r]));
                        do {
                            l++;
                        } while (l < r && nums[l] == nums[l - 1]);
                        do {
                            r--;
                        } while (l < r && nums[r] == nums[r + 1]);
                        continue;
                    }if (sum < required) {
                        do {
                            l++;
                        } while (l < r && nums[l] == nums[l - 1]);
                    } else {
                        do {
                            r--;
                        } while (l < r && nums[r] == nums[r + 1]);
                    }
                }
            }
        }
        return result;
    }
}
