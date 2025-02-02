package backtrace;

import java.util.ArrayList;
import java.util.List;

public class L78 {
    final List<List<Integer>> result = new ArrayList<>();
    final List<Integer> group = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        recurse(0);
        return result;
    }

    private void recurse(int i) {
        //无返回条件
        result.add(new ArrayList<>(group));
        for (int j = i; j < nums.length; j++) {
            group.add(nums[j]);
            recurse(j + 1);
            group.remove(group.size() - 1);
        }
    }
}
