package hash_table;

import java.util.*;

public class L349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] hasNum = new boolean[1001];
        for (int i : nums1) {
            hasNum[i] = true;
        }
        List<Integer> res = new ArrayList<>();
        for (int i : nums2) {
            if (hasNum[i]) {
                res.add(i);
                hasNum[i] = false;
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
