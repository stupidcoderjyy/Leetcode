package greedy;

import java.util.Arrays;

public class L455 {

    //策略给每个孩子发分量最小的
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        int count = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
                count++;
            }
            j++;
        }
        return count;
    }
}
