package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class L56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(p -> p[0]));
        List<int[]> result = new ArrayList<>(intervals.length);
        int[] res = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] p = intervals[i];
            if (p[0] > res[1]) {
                result.add(res);
                res = p;
            } else {
                res[1] = Math.max(res[1], p[1]);
            }
        }
        result.add(res);
        return result.toArray(new int[0][0]);
    }
}
