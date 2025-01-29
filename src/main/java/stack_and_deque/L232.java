package stack_and_deque;

import java.util.Stack;

public class L232 {
    public static class MyQueue {
        final Stack<Integer> data = new Stack<>();
        final Stack<Integer> out = new Stack<>();

        public MyQueue() {
        }

        public void push(int x) {
            data.push(x);
        }

        public int pop() {
            moveData();
            return out.pop();
        }

        public int peek() {
            moveData();
            return out.peek();
        }

        public boolean empty() {
            return out.empty() && data.empty();
        }

        private void moveData() {
            if (out.empty()) {
                while (!data.empty()) {
                    out.push(data.pop());
                }
            }
        }
    }
}
