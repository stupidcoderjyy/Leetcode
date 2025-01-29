package string;

public class L344 {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    public void reverse(char[] s, int l, int r) {
        while (l < r) {
            var temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
