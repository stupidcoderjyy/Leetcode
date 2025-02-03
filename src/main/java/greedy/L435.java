package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class L435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(p -> p[1]));
        int r = Integer.MIN_VALUE;   //[l,r)
        int count = 0;
        for (int[] p : intervals) {
            if (p[0] >= r) {
                r = p[1];
            } else {
                count++;
            }
        }
        return count;
    }
}
