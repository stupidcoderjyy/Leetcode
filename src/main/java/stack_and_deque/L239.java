package stack_and_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class L239 {
    final Deque<Integer> queue = new ArrayDeque<>();

    public int[] maxSlidingWindow(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            add(nums[i]);
        }
        int[] result = new int[nums.length - k + 1];
        result[0] = queue.getFirst();
        for (int i = 1, j = k ; j < nums.length; i++, j++) {
            remove(nums[i - 1]);
            add(nums[j]);
            result[i] = queue.getFirst();
        }
        return result;
    }

    private void add(int num) {
        while (!queue.isEmpty() && num > queue.getLast()) {
            queue.removeLast();
        }
        queue.addLast(num);
    }

    private void remove(int num) {
        if (!queue.isEmpty() && queue.peek() == num) {
            queue.removeFirst();
        }
    }
}
