package stack_and_deque;

import java.util.Stack;

public class L150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();
        for (String s : tokens) {
            switch (s) {
                case "+" -> nums.push(nums.pop() + nums.pop());
                case "-" -> {
                    Integer i1 = nums.pop();
                    Integer i2 = nums.pop();
                    nums.push(i2 - i1);
                }
                case "*" -> nums.push(nums.pop() * nums.pop());
                case "/" -> {
                    Integer i1 = nums.pop();
                    Integer i2 = nums.pop();
                    nums.push(i2 / i1);
                }
                default -> nums.push(Integer.parseInt(s));
            }
        }
        return nums.pop();
    }
}
