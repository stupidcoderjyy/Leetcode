package greedy;

public class L376 {
    //遇到递增子列时，保留第一位；遇到递减子列，保留最后一位
    public int wiggleMaxLength(int[] nums) {
        int count = 1;
        int i = 1;
        L1:
        while (i < nums.length) {
            if (nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            if (nums[i] > nums[i - 1]) {
                count++;
                do {
                    if (++i == nums.length) {
                        break L1;
                    }
                } while (nums[i] >= nums[i - 1]);
            }
            if (nums[i] < nums[i - 1]) {
                count++;
                do {
                    if (++i == nums.length) {
                        break L1;
                    }
                } while (nums[i] <= nums[i - 1]);
            }
        }
        return count;
    }
}
