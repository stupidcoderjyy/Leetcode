package backtrace;

import java.util.ArrayList;
import java.util.List;

public class L93 {
    List<String> result = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    String s;

    public List<String> restoreIpAddresses(String s) {
        this.s = s;
        if (s.length() >> 2 == 0) {
            return List.of();
        }
        recurse(0, 4);
        return result;
    }

    private void recurse(int i, int sum) {
        if (sum == 0 || i == s.length()) {
            if (i == s.length()) {
                result.add(sb.substring(0, sb.length() - 1));
            }
            return;
        }
        int l = s.length() - i;
        //后前全部取3位
        int minLen = Math.max(1, l - (sum - 1) * 3);
        //后前全部取1位
        int maxLen = Math.min(3, l - (sum - 1));
        int end = Math.min(s.length(), i + maxLen);
        for (int j = i + minLen; j <= end; j += 1) {
            if (isValid(i, j)) {
                sb.append(s, i, j).append('.');
                recurse(j, sum - 1);
                sb.setLength(sb.length() - (j - i) - 1);
            }
        }
    }

    private boolean isValid(int i, int j) {
        if (s.charAt(i) == '0' && j - i > 1) {
            return false;
        }
        return Integer.parseInt(s, i, j, 10) <= 255;
    }
}
