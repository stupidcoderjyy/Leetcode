package stack_and_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class L225 {
    public static class MyStack {
        final Deque<Integer> data = new ArrayDeque<>();

        public MyStack() {
        }

        public void push(int x) {
            data.addLast(x);
        }

        public int pop() {
            reverseData();
            return data.removeFirst();
        }

        public int top() {
            int v = pop();
            push(v);
            return v;
        }

        public boolean empty() {
            return data.isEmpty();
        }

        private void reverseData() {
            for (int i = 1 ; i < data.size() ; i++) {
                data.addLast(data.removeFirst());
            }
        }
    }
}
