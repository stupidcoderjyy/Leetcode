package array.prefix_sum;

import java.util.Scanner;

public class KC58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int[] sums = new int[nums.length + 1];
        for (int i = 0; i < nums.length ; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
        while (sc.hasNextInt()) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(sums[l + 1] - sums[r]);
        }
    }
}
