package array.double_pointers;

public class L76 {
    public String minWindow(String s, String t) {
        int[] cc = new int[128];
        int[] sp = new int[128];
        byte[] src = s.getBytes();
        int uc = 0;
        for (byte b : t.getBytes()) {
            if (sp[b]++ == 0) {
                uc++;
            }
        }
        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int resL = 0, resR = 0;
        L1:
        while (true) {
            while (true) {
                if (r == src.length) {
                    break L1;
                }
                byte b = src[r];
                if (sp[b] == 0) {
                    r++;
                    continue;
                }
                cc[b]++;
                if (cc[b] == sp[b]) {
                    uc--;
                }
                r++;
                if (uc == 0) {
                    break;
                }
            }
            while (true) {
                byte b = src[l];
                if (sp[b] == 0) {
                    l++;
                    continue;
                }
                cc[b]--;
                l++;
                if (cc[b] < sp[b]) {
                    uc++;
                    break;
                }
            }
            int len = r - l + 1;
            if (len < minLen) {
                resL = l - 1;
                resR = r;
                minLen = len;
            }
        }
        return s.substring(resL, resR);
    }
}
