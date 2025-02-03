package greedy;

public class L53 {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum > maxSum) {
                maxSum = sum;
            }
            //当sum<0时，后续任何一个元素和sum相加都小于元素本身，故需要舍弃
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}