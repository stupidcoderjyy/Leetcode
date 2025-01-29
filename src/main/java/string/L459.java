package string;

public class L459 {
    /*
        符合要求的字符串最长公共前后缀满足如下特性
            [         ]     最长公共后缀
        [         ]         最长公共前缀
        1 2 1 2 1 2 1 2
        故N-next[N]为一个循环的长度

        当N-next[N]小于N且能被N整除时，整个区域可以被切分成若干段长度为N-next[N]的区域
             [                  ]   最长公共后缀
        [                  ]        最长公共前缀
        | A1 | A2 ... An-1 | An |
        由公共前缀：A1=A2=...=An，故该字符串含有重复字串
     */
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() <= 1) {
            return false;
        }
        byte[] data = s.getBytes();
        int N = data.length;
        int[] next = new int[N + 1];
        int i = 0, j = 1;
        next[0] = 0;
        L1:
        while (true) {
            while (data[i] != data[j]) {
                if (i == 0) {
                    j++;
                    break;
                }
                i = next[i];
            }
            if (j == N) {
                break;
            }
            while (data[i] == data[j]) {
                next[++j] = ++i;
                if (j == N) {
                    break L1;
                }
            }
        }
        return next[N] > 0 && N % (N - next[N]) == 0;
    }
}
