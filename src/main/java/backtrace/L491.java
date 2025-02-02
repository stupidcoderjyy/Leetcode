package backtrace;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L491 {
    final List<List<Integer>> result = new ArrayList<>();
    final List<Integer> group = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> findSubsequences(int[] nums) {
        this.nums = nums;
        recurse(0, Integer.MIN_VALUE);
        return result;
    }

    private void recurse(int i, int prev) {
        if (group.size() > 1) {
            result.add(new ArrayList<>(group));
        }
        if (i == nums.length) {
            return;
        }
        //本轮已经考虑到所有以i开头的情况，故需要去重
        Set<Integer> existed = new HashSet<>();
        for (int j = i; j < nums.length; j++) {
            if (nums[j] < prev || existed.contains(nums[j])) {
                continue;
            }
            group.add(nums[j]);
            existed.add(nums[j]);
            recurse(j + 1, nums[j]);
            group.remove(group.size() - 1);
        }
    }
}
