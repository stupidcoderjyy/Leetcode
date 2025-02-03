package greedy;

public class L45 {
    //优化
    public int jump(int[] nums) {
        int currMax = 0;
        int nextMax = 0;
        int count = 0;
        for (int i = 0; i <= currMax && i < nums.length - 1; i++) {
            nextMax = Math.max(nextMax, i + nums[i]);
            if (i == currMax) {
                currMax = nextMax;
                count++;
                if (nextMax >= nums.length - 1) {
                    break;
                }
            }
        }
        return count;
    }
}
