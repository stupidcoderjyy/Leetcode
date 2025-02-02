package backtrace;

import java.util.ArrayList;
import java.util.List;

public class L39 {
    final List<List<Integer>> result = new ArrayList<>();
    final List<Integer> group = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.nums = candidates;
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
            recurse(j, sum - nums[j]);
            group.remove(group.size() - 1);
        }
    }
}
