package hash_table;

import java.util.*;

public class L454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> sumToCount1 = new HashMap<>();
        for (int i : nums1) {
            for (int j : nums2) {
                int sum = i + j;
                sumToCount1.put(sum, sumToCount1.getOrDefault(sum, 0) + 1);
            }
        }
        int result = 0;
        for (int i : nums3) {
            for (int j : nums4) {
                int sum = i + j;
                result += sumToCount1.getOrDefault(-sum, 0);
            }
        }
        return result;
    }
}
