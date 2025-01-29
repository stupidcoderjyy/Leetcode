package hash_table;

import java.util.ArrayList;
import java.util.List;

public class L350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] numToCount = new int[1001];
        for (int i : nums1) {
            numToCount[i]++;
        }
        List<Integer> res = new ArrayList<>();
        for (int i : nums2) {
            if (numToCount[i] > 0) {
                res.add(i);
                numToCount[i]--;
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
