package string;

import java.util.Scanner;

public class KC55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        String s = scanner.next();
        System.out.println(rotate(s, c));
    }

    public static String rotate(String s, int c) {
        byte[] data = s.getBytes();
        reverse(data, 0, data.length - 1);
        reverse(data, 0, c - 1);
        reverse(data, c, data.length - 1);
        return new String(data);
    }

    //翻转[l,r]
    private static void reverse(byte[] s, int l, int r) {
        while (l < r) {
            byte temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
