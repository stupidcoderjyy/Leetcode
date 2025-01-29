package string;

public class L28 {
    public int strStr(String s, String t) {
        byte[] data = s.getBytes(), target = t.getBytes();
        int[] next = buildNext(target);
        int i = 0, j = 0;
        while (i < data.length) {
            if (data[i] == target[j]) {
                i++;
                j++;
                if (j == target.length) {
                    return i - target.length;
                }
                continue;
            }
            if (j == 0) {
                i++;
            }
            j = next[j];
        }
        return -1;
    }

    public int[] buildNext(byte[] data) {
        if (data.length == 1) {
            return new int[1];
        }
        int[] next = new int[data.length];
        int i = 0, j = 1;
        next[0] = 0;
        L1:
        while (true) {
            //i,j无法组成公共前后缀 → 查找公共前后缀的首位。公共前后缀只可能出现在next[i]和[j]中，
            //故回退i，尝试和j组成公共前后缀，否则右移j
            while (data[i] != data[j]) {
                if (i == 0) {
                    j++;
                    break;
                }
                i = next[i];
            }
            if (j == data.length) {
                break;
            }
            //i,j:公共前后缀的首位 → 右移i,j找到最长前后缀，同时next[j] = i
            while (data[i] == data[j]) {
                j++;
                i++;
                if (j == data.length) {
                    break L1;
                }
                next[j] = i;
            }
        }
        return next;
    }
}
