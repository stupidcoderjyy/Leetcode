package array.spiral_order;

public class L59 {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int left = 0, top = 0, right = n - 1, bottom = n - 1;
        int r = 0, c;
        int i = 1;
        int max = n * n;
        while (i <= max) {
            for (c = left ; c <= right ; c++) {
                result[r][c] = i++;
            }
            c--;
            for (r = ++top ; r <= bottom ; r++) {
                result[r][c] = i++;
            }
            r--;
            for (c = --right ; c >= left ; c--) {
                result[r][c] = i++;
            }
            c++;
            for (r = --bottom ; r >= top ; r--) {
                result[r][c] = i++;
            }
            r++;
            left++;
        }
        return result;
    }
}
