package array.binary_search;

public class L367 {
    public boolean isPerfectSquare(int num) {
        int l = 0, r = 46340;
        while (l <= r) {
            int m = l + ((r - l) >> 1);
            int sq = m * m;
            if (sq > num) {
                r = m - 1;
            } else if (sq < num) {
                l = m + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
