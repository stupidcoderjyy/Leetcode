package hash_table;

public class L202 {
    public boolean isHappy(int n) {
        int num = n;
        //nextNum(int)至多为三位数
        boolean[] existed = new boolean[1000];
        while (true) {
            num = nextNum(num);
            if (num == 1) {
                return true;
            }
            if (existed[num]) {
                return false;
            }
            existed[num] = true;
        }
    }

    private int nextNum(int n) {
        int num = 0;
        while (n > 0) {
            int i = n % 10;
            num += i * i;
            n /= 10;
        }
        return num;
    }
}
