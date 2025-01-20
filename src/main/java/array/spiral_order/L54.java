package array.spiral_order;

import java.util.ArrayList;
import java.util.List;

public class L54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        final int H = matrix.length, W = matrix[0].length;
        int left = 0, top = 0, right = W - 1, bottom = H - 1;
        int r = 0, c = 0;
        int i = 0;
        int max = H * W;
        while (i < max) {
            if (top <= bottom) {
                for (c = left; c <= right; c++) {
                    result.add(matrix[r][c]);
                    i++;
                }
            }
            c--;
            if (left <= right) {
                for (r = ++top; r <= bottom; r++) {
                    result.add(matrix[r][c]);
                    i++;
                }
            }
            r--;
            if (top <= bottom) {
                for (c = --right ; c >= left ; c--) {
                    result.add(matrix[r][c]);
                    i++;
                }
            }
            c++;
            if (left <= right) {
                for (r = --bottom ; r >= top ; r--) {
                    result.add(matrix[r][c]);
                    i++;
                }
            }
            r++;
            left++;
        }
        return result;
    }
}
