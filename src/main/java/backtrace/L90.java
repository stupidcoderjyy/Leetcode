package backtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L90 {
    final List<List<Integer>> result = new ArrayList<>();
    final List<Integer> group = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.nums = nums;
        Arrays.sort(nums);
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
            while (j + 1 < nums.length && nums[j] == nums[j + 1]) {
                j++;
            }
        }
    }
}
