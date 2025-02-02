package backtrace;

import java.util.ArrayList;
import java.util.List;

public class L131 {
    final List<List<String>> result = new ArrayList<>();
    final List<String> group = new ArrayList<>();
    byte[] data;

    public List<List<String>> partition(String s) {
        this.data = s.getBytes();
        recurse(0);
        return result;
    }

    private void recurse(int i) {
        if (i == data.length) {
            result.add(new ArrayList<>(group));
            return;
        }
        for (int j = i + 1; j <= data.length ; j++) {
            if (isPalindrome(i, j)) {
                group.add(new String(data, i, j - i));
                recurse(j);
                group.remove(group.size() - 1);
            }
        }
    }

    private boolean isPalindrome(int i, int j) {
        int l = i, r = j - 1;
        while (l < j) {
            if (data[l++] != data[r--]) {
                return false;
            }
        }
        return true;
    }
}
