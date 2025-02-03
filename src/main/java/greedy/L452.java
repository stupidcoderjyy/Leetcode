package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class L452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(p -> p[1]));
        int r = points[0][1];
        int count = 1;
        for (int[] p : points) {
            if (p[0] > r) {
                count++;
                r = p[1];
            }
        }
        return count;
    }
}
