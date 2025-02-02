package backtrace;

import java.util.ArrayList;
import java.util.List;

public class L216 {
    final List<List<Integer>> result = new ArrayList<>();
    final List<Integer> group = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        recurse(1, 10, n, k);
        return result;
    }

    private void recurse(int l, int r, int sum, int count) {
        if (count == 0) {
            if (sum == 0) {
                result.add(new ArrayList<>(group));
            }
            return;
        }
        while (l <= r - count) {
            group.add(l);
            recurse(l + 1, r, sum - l, count - 1);
            group.remove(group.size() - 1);
            l++;
        }
    }
}
