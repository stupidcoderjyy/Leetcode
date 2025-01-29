package string;

public class L541 {
    public String reverseStr(String s, int k) {
        byte[] data = s.getBytes();
        int i = 0;
        int N = data.length;
        while (i < N) {
            //i:翻转起始位 → 翻转[i, min(i + k, len))
            int end = Math.min(N, i + k);
            reverse(data, i, end - 1);
            if (end == N) {
                break;
            }
            i += (k << 1);
        }
        return new String(data);
    }

    private void reverse(byte[] s, int l, int r) {
        while (l < r) {
            byte temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
