package greedy;

import java.util.*;

public class L406 {
    //★
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (p1, p2) -> {
            if (p2[0] == p1[0]) {
                return p1[1] - p2[1];
            }
            return p2[0] - p1[0];
        });
        List<int[]> result0 = new ArrayList<>(people.length);
        for (int i = 0; i < people.length; i++) {
            result0.add(Math.min(people[i][1], i), people[i]);
        }
        return result0.toArray(new int[0][0]);
    }
}
