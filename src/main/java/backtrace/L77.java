package backtrace;

import java.util.ArrayList;
import java.util.List;

public class L77 {
    final List<List<Integer>> result = new ArrayList<>();
    final List<Integer> group = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        recurse(1, n + 1, k);
        return result;
    }

    //[l,r)
    private void recurse(int l, int r, int count) {
        if (count == 0) {
            result.add(new ArrayList<>(group));
            return;
        }
        for (int i = l; i <= r - count; i++) {
            group.add(i);
            recurse(i + 1, r, count - 1);
            group.remove(group.size() - 1);
        }
    }
}
