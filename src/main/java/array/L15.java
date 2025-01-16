package array;

import java.util.*;

public class L15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int ans = nums[l] + nums[r] + nums[i];
                if (ans < 0) {
                    l++;
                } else if (ans > 0) {
                    r--;
                } else {
                    result.add(List.of(nums[l++], nums[r--], nums[i]));
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                }
            }
        }
        return result;
    }
}
