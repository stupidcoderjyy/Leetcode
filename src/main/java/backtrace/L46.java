package backtrace;

import java.util.ArrayList;
import java.util.List;

public class L46 {
    final List<List<Integer>> result = new ArrayList<>();
    final List<Integer> group = new ArrayList<>();
    int[] nums;
    boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        this.used = new boolean[nums.length];
        recurse(nums.length);
        return result;
    }

    private void recurse(int count) {
        if (count == 0) {
            result.add(new ArrayList<>(group));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            group.add(nums[i]);
            used[i] = true;
            recurse(count - 1);
            group.remove(group.size() - 1);
            used[i] = false;
        }
    }
}
