package backtrace;

import java.util.ArrayList;
import java.util.List;

public class L17 {
    final int[][] numToAlpha = new int[][]{
            {},{},
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
    };
    final List<String> result = new ArrayList<>();
    final StringBuilder sb = new StringBuilder();
    byte[] data;

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return List.of();
        }
        data = digits.getBytes();
        recurse(0);
        return result;
    }

    private void recurse(int i) {
        if (i == data.length) {
            result.add(sb.toString());
            return;
        }
        for (int b : numToAlpha[data[i] - '0']) {
            sb.append((char)b);
            recurse(i + 1);
            sb.setLength(sb.length() - 1);
        }
    }
}
