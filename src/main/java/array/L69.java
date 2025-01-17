package array;

public class L69 {
    public int mySqrt(int x) {
        int l = 0, r = 46340;
        while (l <= r) {
            int m = l + ((r - l) >> 1);
            int sq = m * m;
            if (sq > x) {
                r = m - 1;
            } else if (sq < x) {
                l = m + 1;
            } else {
                return m;
            }
        }
        return r;
    }
}
