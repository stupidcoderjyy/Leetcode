package array.double_pointers;

public class L844 {
    public boolean backspaceCompare(String s, String t) {   //ERROR 算法设计错误
        final byte[] B1 = s.getBytes(), B2 = t.getBytes();
        final int N1 = B1.length, N2 = B2.length;
        int f1 = N1 - 1;
        int f2 = N2 - 1;
        int uh = 0;
        while (true) {
            while (true) {
                if (f1 < 0) {
                    uh = 0;
                    break;
                }
                if (B1[f1] == '#') {
                    uh++;
                } else if (uh > 0) {
                    uh--;
                } else {
                    break;
                }
                f1--;
            }
            while (true) {
                if (f2 < 0) {
                    uh = 0;
                    break;
                }
                if (B2[f2] == '#') {
                    uh++;
                } else if (uh > 0) {
                    uh--;
                } else {
                    break;
                }
                f2--;
            }
            if (f1 < 0 || f2 < 0) {
                return f1 < 0 && f2 < 0;
            }
            if (B1[f1--] != B2[f2--]) {
                return false;
            }
        }
    }
}
