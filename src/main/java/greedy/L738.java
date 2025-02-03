package greedy;

public class L738 {
    /*
        从右向左遍历，遇到递增时：递增位-1，后续位为9
     */
    public int monotoneIncreasingDigits(int n) {
        int[] bits = new int[10];
        int i = 1;
        int fs = 0;
        bits[0] = n % 10;
        n /= 10;
        while (n > 0) {
            bits[i] = n % 10;
            if (bits[i] > bits[i - 1]) {
                while (fs < i) {
                    bits[fs++] = 9;
                }
                fs = i;
                //不用考虑第一位，因为第一位不可能是0
                bits[i] = bits[i] == 0 ? 9 : bits[i] - 1;
            }
            i++;
            n /= 10;
        }
        int result = 0;
        int multiplier = 1;
        for (int j = 0; j < i; j++) {
            result += bits[j] * multiplier;
            multiplier *= 10;
        }
        return result;
    }
}
