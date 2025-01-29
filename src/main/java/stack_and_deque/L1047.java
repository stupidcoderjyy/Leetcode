package stack_and_deque;

import java.util.Stack;

public class L1047 {
    //双指针
    public String removeDuplicates2(String s) {
        if (s.length() == 1) {
            return s;
        }
        byte[] data = s.getBytes();
        int w = 0, r = 0;
        while (r != data.length) {
            data[w] = data[r++];
            if (w != 0 && data[w] == data[w - 1]) {
                w--;
            } else {
                w++;
            }
        }
        return new String(data, 0, w);
    }

    //栈
    public String removeDuplicates(String s) {
        byte[] data = s.getBytes();
        int top = 0;
        for (int i = 0; i < data.length ; i++) {
            if (top != 0 && data[i] == data[top - 1]) {
                top--;
            } else {
                data[top++] = data[i];
            }
        }
        return new String(data, 0, top);
    }
}
