package array.prefix_sum;

import java.util.Scanner;

public class KC44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), W = sc.nextInt();
        int[][] sums = new int[H + 1][W + 1];
        for (int r = 1; r <= H ; r++) {
            for (int c = 1; c <= W; c++) {
                sums[r][c] = sums[r - 1][c] + sums[r][c - 1] - sums[r - 1][c - 1] + sc.nextInt();
            }
        }
        int minDelta = Integer.MAX_VALUE;
        for (int r = 1; r <= H - 1; r++) {
            minDelta = Math.min(minDelta, Math.abs(sums[H][W] - (sums[r][W] << 1)));
        }
        for (int c = 1; c <= W - 1; c++) {
            minDelta = Math.min(minDelta, Math.abs(sums[H][W] - (sums[H][c] << 1)));
        }
        System.out.println(minDelta);
    }
}
