package array.double_pointers;

public class L844 {
    public boolean backspaceCompare(String s, String t) {   //ERROR 算法设计错误
        final int N1 = s.length(), N2 = t.length();
        int check1 = N1 - 1, check2 = N2 - 1;
        int unhandled = 0;  //未处理的'#'数量
        while (true) {
            while (true) {
                //检查连续的'#'
                while (check1 >= 0 && s.charAt(check1) == '#') {
                    unhandled++;
                    check1--;
                }
                //处理结束
                if (unhandled == 0) {
                    break;
                }
                //处理'#'
                unhandled--;
                check1--;
            }
            while (true) {
                while (check2 >= 0 && t.charAt(check2) == '#') {
                    unhandled++;
                    check2--;
                }
                if (unhandled == 0) {
                    break;
                }
                unhandled--;
                check2--;
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
