package array;

import java.util.HashMap;
import java.util.Map;

public class L1 {
    public int[] twoSum(int[] nums, int target) {
        //不允许排序，不能使用双指针
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(required, i);
        }
        return null;
    }
}
