package stack_and_deque;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class L347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numToCount = new HashMap<>();
        for (int i : nums) {
            numToCount.put(i, numToCount.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
        queue.addAll(numToCount.entrySet());
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll().getKey();
        }
        return result;
    }
}
