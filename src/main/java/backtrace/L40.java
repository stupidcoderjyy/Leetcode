package backtrace;

import java.util.*;

public class L40 {
    final List<List<Integer>> result = new ArrayList<>();
    final List<Integer> group = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.nums = candidates;
        Arrays.sort(nums);
        recurse(0, target);
        return result;
    }

    private void recurse(int i, int sum) {
        if (sum <= 0) {
            if (sum == 0) {
                result.add(new ArrayList<>(group));
            }
            return;
        }
        for (int j = i; j < nums.length ; j++) {
            if (sum < nums[j]) {
                break;
            }
            group.add(nums[j]);
            recurse(j + 1, sum - nums[j]);
            group.remove(group.size() - 1);
            //对于重复数字 i1 i1 i1 ... i1 i2 i3 ...
            //在recurse第一个i1的时候就已经考虑到了以i1为开头的所有情况，故后续的i1全部跳过
            while (j + 1 < nums.length && nums[j + 1] == nums[j]) {
                j++;
            }
        }
    }
}
