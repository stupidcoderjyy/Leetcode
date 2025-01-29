package string;

import java.util.Scanner;

public class KC54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(replace(scanner.next()));
    }

    public static String replace(String str) {
        byte[] data = str.getBytes();
        final byte[] chNumber = "number".getBytes();
        int numCount = 0;
        for (byte b : data) {
            if (Character.isDigit(b)) {
                numCount++;
            }
        }
        byte[] result = new byte[data.length + numCount * 5];
        int i = result.length - 1, j = data.length - 1;
        L1:
        while (j >= 0) {
            //[j]未知 → 处理数字
            while (Character.isDigit(data[j])) {
                //2 [j]为数字，未完成赋值
                System.arraycopy(chNumber, 0, result, i - 5, 6);
                if (j-- == 0) {
                    break L1;
                }
                i -= 6;
                // 完成number的赋值
            }
            //[j]非数字 → 赋值
            result[i--] = data[j--];
        }
        return new String(result);
    }
}
