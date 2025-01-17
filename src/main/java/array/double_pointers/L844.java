package array.double_pointers;

public class L844 {
    public boolean backspaceCompare(String s, String t) {   //ERROR 算法设计错误
        final int N1 = s.length(), N2 = t.length();
        int skipCount1 = 0, skipCount2 = 0;
        int check1 = N1 - 1, check2 = N2 - 1;
        while (true) {
            while (check1 >= 0) {
                if (s.charAt(check1) == '#') {
                    skipCount1++;
                    check1--;
                } else if (skipCount1 > 0) {
                    check1--;
                    skipCount1--;
                } else {
                    break;
                }
            }
            while (check2 >= 0) {
                if (t.charAt(check2) == '#') {
                    skipCount2++;
                    check2--;
                } else if (skipCount2 > 0) {
                    check2--;
                    skipCount2--;
                } else {
                    break;
                }
            }
            if (check1 < 0 || check2 < 0) {
                return check1 < 0 && check2 < 0;
            }
            if (s.charAt(check1) != t.charAt(check2)) {
                return false;
            }
            check1--;
            check2--;
        }
    }
}
