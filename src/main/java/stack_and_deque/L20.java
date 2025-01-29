package stack_and_deque;

import java.util.Stack;

public class L20 {
    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        byte[] data = s.getBytes();
        Stack<Character> symbols = new Stack<>();
        for (byte b : data) {
            switch (b) {
                case '(' -> symbols.push(')');
                case '[' -> symbols.push(']');
                case '{' -> symbols.push('}');
                default -> {
                    if (symbols.empty() || symbols.peek() != b) {
                        return false;
                    }
                    symbols.pop();
                }
            }
        }
        return symbols.empty();
    }
}
